package com.mpec.quanlysinhvien.controller;

import com.mpec.quanlysinhvien.entiies.Sach;
import com.mpec.quanlysinhvien.entiies.SinhVien;
import com.mpec.quanlysinhvien.service.SachService;
import com.mpec.quanlysinhvien.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/sach")
public class SachController {

    @Autowired
    SinhVienService sinhVienService;

    @Autowired
    SachService sachService;


    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Sach sach,
                                  @RequestParam("sinh_vien_id") int sinhVienId){
        return sinhVienService.findById(sinhVienId)
                .map(sinhVien1 -> {
                    sach.setSinhVien(sinhVien1);
                    sachService.save(sach);
                    return ResponseEntity.ok("sussces");
                }).orElse(ResponseEntity.ok("false"));
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestParam("sinh_vien_id") int sinhVienId,
                                    @RequestParam("ten_sach") String tenSach,
                                    @RequestParam("ngay_muon") String ngayMuon,
                                    @RequestParam("sach_id") int sachId) {
        return sachService.findById(sachId)
                .map(sach -> {
                    return sinhVienService.findById(sinhVienId)
                            .map(sinhVien -> {
                                sach.setTenSach(tenSach);
                                sach.setNgayMuon(ngayMuon);
                                sach.setSinhVien(sinhVien);
                                sachService.save(sach);
                                return ResponseEntity.ok("sussces");
                            }).orElse(ResponseEntity.ok("sinhVienId notFound"));
                }).orElse(ResponseEntity.ok("sachId notFound"));
    }
}
