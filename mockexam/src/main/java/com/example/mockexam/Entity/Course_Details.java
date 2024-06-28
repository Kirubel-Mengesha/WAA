package com.example.mockexam.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long description_id;
    private String course_description;
    private int credit;
    private String program;
    private String last_updated;

    @OneToOne
    @JoinColumn(name = "course_id")
    private Course course;

}
