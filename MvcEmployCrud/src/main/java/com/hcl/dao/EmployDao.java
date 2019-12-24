package com.hcl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hcl.beans.Employ;

public class EmployDao {
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int delete(int id){  
	    String sql="delete from Employ where empno="+id+"";  
	    return template.update(sql);  
	} 
	
	public int update(Employ e){
		String sql="update Employ set name=?,dept=?, desig=?, basic=? where Empno=?";
		int res=template.update(sql, new Object[]{
				e.getName(),
				e.getDept(),
				e.getDesig(),
				e.getBasic(),
				e.getEmpno()
		});
		return res;
	}
	public Employ getEmpById(int id){
		String sql="select * from Employ where empno=?";
		return template.queryForObject(sql, new Object[]{id},
				new BeanPropertyRowMapper<Employ>(Employ.class));
	}
	public int save(Employ p){
		String sql="insert into Employ values(?,?,?,?,?)";
		int res=template.update(sql, new Object[]{p.getEmpno(),
				p.getName(),
				p.getDept(),
				p.getDesig(),
				p.getBasic()
		});
		return res;
	}
public List<Employ> getEmployees(){
	String cmd="select * from Employ";
	return template.query(cmd, new RowMapper<Employ>() {
		

		public Employ mapRow(ResultSet rs, int arg1) throws SQLException {
			Employ e=new Employ();
			e.setEmpno(rs.getInt("empno"));
			e.setName(rs.getString("name"));
			e.setDept(rs.getString("dept"));
			e.setDesig(rs.getString("desig"));
			e.setBasic(rs.getInt("basic"));
			return e;
		}
		});
	
}
}
