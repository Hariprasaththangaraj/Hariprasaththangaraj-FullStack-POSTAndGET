package com.hariprasathcodes.studentapplication.service;

import com.hariprasathcodes.studentapplication.model.Student;
import com.hariprasathcodes.studentapplication.model.StudentEntity;
import com.hariprasathcodes.studentapplication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student saveDetails(Student student){

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(student.getId());
        studentEntity.setName(student.getName());
        studentEntity.setAddress(student.getAddress());
        studentRepository.save(studentEntity);
        return null;
    }

    @Override
    public List<StudentEntity> getStudentDetails() {
        return studentRepository.findAll();
    }


}
