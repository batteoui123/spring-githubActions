package com.example.demo.Services;



import com.example.demo.DTO.SchoolDTO;
import com.example.demo.Mapper.SchoolMapper;
import com.example.demo.Repositories.SchoolRepo;
import com.example.demo.Services.ServicesImp.SchoolIml;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService implements SchoolIml {
    private final SchoolRepo schoolRepo;
    private final SchoolMapper schoolMapper;
    public SchoolService(SchoolRepo schoolRepo, SchoolMapper schoolMapper) {
        this.schoolRepo = schoolRepo;
        this.schoolMapper = schoolMapper;
    }
    @Override
    public List<SchoolDTO> getSchools() {
        return schoolRepo.findAll().stream().map(s-> schoolMapper.toDTO(s)).collect(Collectors.toList());
    }

    @Override
    public SchoolDTO createSchool(SchoolDTO schoolDTO) {
        return schoolMapper.toDTO(schoolRepo.save(schoolMapper.toEntity(schoolDTO))) ;
    }
}
