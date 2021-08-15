package com.mpec.quanlysinhvien.service;

import com.mpec.quanlysinhvien.entiies.MonHoc;
import com.mpec.quanlysinhvien.entiies.SinhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface MonHocService {

    Page<MonHoc> findAll(Pageable pageable);

    Page<MonHoc> search(String text, Float tinChi, Pageable pageable);

    Optional<MonHoc> findById(int id);

    Optional<MonHoc> save(MonHoc monHoc);

    Optional<MonHoc> update (MonHoc monHoc);

    Boolean delete(int id);


}
