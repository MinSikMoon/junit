package com.in28minute.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class StringTest {
	@BeforeAll
	static void beforeAll() {
		System.out.println("initialize connection to database");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("close connection to database");
	}
	
	@BeforeEach //@Before in junit4
	void beforeEach(TestInfo info) { //junit4에서는 없는 객체
		System.out.println("initialize test data for each test" + info.getDisplayName());
	}
	
	@AfterEach //@After in junit4
	void afterEach() {
		System.out.println("clean up test data");
	}

	@Test
	void tc01_firstRedBar() { //메소드 이름은 짓고 싶은거 아무거나
		//fail("Not yet implemented"); //fail이 없다면 success와 같다.
		//Write test code
		//invoke method squar(4)
		//check in place = 16
		//결국 체크를 해야한다.
		//체크를 junit에서 assertions라고 부른다.
	}
	
	@Test
	void tc02_lengthTest() { 
		assertEquals(4, "abcd".length());
	}
	
	@Test
	void tc03_toUpperCase() { 
		assertEquals("ABCD", "abcd".toUpperCase());
		assertNotNull("abcd".toUpperCase());
	}
	
	@Test
	void tc04_contains() {
		assertEquals(false, "abcdefg".contains("i jk"));
		assertFalse("abcdefg".contains("i jk"));
	}
	
	@Test
	void tc05_split() {
		String str = "abc def ghi";
		String actual[] = str.split(" ");
		String[] expected = new String[] {"abc", "def", "ghi"};
		assertArrayEquals(expected, actual);
	}
	
	
	
	

}
