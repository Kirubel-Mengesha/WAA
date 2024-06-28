package com.example.mockexam.Repository;

import com.example.mockexam.Entity.Course;
import com.example.mockexam.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByGpaLessThanEqual(Double gpa);

    @Query("SELECT s.courses FROM Student s WHERE s.student_id = :studentId")
    List<Course> findCoursesByStudentId(@Param("studentId") Long studentId);

    @Query("SELECT s FROM Student s JOIN s.courses c JOIN c.courseDetails cd WHERE cd.program = 'MSC' AND s.gpa < :gpa")
    List<Student> findMscStudentsByGpaLessThan(@Param("gpa") Double gpa);
}

