package com.whitespace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.whitespace.entity.Doing;
import com.whitespace.repo.DoRepo;
import com.whitespace.repo.DoingRepo;

@Controller
public class IndexController {
	@Autowired
	DoRepo doRepository;
	
	@Autowired
	DoingRepo doingRepository;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("todo",doRepository.findAll());
		

		return "/index";
	}


}
