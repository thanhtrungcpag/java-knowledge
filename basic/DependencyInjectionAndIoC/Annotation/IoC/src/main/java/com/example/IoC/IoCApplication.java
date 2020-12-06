package com.example.IoC;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IoCApplication {

	public static void main(String[] args) {
		// SpringApplication.run(IoCApplication.class, args);
		// read spring config file
		ClassPathXmlApplicationContext context = new 
			ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach theCoach2 = context.getBean("tennisCoachName", Coach.class);
		System.out.println(theCoach.getDailyWork());
		System.out.println(theCoach2.getDailyWork());
		// close the context
		context.close();
	}

}
