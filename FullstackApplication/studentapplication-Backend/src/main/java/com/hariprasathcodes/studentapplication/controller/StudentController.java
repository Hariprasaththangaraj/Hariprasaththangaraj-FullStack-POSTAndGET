package com.hariprasathcodes.studentapplication.controller;

import com.hariprasathcodes.studentapplication.model.Student;
import com.hariprasathcodes.studentapplication.model.StudentEntity;
import com.hariprasathcodes.studentapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService studentService;

        @PostMapping("/save")
        public ResponseEntity<Student> studentSave(@RequestBody Student student) {
            Student studentDetails  = studentService.saveDetails(student);
            return new ResponseEntity<>(studentDetails,HttpStatus.OK);
        }

        @GetMapping("/getStudentList")
        public List<StudentEntity> studentSave() {
                 return studentService.getStudentDetails();
        }


}
