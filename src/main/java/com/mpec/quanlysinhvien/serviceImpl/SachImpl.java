package com.mpec.quanlysinhvien.serviceImpl;

import com.mpec.quanlysinhvien.entiies.Sach;
import com.mpec.quanlysinhvien.entiies.SinhVien;
import com.mpec.quanlysinhvien.repository.SachRepo;
import com.mpec.quanlysinhvien.service.SachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SachImpl implements SachService {

    @Autowired
    SachRepo sachRepo;

    @Override
    public Page<Sach> findAll(Pageable pageable) {
        try {
            return sachRepo.findAll(pageable);
        }catch (Exception ex){
            return Page.empty();
        }
    }

    @Override
    public Page<Sach> search(String tenSach, Pageable pageable) {
        try {
            return sachRepo.search(tenSach, pageable);
        }catch (Exception ex) {
            return Page.empty();
        }
    }

    @Override
    public Optional<Sach> findById(int id) {
        try{
            return sachRepo.findById(id);
        }catch (Exception ex) {
            return Optional.empty();
        }
    }

    @Override
    public Optional<Sach> save(Sach sach) {
        try {
            return Optional.ofNullable(sachRepo.save(sach));
        }catch (Exception ex) {
            return Optional.empty();
        }
    }

    @Override
    public Optional<Sach> update(Sach sach) {
        try {
            Optional<Sach> sachOptional = findById(sach.getId());
            if(!sachOptional.isPresent()){
                return Optional.empty();
            }
            else {
                return Optional.ofNullable(sachRepo.save(sach));
            }
        }catch (Exception ex) {
            return Optional.empty();
        }
    }

    @Override
    public Boolean delete(int id) {
        try{
            Boolean rs=  sachRepo.delete(id) >= 0;
            return rs;
        }
        catch (Exception ex){
            return  false;
        }
    }
}
