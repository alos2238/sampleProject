package com.study.sampleProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.study.sampleProject.service.SampleService;

@Controller
public class SampleController {
	
	@Autowired
	SampleService sampleService;
	
	@GetMapping("/")
	public String goIndex() {
		System.out.println(sampleService.getSampleData());
		return "/index";
	}
}
