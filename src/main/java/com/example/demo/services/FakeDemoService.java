package com.example.demo.services;

import com.example.demo.utils.TimeLogger;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("fakeDemoService")
public class FakeDemoService implements DemoService {

	@Override
	@TimeLogger
	public String something() {
		for(int i = 1; i < 10000000; i++) {

		}
		return "Fake Something";
	}

}
