package com.greatlearning.StudentManagementSpring.service;

import java.util.List;

//import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.greatlearning.StudentManagementSpring.entity.Student;
import com.greatlearning.StudentManagementSpring.repository.StudentRepository;

/*import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
*/

@Service
public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> students=studentRepository.findAll();
		return students;
	}

	@Override
	public Student findById(int theId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(theId).get();
	}

	@Override
	public void save(Student theStudent) {
		// TODO Auto-generated method stub
		studentRepository.save(theStudent);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(theId);
	}
	

}








