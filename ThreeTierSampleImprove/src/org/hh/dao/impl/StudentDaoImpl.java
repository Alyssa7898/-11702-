package org.hh.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hh.DButil.DBUtil;
import org.hh.dao.IStudentDao;
import org.hh.entity.Student;

//数据访问层，原子性的增删改查，不可拆
public class StudentDaoImpl implements IStudentDao {
	public boolean isExist(int sno) {//判断此人存不存在
		return queryStudentBySno( sno)==null? false:true;
		 
	}
	
	//根据学号删除学生
	public boolean deleteStudentBySno(int no) {
		
			String sql="delete from address where sno=?";	
			Object[] params= {no};
			return DBUtil.executeUpdate(sql, params);	
	}
	
	//根据学号找人，找到改成student
	public boolean updateStudentBySno(int no,Student student) {
		//PreparedStatement prepareStatement = null;
			
        	String sql="update address set sname=?,sage=?,saddress=? where sno=?";
			Object[] params= {student.getSname(),student.getSage(),student.getSaddress(),no};
		    return DBUtil.executeUpdate(sql, params);
		   
	}
	
	//查询全部学生很多
	public List<Student> queryAllStudents() {//根据学号查人
		//List集合保存全部学生
		PreparedStatement pstmt=null;
		List<Student> students=new ArrayList<>();
		Student student =null;
		ResultSet rs=null;
		try {
			String sql="select * from address";
			 rs=DBUtil.executeQuery(sql, null);
			//rs=pstmt.executeQuery();
		    while(rs.next()) {
		    	int no = rs.getInt("sno");
		    	String name = rs.getString("sname");
		    	int age = rs.getInt("sage");
		    	String address = rs.getString("saddress");
		    	//封装
		    	student=new Student(no,name,age,address);
		    	//加入集合中
		    	students.add(student);
		    } return students;	
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			
				if(rs!=null)
					try {
						rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if(pstmt!=null)
					try {
						pstmt.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				if(DBUtil.connection!=null)
					try {
						DBUtil.connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			} 
		}

    public boolean addStudent(Student student) {
		     
			String sql="insert into address values(?,?,?,?)";
			Object[] params= {student.getSno(),student.getSname(),student.getSage(),student.getSaddress()};
			return DBUtil.executeUpdate(sql, params);
			
    }
	public Student queryStudentBySno(int sno) {//根据学号查人
		Student student =null;
		PreparedStatement pstmt=null;
		//ResultSet rs = null;
		Connection connection=null;
		try {
			String sql="select *from address where sno=?";
			Object[] params= {sno};
			ResultSet rs=DBUtil.executeQuery(sql, params);
			//pstmt=connection.prepareStatement(sql);
		    rs=pstmt.executeQuery();
		    if(rs.next()) {
		    	int no = rs.getInt("sno");
		    	String name = rs.getString("sname");
		    	int age = rs.getInt("sage");
		    	String address = rs.getString("saddress");
		    	//封装
		    	student=new Student(no,name,age,address);
		    } return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			
		}
	}
}
