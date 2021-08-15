package com.mpec.quanlysinhvien.repository;

import com.mpec.quanlysinhvien.entiies.MonHoc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface MonHocRepo extends JpaRepository<MonHoc,Integer> {

    @Query(value = "from MonHoc monHoc where monHoc.xoa = false")
    Page<MonHoc>findAll(Pageable pageable);

    @Query(value = " from MonHoc monHoc where 1=1 and " +
            " (?1 is null or monHoc.tenMonHoc like concat('%',?1,'%')) " +
            " and (?2 is null or  monHoc.soTinChi = ?2) " +
            " and monHoc.xoa = false ")
    Page<MonHoc> search(String text,Float tinChi,Pageable pageable);


    @Query(value = "from MonHoc monHoc where monHoc.id = ?1 and monHoc.xoa = false ")
    Optional<MonHoc> findById(int id);

    @Modifying
    @Transactional
    @Query(value ="update MonHoc mh set mh.xoa = true where mh.id = ?1" )
    Integer delete(int id);
}
//    @Query(nativeQuery = true,
//            value = "select * from mon_hoc mh where " +
//                    " (?1 is null or mh.ten_mon_hoc like concat('%',?1,'%')) " +
//                    " and (?2 = 0.0 or mh.so_tin_chi = ?2) " +
//                    " and mh.xoa = false")