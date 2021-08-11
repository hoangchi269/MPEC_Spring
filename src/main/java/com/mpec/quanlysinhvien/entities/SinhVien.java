package com.mpec.quanlysinhvien.entities;


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
@Table(name = "sinh_vien", schema = "quan_ly_sinh_vien")
public class SinhVien implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ten_sinh_vien")
    private String tenSinhVien;

    @Column(name = "mssv")
    private String maSinhVien;

    @Column(name = "gioi_tinh")
    private String gioiTinh;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "xoa")
    private Boolean xoa;

}
