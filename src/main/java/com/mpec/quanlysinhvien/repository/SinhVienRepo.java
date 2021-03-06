package com.mpec.quanlysinhvien.repository;


import com.mpec.quanlysinhvien.entiies.SinhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface SinhVienRepo extends JpaRepository<SinhVien, Integer> {

    @Query(value = "from SinhVien sv where sv.xoa = false")
    Page<SinhVien> findAll(Pageable pageable);

    @Query(value = "from SinhVien sv where(" +
            "sv.tenSinhVien like concat('%',?1,'%')" +
            "or sv.maSinhVien like concat('%',?1,'%')" +
            ")" +
            "and sv.xoa = false")
    Page<SinhVien> search(String text, Pageable pageable);

    @Query(value = "from SinhVien sv where sv.id = ?1 and sv.xoa = false ")
    Optional<SinhVien> findById(int id);

    @Modifying
    @Transactional
    @Query(value ="update SinhVien  sv set sv.xoa = true where sv.id = ?1" )
    Integer delete(int id);


}
