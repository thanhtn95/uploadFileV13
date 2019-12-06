package com.example.uploadfilev13.service;

import com.example.uploadfilev13.model.pic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PicService {
    Page<pic> findAll(Pageable pageable);
    pic findById(int id);
    void save(pic pic);
    void delete(int id);
}
