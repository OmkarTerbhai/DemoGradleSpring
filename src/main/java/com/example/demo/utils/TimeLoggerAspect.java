package com.example.demo.utils;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class TimeLoggerAspect {

	@Around("@annotation(TimeLogger)")
	public void demo(ProceedingJoinPoint jp) {
		long time1 = System.currentTimeMillis();

		try {
			jp.proceed();
		}
		catch (Throwable t) {
			log.error("Something went wrong while executing join point");
		}
		finally {
			long time2 = System.currentTimeMillis();
			long executionTime = time2 - time1;

			System.out.println("Executed in: " + executionTime);
		}
	}
}
