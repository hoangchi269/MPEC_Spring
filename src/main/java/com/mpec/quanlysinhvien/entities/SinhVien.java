package com.mpec.quanlysinhvien.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("ten_sinh_vien")
    private String tenSinhVien;

    @Column(name = "mssv")
    @JsonProperty("ma_sinh_vien")
    private String maSinhVien;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @Column(name = "gioi_tinh")
    private String gioiTinh;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "xoa")
    private Boolean xoa;

}
