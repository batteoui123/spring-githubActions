package com.example.demo.Entities;

import com.example.demo.Entities.enums.Branche;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double id;
    private String name;
    private Integer age;
    private Branche branch;
    @ManyToOne
    @JoinColumn
    private  School school;

}
