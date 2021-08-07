/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.akira.repository;

import com.company.akira.model.Hospital;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author User
 */

public interface HospitalRepository extends CrudRepository<Hospital, Long>{


    Hospital findById(Integer id);
    
    
}
