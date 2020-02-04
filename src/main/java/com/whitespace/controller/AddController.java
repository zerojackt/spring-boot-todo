package com.whitespace.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whitespace.entity.Do;
import com.whitespace.entity.Doing;
import com.whitespace.entity.Done;
import com.whitespace.repo.DoRepo;
import com.whitespace.repo.DoingRepo;
import com.whitespace.repo.DoneRepo;

@Controller
@RequestMapping("/add")
public class AddController {
	
	@Autowired
	DoRepo doRepository;
	
	@Autowired
	DoneRepo doneRepository;
	
	@Autowired
	DoingRepo doingRepository;
	

	
	@RequestMapping("/do")
	public String addDo(String todo,HttpSession session) {
		Do newDo = new Do(todo);
		doRepository.save(newDo);
		session.setAttribute("sessionUser",newDo);
		
		
		return "redirect:/";
	}
	
	@RequestMapping("/doing/{id}")
	public String addDoing(@PathVariable Long id) {
		Do todo = doRepository.findById(id).get();
		Doing newDoing = new Doing(todo.getTodo());
		doingRepository.save(newDoing);
		doRepository.delete(todo);
		
		return "redirect:/";
	}
	
	
	@RequestMapping("/done/{id}")
	public String addDone(@PathVariable Long id) {
		Doing todoing = doingRepository.findById(id).get();
		Done newDone = new Done(todoing.getTodoing());
		doneRepository.save(newDone);
		doingRepository.delete(todoing);
		
		return "redirect:/";
	}

}
