package com.mpec.quanlysinhvien.service;

import com.mpec.quanlysinhvien.entities.SinhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SinhVienService {

    Page<SinhVien> findAll(Pageable pageable);

}
