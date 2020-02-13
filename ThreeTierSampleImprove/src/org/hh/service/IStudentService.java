package org.hh.service;

import java.util.List;

import org.hh.entity.Student;

public interface IStudentService{
	public boolean addStudent(Student student);

	public boolean deleteStudentBySno(int sno);

	public boolean updateStudentBySno(int sno, Student student) ;

//����ѧ�Ų�ѯһ����
	public Student queryStudentBySno(int sno) ;

//��ѯȫ��ѧ��
	public List<Student> queryAll();
}
