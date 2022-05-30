package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MajorDao;
import com.example.demo.entity.Major;
import com.example.demo.service.MajorService;

@Service
public class MajorSeviceImpl implements MajorService {
    @Autowired
    private MajorDao majorDao;

    public List<Major> findAll() {
        return majorDao.findAll();
    }
}
