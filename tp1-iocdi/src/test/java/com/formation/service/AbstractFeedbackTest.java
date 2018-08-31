package com.formation.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class AbstractFeedbackTest {
	FeedbackToConsole feedbackCon = new FeedbackToConsole();

	@Test
	public void testgiveMeTheCaptainAge() {
		assertEquals(58, feedbackCon.giveMeTheCaptainAge(10, 3));
		assertEquals(42, feedbackCon.giveMeTheCaptainAge(0, 0));
		assertNotEquals(8, feedbackCon.giveMeTheCaptainAge(10, 3));
	}
}
