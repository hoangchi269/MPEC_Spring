package com.mpec.quanlysinhvien.serviceImpl;

import com.mpec.quanlysinhvien.entities.SinhVien;
import com.mpec.quanlysinhvien.repository.SinhVienRepo;
import com.mpec.quanlysinhvien.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SinhVienServiceImpl implements SinhVienService {

    @Autowired
    SinhVienRepo sinhVienRepo;

    @Override
    public Page<SinhVien> findAll(Pageable pageable) {
        try{
            return sinhVienRepo.findAll(pageable);
        }catch (Exception ex){
            return Page.empty();
        }
    }
}
