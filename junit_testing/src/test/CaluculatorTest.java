package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Caluculator;

class CaluculatorTest {

	@Test
	void testAdd() {
		Caluculator cal = new Caluculator();
		int actual = cal.add(4,5);
		assertEquals(9,actual);
		System.out.println("test 1 successfull");
	}

	@Test
	void testSub() {
		Caluculator cal = new Caluculator();
		int actual = cal.sub(4,5);
		assertEquals(-1,actual);
		System.out.println("test 2 successfull");
	}

}
