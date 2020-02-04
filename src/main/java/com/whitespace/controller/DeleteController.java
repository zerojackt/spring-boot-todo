package com.whitespace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whitespace.entity.Do;
import com.whitespace.repo.DoRepo;

@Controller
public class DeleteController {
	
	@Autowired
	DoRepo doRepository;
	
	@RequestMapping("/delete/do/{id}")
	public String deleteDo(@PathVariable Long id) {
		Do thisDo = doRepository.findById(id).get();
		doRepository.delete(thisDo);
		return "redirect:/";
		
	}

}
