package com.mpec.quanlysinhvien.repository;

import com.mpec.quanlysinhvien.entities.SinhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhVienRepo extends JpaRepository<SinhVien, Integer> {

    @Query(value = "from SinhVien sv where sv.xoa = false")
    Page<SinhVien> findAll(Pageable pageable);
}
