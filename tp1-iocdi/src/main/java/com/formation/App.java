package com.formation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.formation.user.UserInteraction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String name = "Jordan";

		// ApplicationContext applicationContext = new
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserInteraction interaction = applicationContext.getBean(UserInteraction.class);
		interaction.sayHello(name);
		interaction.sayGoodBye(name);
	}
}
