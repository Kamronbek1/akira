package com.company.akira.service;

import com.company.akira.model.Pharmacy;
import com.company.akira.repository.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PharmacyService {
    @Autowired
    PharmacyRepository repository;

    public Pharmacy findById(Long id){
        return repository.findById(id).get();
    }
}
