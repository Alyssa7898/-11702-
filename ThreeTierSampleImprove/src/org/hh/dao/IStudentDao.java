package org.hh.dao;


import java.util.List;

import org.hh.entity.Student;

public interface IStudentDao {
	public boolean isExist(int sno) ;
	
	//����ѧ��ɾ��ѧ��
	public boolean deleteStudentBySno(int no);

	
	//����ѧ�����ˣ��ҵ��ĳ�student
	public boolean updateStudentBySno(int no,Student student);
	
	//��ѯȫ��ѧ���ܶ�
	public List<Student> queryAllStudents();
    public boolean addStudent(Student student);
	public Student queryStudentBySno(int sno);
}
	
