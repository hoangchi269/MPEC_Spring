package com.mpec.quanlysinhvien.controller;

import com.mpec.quanlysinhvien.entities.SinhVien;
import com.mpec.quanlysinhvien.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/sinh-vien")
public class SinhVienController {

    @Autowired
    SinhVienService sinhVienService;

    @GetMapping("/find-all")
    public ResponseEntity<?> findAllSinhVien(){
        Pageable pageable  = PageRequest.of(0,10);
        Page<SinhVien> sinhViens = sinhVienService.findAll(pageable);
        return ResponseEntity.ok(sinhViens);
    }
}
