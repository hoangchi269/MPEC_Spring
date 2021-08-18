package com.mpec.quanlysinhvien.repository;

import com.mpec.quanlysinhvien.entiies.MonHoc;
import com.mpec.quanlysinhvien.entiies.Sach;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface SachRepo extends JpaRepository<Sach, Integer> {

    @Query(value = "from Sach s where s.xoa = false")
    Page<Sach> findAll(Pageable pageable);

    @Query(value = " from Sach sach where 1=1 and " +
            " (?1 is null or sach.tenSach like concat('%',?1,'%')) " +
            " and sach.xoa = false ")
    Page<Sach> search(String tenSach, Pageable pageable);

    @Query(value = "from Sach sach where sach.id = ?1 and sach.xoa = false ")
    Optional<Sach> findById(int id);

    @Modifying
    @Transactional
    @Query(value ="update Sach s set s.xoa = true where s.id = ?1" )
    Integer delete(int id);
}
