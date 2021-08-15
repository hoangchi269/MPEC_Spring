package com.mpec.quanlysinhvien.controller;

import com.mpec.quanlysinhvien.entiies.MonHoc;
import com.mpec.quanlysinhvien.entiies.SinhVien;
import com.mpec.quanlysinhvien.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/mon-hoc")
public class MonHocController  {
    @Autowired
    MonHocService monHocService;

    @GetMapping("/find-all")
    ResponseEntity<?> findAllMonHoc(){
        Pageable pageable = PageRequest.of(0,2);
        Page<MonHoc> monHocs = monHocService.findAll(pageable);
        return ResponseEntity.ok(monHocs);
    }

    @GetMapping("/search")
    ResponseEntity<?> search(@RequestParam (name = "text", required = false, defaultValue = "") String text,
                             @RequestParam(name = "tinChi", required = false) Float tinChi,
                             @RequestParam(name = "page") Integer page,
                             @RequestParam(name = "size") Integer size){
        Pageable pageable = PageRequest.of(page,size);
        Page<MonHoc> monHocs = monHocService.search(text,tinChi,pageable);
        return ResponseEntity.ok(monHocs);
    }

    @GetMapping("/find/{id}")
    ResponseEntity<?> findById(@PathVariable(name = "id") int id){
        Optional<MonHoc> monHocOptional= monHocService.findById(id);
        if(monHocOptional.isPresent()){
            return ResponseEntity.ok(monHocOptional.get());
        }
        else{
            return ResponseEntity.ok(Optional.empty());
        }
    }


    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody MonHoc mh){
        Optional<MonHoc> monHoc = monHocService.save(mh);
        if(monHoc.isPresent()){
            return ResponseEntity.ok("success");
        }
        else{
            return ResponseEntity.ok("fail");
        }
    }

    @PostMapping("/update")
    public ResponseEntity<?>update(@RequestBody MonHoc mh){
        Optional<MonHoc> monHoc = monHocService.update(mh);
        if(monHoc.isPresent()){
            return ResponseEntity.ok("success");
        }
        else{
            return ResponseEntity.ok("fail");
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?>delete(@PathVariable(name = "id") int id){
        return monHocService.delete(id)?ResponseEntity.ok("success"):ResponseEntity.ok("failed");
    }
}
