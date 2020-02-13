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

//���ݷ��ʲ㣬ԭ���Ե���ɾ�Ĳ飬���ɲ�
public class StudentDaoImpl implements IStudentDao {
	public boolean isExist(int sno) {//�жϴ��˴治����
		return queryStudentBySno( sno)==null? false:true;
		 
	}
	
	//����ѧ��ɾ��ѧ��
	public boolean deleteStudentBySno(int no) {
		
			String sql="delete from address where sno=?";	
			Object[] params= {no};
			return DBUtil.executeUpdate(sql, params);	
	}
	
	//����ѧ�����ˣ��ҵ��ĳ�student
	public boolean updateStudentBySno(int no,Student student) {
		//PreparedStatement prepareStatement = null;
			
        	String sql="update address set sname=?,sage=?,saddress=? where sno=?";
			Object[] params= {student.getSname(),student.getSage(),student.getSaddress(),no};
		    return DBUtil.executeUpdate(sql, params);
		   
	}
	
	//��ѯȫ��ѧ���ܶ�
	public List<Student> queryAllStudents() {//����ѧ�Ų���
		//List���ϱ���ȫ��ѧ��
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
		    	//��װ
		    	student=new Student(no,name,age,address);
		    	//���뼯����
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
	public Student queryStudentBySno(int sno) {//����ѧ�Ų���
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
		    	//��װ
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
