package com.example.mockexam.Controller;

import com.example.mockexam.Entity.Course;
import com.example.mockexam.Entity.Student;
import com.example.mockexam.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        studentService.deleteById(id);
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        return studentService.update(id, student);
    }

    @GetMapping("/{id}/courses")
    public List<Course> getCoursesByStudentId(@PathVariable Long id) {
        return studentService.findCoursesByStudentId(id);
    }

    @GetMapping("/gpa/{gpa}")
    public List<Student> findByGpaLessThanEqual(@PathVariable Double gpa) {
        return studentService.findByGpaLessThanEqual(gpa);
    }

    @GetMapping("/msc/gpa/{gpa}")
    public List<Student> findMscStudentsByGpaLessThan(@PathVariable Double gpa) {
        return studentService.findMscStudentsByGpaLessThan(gpa);
    }




}
