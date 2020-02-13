package org.hh.service.impl;

import java.util.List;

import org.hh.dao.IStudentDao;
import org.hh.dao.impl.StudentDaoImpl;
import org.hh.entity.Student;
import org.hh.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	IStudentDao studentDao = new StudentDaoImpl();

	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		if (!studentDao.isExist(student.getSno())) {
			studentDao.addStudent(student);
			return true;
		} else {
			System.out.println("ѧ���ظ������ʧ��");
			return false;
		}
	}

	public boolean deleteStudentBySno(int sno) {
		if (studentDao.isExist(sno)) {
			return studentDao.deleteStudentBySno(sno);
		}
		return false;

	}

	public boolean updateStudentBySno(int sno, Student student) {
		if (studentDao.isExist(sno)) {
			return studentDao.updateStudentBySno(sno, student);
		}
		return false;
	}

//����ѧ�Ų�ѯһ����
	public Student queryStudentBySno(int sno) {
		return studentDao.queryStudentBySno(sno);
	}

//��ѯȫ��ѧ��
	public List<Student> queryAll() {
		return studentDao.queryAllStudents();
	}
}