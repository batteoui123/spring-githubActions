package com.example.demo.Controllers;



import com.example.demo.DTO.SchoolDTO;
import com.example.demo.Entities.School;
import com.example.demo.Services.SchoolService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/school")
public class SchoolController {
    private final SchoolService schoolService;
    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping("/all")
    public List<SchoolDTO>  getAll() {
        return schoolService.getSchools();

    }

    @PostMapping("/add")
    public ResponseEntity<SchoolDTO> add(@RequestBody SchoolDTO schoolDTO) {
        return ResponseEntity.ok(schoolService.createSchool(schoolDTO));
    }
}
