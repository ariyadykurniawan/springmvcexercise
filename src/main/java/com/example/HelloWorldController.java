/**
 * 
 */
package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
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
public class HelloWorldController {
	//@RequestMapping GET berpasangan dengan @RequestParam digunakan untuk get data
	@RequestMapping(value="/helloget", method=RequestMethod.GET)
    @ResponseBody
    public String helloget(@RequestParam String message) {
        return "<h1>Greetings from Spring Boot using GET Method: "+ message +" !</h1>";
    }
	
	@RequestMapping("/hellojsp")
	public String hello(ModelMap modelMap) {

	    modelMap.addAttribute("message", "Hello Spring from JSP");
	    return "hello";
	}
	
//	public String hello(
//	        @RequestParam(value = "message", defaultValue = "Hello Spring")
//	        String message
//	    ) {
//	        return "Your message: " + message;
//	}
	
	//@RequestMapping POST berpasangan dengan @RequestBody digunakan untuk input data
	@RequestMapping(value="/hellopost", method=RequestMethod.POST)
    @ResponseBody
	public String hellopost(@RequestBody String message) {

	    return "Your message using POST Method: " + message;
	}
	
//	@RequestMapping PUT berpasangan dengan @PathVariable digunakan untuk edit/delete data
	@RequestMapping(value = "/helloput/{message}", method=RequestMethod.PUT)
	@ResponseBody
	public String helloput(@PathVariable String message) {
	    // ...
	    return "Your message Using PUT Method: " + message;
	}
}
