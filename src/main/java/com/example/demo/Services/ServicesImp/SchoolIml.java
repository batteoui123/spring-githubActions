package com.example.demo.Services.ServicesImp;





import com.example.demo.DTO.SchoolDTO;
import com.example.demo.Entities.School;

import java.util.List;

public interface SchoolIml {
     List<SchoolDTO> getSchools();
     SchoolDTO createSchool(SchoolDTO schoolDTO);
}
