package com.example.demo.Repositories;



import com.example.demo.Entities.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepo extends JpaRepository<School, Long> {
    List<School> findAll();


}

