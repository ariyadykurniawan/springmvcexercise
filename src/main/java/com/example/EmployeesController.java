/**
 * 
 */
package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author trainee
 *
 */
@Controller
public class EmployeesController {
	
	
	List<Employee> list = new ArrayList<Employee>();
	
	@RequestMapping(value="/employees", method=RequestMethod.GET)
    @ResponseBody
    
    public List<Employee> getEmployee(@RequestParam String gender) {
		list.add( new Employee("ariyady","male"));
		list.add( new Employee("rina","female"));
		
		List<Employee> res = list.stream().filter(e -> e.gender.equalsIgnoreCase(gender)).collect(Collectors.toList());
        return res;
    }
	
	@RequestMapping(value="/employees", method=RequestMethod.POST)
    @ResponseBody
	public Employee employeePost(@RequestBody Employee emp) {
		list.add(new Employee(emp.name, emp.gender));
		 
	    return emp;
	}
}
