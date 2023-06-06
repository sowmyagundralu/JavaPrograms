package com.shristi.autowiring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext("com.shristi");
		Arrays.stream(context.getBeanDefinitionNames())
		.forEach((bean)->System.out.println(bean));
		
		Performer performer = context.getBean("performer",Performer.class);
		performer.playSong("Guitar","the life");
	}

}
