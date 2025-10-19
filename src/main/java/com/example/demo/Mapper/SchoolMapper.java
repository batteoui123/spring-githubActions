package com.example.demo.Mapper;

import com.example.demo.DTO.SchoolDTO;
import com.example.demo.Entities.School;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SchoolMapper {
   public SchoolDTO toDTO(School school) {
       return new SchoolDTO(school.getSchoolName(),school.getSchoolAddress(),school.getSchoolDate());
   }
   public School toEntity(SchoolDTO schoolDTO) {
       School school = new School();
       school.setSchoolName(schoolDTO.getName());
       school.setSchoolAddress(schoolDTO.getAdresse());
       school.setSchoolDate(schoolDTO.getDate());
       return school;
   }
}
