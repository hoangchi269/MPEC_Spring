package com.example.mpec.entity;

import java.util.List;

public class Student {

    private int id;

    private String name;

    private String adress;

    private List<DiaChi> diaChi;

    public Student(List<DiaChi> diaChi) {
        this.diaChi = diaChi;
    }

    public List<DiaChi> getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(List<DiaChi> diaChi) {
        this.diaChi = diaChi;
    }

    public Student(int id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
