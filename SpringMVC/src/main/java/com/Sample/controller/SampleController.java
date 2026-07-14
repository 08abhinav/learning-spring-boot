package com.Sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sample.Model.Sample;
import com.Sample.Service.SampleService;

@RestController
public class SampleController {
	
	@Autowired
	SampleService service;
	
	@RequestMapping("/samples")
	public List<Sample> getSamples(){
		return service.getSamples();
	}
}
