package com.mpec.quanlysinhvien.service;

import com.mpec.quanlysinhvien.entiies.SinhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface SinhVienService {

    Page<SinhVien> findAll(Pageable pageable);

    Page<SinhVien> search(String text, Pageable pageable);

    Optional<SinhVien> findById(int id);

    Optional<SinhVien> save(SinhVien sinhVien);

    Optional<SinhVien> update (SinhVien sinhVien);

    Boolean delete(int id);

}
