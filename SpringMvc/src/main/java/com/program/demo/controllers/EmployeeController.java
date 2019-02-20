package com.program.demo.controllers;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.program.demo.model.Employee;
import com.program.demo.dao.EmployeeDAO;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	@GetMapping(value = "/register")
    public String openForm(Model model)
    {
         Employee employee = new Employee();
         model.addAttribute("employee", employee);
         return "addEmp";
    }
	
	@PostMapping(value="/submit")
    public String setup(@ModelAttribute("employee") Employee employee)
    {	
	employeeDAO.insert(employee);
         return "success";
    }
	
}
