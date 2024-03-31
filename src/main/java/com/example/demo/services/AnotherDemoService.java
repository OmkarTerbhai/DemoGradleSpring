package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service("anotherTodoService")
public class AnotherDemoService implements DemoService {

	@Override
	public String something() {
		for(int i = 1; i < 10000000; i++) {

		}
		return "Another Something";
	}

}
