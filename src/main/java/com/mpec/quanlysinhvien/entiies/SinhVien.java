package com.mpec.quanlysinhvien.entiies;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Entity // Đánh dấu SinhVien là một Entity
@Data   //để không phải viết getter, setter
@AllArgsConstructor  // tạo constructer full tham số
@NoArgsConstructor  // tạo constructer không tham số
@Builder   // buildẻ pattern
@Table(name = "sinh_vien",schema = "quan_ly_sinh_vien")
public class SinhVien implements Serializable {
        @Id // khai báo là ID
        @GeneratedValue(strategy = GenerationType.IDENTITY) //  tự tăng cho ID
        @Column(name = "id")
        private int id; //chỉ cần thằng id mới khai báo nhiều annotation như thế này thôi
    // các trường khác thì chỉ cần @Column
    @Column(name = "ten_sinh_vien") // phải giống tên cột trong db
    private String tenSinhVien;

    @Column(name ="mssv")
    private String maSinhVien;

    @Column(name = "gioi_tinh")
    private String gioiTinh;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "xoa")
    private Boolean xoa;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

}
