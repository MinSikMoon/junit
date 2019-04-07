package com.in28minute.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

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
		String str = "abcd";
		assertEquals("ABCD", str.toUpperCase());
		assertNotNull(str.toUpperCase());
	}
	
	@Test
	void tc04_contains() {
		String str = "abcdefg";
		assertEquals(false, str.contains("i jk"));
		assertFalse(str.contains("i jk"));
	}
	
	
	
	

}
