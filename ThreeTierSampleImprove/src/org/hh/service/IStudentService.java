package org.hh.service;

import java.util.List;

import org.hh.entity.Student;

public interface IStudentService{
	public boolean addStudent(Student student);

	public boolean deleteStudentBySno(int sno);

	public boolean updateStudentBySno(int sno, Student student) ;

//根据学号查询一个人
	public Student queryStudentBySno(int sno) ;

//查询全部学生
	public List<Student> queryAll();
}
