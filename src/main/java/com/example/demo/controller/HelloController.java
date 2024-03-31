package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.utils.TimeLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.DemoService;
import com.example.demo.services.FakeDemoService;
import com.example.demo.utils.Demo;

@RestController
public class HelloController {
	
	@Qualifier("fakeDemoService")
	@Autowired
	DemoService ds;
	
	@Qualifier("anotherTodoService")
	@Autowired
	DemoService ds2;
	    List<Demo> li = new ArrayList<>();
	    
	

		@GetMapping("/omkar")
		public String getDemos() {
			System.out.println(ds.something());
			return "Hello in Russian";
		}
		
		@GetMapping("/omkar2")
		public String getDemos2() {
			return ds2.something();
		}
}
