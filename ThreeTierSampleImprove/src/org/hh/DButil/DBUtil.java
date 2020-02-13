package org.hh.DButil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hh.entity.Student;

public class DBUtil {// 通用的数据可以帮助类
//通用的增删改
	public static Connection connection = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs=null;
	static String className = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=PIMS";//

	// PreparedStatement prepareStatement = null;

	// int result = -1;
	static String Name = "sa";
	static String Pwd = "123456";

	public static Connection getconnection() throws ClassNotFoundException, SQLException {
		Class.forName(className);
		return DriverManager.getConnection(dbURL, Name, Pwd);
	}

	public static PreparedStatement createStatement(String sql, Object[] params) throws ClassNotFoundException, SQLException  {
		pstmt = getconnection().prepareStatement(sql);
		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				pstmt.setObject(i + 1, params[i]);
			}

		}
		return pstmt;
	}
	public static void closeAll(ResultSet rs,PreparedStatement pstmt,Connection connection) throws SQLException {
		if(rs!=null) {
			rs.close();
		}
		if(pstmt!=null) {
			pstmt.close();
		}
		if(connection!=null) {
			connection.close();
		}
	}

	public static boolean executeUpdate(String sql, Object[] params)  {
		
			//getconnection();
			//pstmt=getconnection().prepareStatement(sql);
			
				try {
					pstmt=createStatement(sql, params);
					int count=pstmt.executeUpdate();
					 if(count>0) {
						   return true;
					   }else {
						   return false;
					   }
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					
					e.printStackTrace();
					return false;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
			
	}

//通用的查
	public static ResultSet executeQuery(String sql, Object[] params)  {// 根据学号查人
		// Student student =null;

		//PreparedStatement pstmt = null;
		//ResultSet rs = null;
	
			//getconnection();
			
				try {
					pstmt=createStatement(sql, params);
				     rs = pstmt.executeQuery();
				     return rs;
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
				
				
}
}
