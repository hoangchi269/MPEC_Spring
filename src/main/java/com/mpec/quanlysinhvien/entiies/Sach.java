package com.mpec.quanlysinhvien.entiies;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "sach", schema = "quan_ly_sinh_vien")
public class Sach implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "ten_sach")
    private String tenSach;

    @Column(name = "ngay_muon")
    private String ngayMuon;

    @ManyToOne
    @JoinColumn(name = "sinh_vien_id")
    private SinhVien sinhVien;

    @Column(name = "xoa")
    private Boolean xoa;


}
