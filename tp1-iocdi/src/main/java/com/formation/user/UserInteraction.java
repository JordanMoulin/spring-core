package com.formation.user;

import java.text.MessageFormat;

import com.formation.service.FeedbackFactory;

/**
 * Class to make interactions with the user
 */
public class UserInteraction {
	// private IFeedback feedback;
	private FeedbackFactory factory;

	public UserInteraction() {
		// feedback = factory.getFeedback();
	}

	/**
	 * To say hello to the user named <code>name</code>
	 *
	 * @param name
	 */
	public void sayHello(String name) {
		factory.getFeedback().say(MessageFormat.format("Hello {0} !", name));
	}

	/**
	 * To say goodbye to the user named <code>name</code>
	 *
	 * @param name
	 */
	public void sayGoodBye(String name) {
		factory.getFeedback().say(MessageFormat.format("Goodbye {0} !", name));
	}

	public void setFactory(FeedbackFactory factory) {
		this.factory = factory;
	}
}