package com.hkw2028;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {
	private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
	@Test
	public void test() {
		logger.trace("test : {}", "success");
		fail("Not yet implemented");
	}

}
