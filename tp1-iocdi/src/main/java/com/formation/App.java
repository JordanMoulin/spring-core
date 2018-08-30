package com.formation;

import com.formation.service.FeedbackFactory;
import com.formation.user.UserInteraction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String name = "Jordan";

		UserInteraction interaction = new UserInteraction();
		FeedbackFactory factory = new FeedbackFactory();
		interaction.setFactory(factory);
		interaction.sayHello(name);
		interaction.sayGoodBye(name);

	}
}
