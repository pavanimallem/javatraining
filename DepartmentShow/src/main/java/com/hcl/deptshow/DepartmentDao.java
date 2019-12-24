package com.hcl.deptshow;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DepartmentDao {
	public void showDepartment() {
		ApplicationContext ctx=new
				ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource=
				(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String cmd="select * from department";
		List dept=null;
		dept=jt.query(cmd, new RowMapper() {

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				String res=rs.getInt("deptno")+ "-----"+
			            rs.getString("dname") + "------"+
						rs.getString("loc") + "-------"+
			            rs.getString("city")+ "--------"+
						rs.getString("head");
				return res;
			}
			
		});
		for (Object object : dept) {
			System.out.println(object);
		}
	}

}
