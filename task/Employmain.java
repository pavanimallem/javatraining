package com.hcl.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;


public class Employmain {
	public static void main(String[] args) {
		
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("options");
			System.out.println(".......");
			System.out.println("1. Add Employ");
			System.out.println("2. Show Employ");
			System.out.println("3.Search Employ");
			System.out.println("4.writer Customer file");
			System.out.println("5.read Customer file");
			System.out.println("6. Exit");
			System.out.println("enter your choise ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				addEmploy();
				break;
			case 2:
				showEmploy();
				break;
			case 3:
				searchEmploy();
				break;
			case 4:
				writeEmployFile();
				break;
			case 5:
				readEmployFile();
				break;
			case 6:
				return;
			
			default :
				System.out.println("Invalid input");
			}
					
			}while(choice !=6);
	}
	private static void readEmployFile() {
		new EmployDAO().readEmployFileDao();
		}
	private static void writeEmployFile() {
		new EmployDAO().writeEmployFileDao();
			
		}
	private static void searchEmploy() {
		int empId;
		System.out.println("Enter emp Id ");
		Scanner sc = new Scanner(System.in);
		empId=sc.nextInt();
		EmployDAO obj = new EmployDAO();
		Employ employ = obj.searchEmployDao(empId);
		System.out.println(employ);
		
	}
		
	private static void showEmploy() {
		EmployDAO obj = new EmployDAO();
		List<Employ> employees = obj.showEmployDao();
		System.out.println("Employ No      Employ Name      Department      Phone      Email                      DateOfJoin    LeaveBalance      ManagerId");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		for (Employ employ : employees) {
			System.out.println(employ);
		}
	
		
	}
		public static void addEmploy() {
			SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
			Employ objEmploy=new Employ();
				Scanner sc=new Scanner(System.in);
				System.out.println("enter empno ");
				objEmploy.setEmpId(Integer.parseInt(sc.nextLine()));
				System.out.println("enter emp name ");
				objEmploy.setEmpName(sc.nextLine());
				System.out.println("Enter emp dept ");
				objEmploy.setEmpDepartment(sc.nextLine());
				System.out.println("enter emp phone ");
				objEmploy.setEmpPhone(sc.nextLine());
				System.out.println("enter emp mail ");
				objEmploy.setEmpEmail(sc.nextLine());
				System.out.println("enter empleave balance");
				objEmploy.setEmpLeavebalance(Integer.parseInt(sc.nextLine()));
				System.out.println("enter emp manager id ");
				objEmploy.setEmpManagerId(Integer.parseInt(sc.nextLine()));
				System.out.println("enter emp date of joining (dd/mm/yyyy)");
				try {
					objEmploy.setEmpDateofjoin(sdf.parse(sc.nextLine()));
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				EmployBAL obj=new EmployBAL();
				try {
					boolean res=obj.addEmployBal(objEmploy);
					if(res==true) {
						System.out.println("student Added successfully..");
					}
				} catch (EmployException e) {
					System.out.println(e.getMessage());
				}
				
			}
	}

