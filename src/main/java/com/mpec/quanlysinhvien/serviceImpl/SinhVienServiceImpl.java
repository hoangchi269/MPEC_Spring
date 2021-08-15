package com.mpec.quanlysinhvien.serviceImpl;

import com.mpec.quanlysinhvien.entiies.SinhVien;
import com.mpec.quanlysinhvien.repository.SinhVienRepo;
import com.mpec.quanlysinhvien.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SinhVienServiceImpl implements SinhVienService {
    @Autowired
    SinhVienRepo sinhVienRepo;
    @Override
    public Page<SinhVien> findAll(Pageable pageable) {
       try{
           return sinhVienRepo.findAll(pageable);
       }
       catch (Exception ex){
           return Page.empty();
       }
    }

    @Override
    public Page<SinhVien> search(String text, Pageable pageable) {
        try{
            return sinhVienRepo.search(text,pageable);
        }
        catch (Exception ex){
            return Page.empty();
        }
    }

    @Override
    public Optional<SinhVien> findById(int id) {
        try {
            return sinhVienRepo.findById(id);
        }
        catch (Exception ex){
            return Optional.empty();
        }
    }

    @Override
    public Optional<SinhVien> save(SinhVien sinhVien) {
        try{
            return Optional.ofNullable(sinhVienRepo.save(sinhVien));
        }
        catch(Exception ex){
            return Optional.empty();
        }
    }

    @Override
    public Optional<SinhVien>update(SinhVien sinhVien) {
        try{
            Optional<SinhVien>sinhVienOptional = findById(sinhVien.getId());
            if(!sinhVienOptional.isPresent()){
                return Optional.empty();
            }
            else {
                return Optional.ofNullable(sinhVienRepo.save(sinhVien));
            }
        }
        catch (Exception ex){
             return Optional.empty();
        }
    }

    @Override
    public Boolean delete(int id) {
        try{
            return sinhVienRepo.delete(id) >= 0;
        }
        catch (Exception ex){
            return  false;
        }
    }

}
