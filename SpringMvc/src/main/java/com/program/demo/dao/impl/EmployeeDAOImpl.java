package com.program.demo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.program.demo.dao.EmployeeDAO;
import com.program.demo.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

		private DataSource dataSource;
		
		public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
		}
		
		public void insert(Employee employee){
			
			String sql = "INSERT INTO EMPLOYEE " +
					"(ID, NAME, DEPT, ADDRESS) VALUES (?, ?, ?, ?)";
			Connection conn = null;
			
			try {
				conn = dataSource.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, employee.getId());
				ps.setString(2, employee.getName());
				ps.setString(3, employee.getDept());
				ps.setString(4, employee.getAddress());
				ps.executeUpdate();
				ps.close();
				
			} catch (SQLException e) {
				throw new RuntimeException(e);
				
			} finally {
				if (conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {}
				}
			}
		}
	}
	

