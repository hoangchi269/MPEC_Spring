package com.mpec.quanlysinhvien.controller;

import com.mpec.quanlysinhvien.entiies.SinhVien;
import com.mpec.quanlysinhvien.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/v1/sinh-vien")
public class SinhVienController {

    @Autowired
    SinhVienService sinhVienService;

    @GetMapping("/find-all")
    public ResponseEntity<?> findAllSinhVien(){
        Pageable pageable = PageRequest.of(0,10);
        Page<SinhVien> sinhViens = sinhVienService.findAll(pageable);
        return ResponseEntity.ok(sinhViens);
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam(name = "text") String text,
                                    @RequestParam (name = "page") Integer page,
                                    @RequestParam(name = "size") Integer size){

        Pageable pageable = PageRequest.of(page,size);
        Page<SinhVien> sinhViens = sinhVienService.search(text,pageable);
        return ResponseEntity.ok(sinhViens);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable(name = "id") int id){
        Optional<SinhVien> sinhVienOptional = sinhVienService.findById(id);
        if(sinhVienOptional.isPresent()){
            return ResponseEntity.ok(sinhVienOptional.get());
        }
        else {
            return ResponseEntity.ok(Optional.empty());
        }
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody SinhVien sv){
        Optional<SinhVien> sinhVien = sinhVienService.save(sv);
        if(sinhVien.isPresent()){
            return ResponseEntity.ok("success");
        }
        else{
            return ResponseEntity.ok("fail");
        }
    }

    @PostMapping("/update")
    public ResponseEntity<?>update(@RequestBody SinhVien sv){
        Optional<SinhVien> sinhVien = sinhVienService.update(sv);
        if(sinhVien.isPresent()){
            return ResponseEntity.ok("success");
        }
        else{
            return ResponseEntity.ok("fail");
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?>delete(@PathVariable(name = "id") int id){
        return sinhVienService.delete(id)?ResponseEntity.ok("success"):ResponseEntity.ok("failed");
    }
}
