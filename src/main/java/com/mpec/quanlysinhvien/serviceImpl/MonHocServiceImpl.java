package com.mpec.quanlysinhvien.serviceImpl;

import com.mpec.quanlysinhvien.entiies.MonHoc;
import com.mpec.quanlysinhvien.entiies.SinhVien;
import com.mpec.quanlysinhvien.repository.MonHocRepo;
import com.mpec.quanlysinhvien.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MonHocServiceImpl implements MonHocService {
    @Autowired
    MonHocRepo monHocRepo;
    @Override
    public Page<MonHoc> findAll(Pageable pageable) {

      try{
          return monHocRepo.findAll(pageable);
      }
      catch (Exception ex){
          return Page.empty();
      }
    }

    @Override
    public Page<MonHoc> search(String text, Float tinChi, Pageable pageable) {
      try {
          return monHocRepo.search(text,tinChi,pageable);
      }
      catch (Exception ex){

          return Page.empty();
      }
    }

    @Override
    public Optional<MonHoc> findById(int id) {
        try{
            return monHocRepo.findById(id);
        }
        catch(Exception ex){
            return Optional.empty();
        }
    }

    @Override
    public Optional<MonHoc>save(MonHoc monHoc) {
        try{
            monHoc.setXoa(false);
            return Optional.ofNullable(monHocRepo.save(monHoc));
        }
        catch(Exception ex){
            return Optional.empty();
        }
    }


    @Override
    public Optional<MonHoc>update(MonHoc monHoc) {
        try{
            Optional<MonHoc>monHocOptional = findById(monHoc.getId());
            if(!monHocOptional.isPresent()){
                return Optional.empty();
            }
            else {
                return Optional.ofNullable(monHocRepo.save(monHoc));
            }
        }
        catch (Exception ex){
            return Optional.empty();
        }
    }

    @Override
    public Boolean delete(int id) {
        try{
            return monHocRepo.delete(id) >= 0;
        }
        catch (Exception ex){
            return  false;
        }
    }
}
