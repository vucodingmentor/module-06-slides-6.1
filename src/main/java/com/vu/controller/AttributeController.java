package com.vu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vu.model.entity.Student;

@Controller
public class AttributeController {

	@GetMapping("/common-attribute")
	public String getCommonAttributes(Model model) {
		Student mai = new Student("Mai Vo", "FullStack Java");
		Student loan = new Student("Loan Nguyen", "FullStack Java");
		
		List<Student> students = new ArrayList<Student>();
		students.add(mai);
		students.add(loan);
		
		model.addAttribute("students", students);
		return "expression/attribute";
	}
}
