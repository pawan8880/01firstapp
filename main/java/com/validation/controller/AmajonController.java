package com.validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.validation.entity.Amajon;
import com.validation.service.AmajonService;

import ch.qos.logback.core.model.Model;



@RestController
public class AmajonController {
	
	@Autowired
	AmajonService amajonService;
	
	
	 public AmajonController(AmajonService amojonService) {
		super();
		this.amajonService = amojonService;
	}


	@PostMapping("/create")
	    public ResponseEntity<Amajon> saveAmajon(@RequestBody @Validated Amajon amajon) {
	        Amajon savedAmajon = amajonService.saveAmajon(amajon);
	        return new ResponseEntity<>(savedAmajon, HttpStatus.CREATED);
	    }
	
	
	
	
	
	
	

}
