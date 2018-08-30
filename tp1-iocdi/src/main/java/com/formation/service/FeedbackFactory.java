package com.formation.service;

public class FeedbackFactory {
	/**
	 * By default, a {@link FeedbackFactory} return an instance of
	 * {@link FeedbackToConsole}
	 */
	public IFeedback getFeedback() {
		return new FeedbackToConsole();
	}
}
