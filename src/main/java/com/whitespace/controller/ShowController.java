package com.whitespace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whitespace.repo.DoRepo;
import com.whitespace.repo.DoingRepo;
import com.whitespace.repo.DoneRepo;

@Controller
@RequestMapping("/show")
public class ShowController {
	
	@Autowired
	private DoRepo doRepository;
	
	@Autowired
	private DoingRepo doingRepository;
	
	@Autowired
	private DoneRepo doneRepository;
	
	
	@RequestMapping("/doing")
	public String showDoing(Model model) {
		model.addAttribute("todoing",doingRepository.findAll());
	   
		
		return "/show/showDoing";
		
	}
	
	@RequestMapping("/done")
	public String showDone(Model model) {
		model.addAttribute("todone",doneRepository.findAll());
	   
		
		return "/show/showDone";
		
	}
	
	

}
