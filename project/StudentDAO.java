package com.hcl.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	static List<Student> lstStudent = null;
	
	static {
		lstStudent=new ArrayList<Student>();
	}
	
	public String addStudentDao(Student student) {
		lstStudent.add(student);
		return "Student Created Successfully...";
	}
	
	public Student searchStudentDao(int sno) {
		Student objStudent=null;
		for (Student student : lstStudent) {
			if(student.getSno() == sno) {
				objStudent=student;
			}
		}
		return objStudent;
	}
	
	public List<Student> showStudentDao() {
		return lstStudent;
	}
	
	public String updateStudentDao(Student objStudent) {
		Student student=searchStudentDao(objStudent.getSno());
		if(student!=null) {
			for (Student s : lstStudent) {
				if(s.getSno()==objStudent.getSno()) {
					s.setName(objStudent.getName());
					s.setCity(objStudent.getCity());
					s.setCgp(objStudent.getCgp());
				}
			}
			return "Record Updated...";
		} else {
			return "Student No Not Found...";
		}
	}
	
	public String deleteStudentDao(int sno) {
		Student student = searchStudentDao(sno);
		if(student != null) {
			lstStudent.remove(student);
			return "Student Removed...";
		} else {
			return "Student No Not Found...";
		}
	}
	
	public void writeStudentFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/student.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(lstStudent);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readStudentFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/files/student.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			lstStudent =(List<Student>)objin.readObject();
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
