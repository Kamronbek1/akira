package com.company.akira.controller;

import com.company.akira.model.Pharmacy;
import com.company.akira.repository.PharmacyRepository;

public class PharmasyController extends AbstractRestController<Pharmacy, PharmacyRepository> {
    public PharmasyController(PharmacyRepository repo) {
        super(repo);
    }
}
