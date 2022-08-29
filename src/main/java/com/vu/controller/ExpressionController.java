package com.vu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vu.model.entity.Student;

@Controller
public class ExpressionController {

	@GetMapping("/variable-expression")
	public String getVariableExpression(Model model) {
		model.addAttribute("vuser", "Nguyen Van Teo");
		model.addAttribute("fasttracker", "Le Van Ty");
		return "expression/variable";
	}
	
	@GetMapping("/option-expression")
	public String getOptionExpression(Model model) {
		Student mai = new Student("Mai Vo", "FullStack Java");
		model.addAttribute("student", mai);
		return "expression/option";
	}
}
