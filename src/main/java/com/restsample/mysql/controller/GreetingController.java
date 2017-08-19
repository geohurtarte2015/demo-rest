package com.restsample.mysql.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restsample.mysql.model.Customer;
import com.restsample.mysql.model.Greeting;
import com.restsample.mysql.service.CustomerService;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value="/greeting", method=RequestMethod.GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
 
    @RequestMapping(value="/greetings/", method=RequestMethod.GET)
    public ArrayList<Greeting> listGreeting(){
    	Greeting gretting1 = new Greeting(1,"Giovanni");
    	Greeting gretting2 = new Greeting(2,"Esturado");
    	Greeting gretting3 = new Greeting(3,"Cristian");
    	
    	List<Greeting> listGreetings = new ArrayList<Greeting>();
    	
    	listGreetings.add(gretting1);
    	listGreetings.add(gretting2);
    	listGreetings.add(gretting3);
    	
    	Customer customer = new Customer("Edgar", "Hurtarte", 32);
		customerService.save(customer);
		customerService.findAll();
    	
    	return (ArrayList<Greeting>) listGreetings; 
    }
    
}
