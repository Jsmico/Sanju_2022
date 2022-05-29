package employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import employee.service.EmployeeService;
import employee1.bean.employeeDetails;

@RestController
public class employeeController {
	@Autowired
	EmployeeService employeeService;
	@PostMapping(value="/showmessage")
	employeeDetails createEmployeeDetails(@RequestBody employeeDetails details)
	{
		employeeDetails e = employeeService.addemployee(details);// calling service from controller
		return e;
	}

}
