package com.formation.service;

/**
 * Implementation of {@link IFeedback} using the console as output
 */
public class FeedbackToConsole implements IFeedback {
	@Override
	public void say(String something) {
		System.out.println(something);
	}
}