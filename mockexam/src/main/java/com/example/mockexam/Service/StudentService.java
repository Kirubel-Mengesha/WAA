package com.example.mockexam.Service;

import com.example.mockexam.Entity.Course;
import com.example.mockexam.Entity.Student;
import com.example.mockexam.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Student update(Long id, Student student) {
        if (studentRepository.existsById(id)) {
            student.setStudent_id(id);
            return studentRepository.save(student);
        } else {
            return null; // or throw exception
        }
    }

    public List<Course> findCoursesByStudentId(Long studentId) {
        return studentRepository.findCoursesByStudentId(studentId);
    }

    public List<Student> findByGpaLessThanEqual(Double gpa) {
        return studentRepository.findByGpaLessThanEqual(gpa);
    }

    public List<Student> findMscStudentsByGpaLessThan(Double gpa) {
        return studentRepository.findMscStudentsByGpaLessThan(gpa);
    }
}

