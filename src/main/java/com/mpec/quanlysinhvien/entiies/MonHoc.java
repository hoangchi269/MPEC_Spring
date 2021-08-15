package com.mpec.quanlysinhvien.entiies;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "mon_hoc", schema = "quan_ly_sinh_vien")
public class MonHoc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "ten_mon_hoc")
    private String tenMonHoc;


    @Column(name = "so_tin_chi")
    private Float soTinChi;

    @Column(name = "xoa")
    private  Boolean xoa;
}
