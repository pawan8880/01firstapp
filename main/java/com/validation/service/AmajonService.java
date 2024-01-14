package com.validation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validation.entity.Amajon;
import com.validation.repo.AmajonRepo;

@Service
public class AmajonService {
	//all logic write here
	@Autowired
	AmajonRepo amjonRepo;
	
	
	 public Amajon saveAmajon(Amajon amajon) {
	        // Additional business logic or validation can be added here
	        return amjonRepo.save(amajon);
	    }
	
	

}
