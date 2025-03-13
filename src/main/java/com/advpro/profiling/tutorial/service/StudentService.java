package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
        return studentCourseRepository.findAll();
    }

    public Optional<Student> findStudentWithHighestGpa() {
        Sort sort = Sort.by(Sort.Direction.DESC, "gpa");
        List<Student> students = studentRepository.findAll(sort);
        return Optional.ofNullable(students.get(0));
    }

    public String joinStudentNames() {
        List<Student> students = studentRepository.findAll();
        List<String> studentNames = new ArrayList<>();
        for (Student student : students) {
            studentNames.add(student.getName());
        }

        String names = String.join(", ", studentNames);
        return names.substring(0, names.length() - 2);
    }
}

