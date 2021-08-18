package com.mpec.quanlysinhvien.service;

import com.mpec.quanlysinhvien.entiies.MonHoc;
import com.mpec.quanlysinhvien.entiies.Sach;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface SachService {

    Page<Sach> findAll(Pageable pageable);

    Page<Sach> search(String tenSach, Pageable pageable);

    Optional<Sach> findById(int id);

    Optional<Sach> save(Sach sach);

    Optional<Sach> update (Sach sach);

    Boolean delete(int id);
}
