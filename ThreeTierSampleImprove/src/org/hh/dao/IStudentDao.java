package org.hh.dao;


import java.util.List;

import org.hh.entity.Student;

public interface IStudentDao {
	public boolean isExist(int sno) ;
	
	//根据学号删除学生
	public boolean deleteStudentBySno(int no);

	
	//根据学号找人，找到改成student
	public boolean updateStudentBySno(int no,Student student);
	
	//查询全部学生很多
	public List<Student> queryAllStudents();
    public boolean addStudent(Student student);
	public Student queryStudentBySno(int sno);
}
	
