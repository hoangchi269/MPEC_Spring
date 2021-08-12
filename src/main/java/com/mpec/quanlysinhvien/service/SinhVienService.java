package com.mpec.quanlysinhvien.service;

import com.mpec.quanlysinhvien.entities.SinhVien;
import com.mpec.quanlysinhvien.entities.SinhVienDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface SinhVienService {

    List<SinhVien> findAll(Pageable pageable);

    Page<SinhVien> search(String text, Pageable pageable);

    Optional<SinhVien> findById(int id, boolean xoa);

    Optional<SinhVien> save(SinhVien sinhVien);

    Optional<SinhVien> update(SinhVienDTO sinhVien);

    Boolean delete(int id);
}
