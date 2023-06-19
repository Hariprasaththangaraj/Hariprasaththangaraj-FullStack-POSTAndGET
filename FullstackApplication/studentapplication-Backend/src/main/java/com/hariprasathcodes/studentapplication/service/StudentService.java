package com.hariprasathcodes.studentapplication.service;

import com.hariprasathcodes.studentapplication.model.Student;
import com.hariprasathcodes.studentapplication.model.StudentEntity;

import java.util.List;

public interface StudentService {
    public Student saveDetails(Student student);

    public List<StudentEntity> getStudentDetails();
}
