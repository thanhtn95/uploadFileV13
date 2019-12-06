package com.example.uploadfilev13.service;

import com.example.uploadfilev13.model.pic;
import com.example.uploadfilev13.repository.PicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class PicServiceImpl implements PicService {
    @Autowired
    private PicRepo picRepo;
    @Override
    public Page<pic> findAll(Pageable pageable) {
        return picRepo.findAll(pageable);
    }

    @Override
    public pic findById(int id) {
        if(picRepo.findById(id).isPresent()){
            return picRepo.findById(id).get();
        }
        return null;
    }

    @Override
    public void save(pic pic) {
        picRepo.save(pic);
    }

    @Override
    public void delete(int id) {
        picRepo.deleteById(id);
    }
}
