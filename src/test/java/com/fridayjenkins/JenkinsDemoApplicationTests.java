package com.fridayjenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JenkinsDemoApplicationTests {

	@Test
	void testAddNumber() {
        JenkinsDemoApplication app = new JenkinsDemoApplication();
        Assertions.assertEquals(8,app.addNumbers(5,3));
	}
}
