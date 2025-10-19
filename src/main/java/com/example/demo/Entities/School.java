package com.example.demo.Entities;




import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class School {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schoolId;
    private String schoolName;
    private String schoolAddress;
    private LocalDate schoolDate;

    @OneToMany(mappedBy ="school", cascade = CascadeType.ALL)
    private List<Student> students=new ArrayList<>();

}
