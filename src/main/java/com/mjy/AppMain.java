package com.mjy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mjy.service.TaskService;

public class AppMain {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 TaskService ts = context.getBean(TaskService.class);
		 ts.search();
	}

}
