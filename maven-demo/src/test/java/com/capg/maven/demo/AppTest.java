package com.capg.maven.demo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
@TestInstance(Lifecycle.PER_CLASS)
public class AppTest {

	int x=0;
	App app=new App();
	@BeforeEach
	void sayHello() {
		System.out.println("Hello....");
		x++;
	}
	
	@BeforeAll
	 void startTest() {
		System.out.println("Test Strated...");
	}
	
	@AfterEach
	void sayBye() {
		System.out.println("Bye.... x = "+x);
	}
	
	@Test
	@RepeatedTest(value = 3)
	void testAddMethod() {
		
		assertEquals(10, app.add(4, 5),
			()->{
				System.out.println("Test Failed");
				return "Failed...Due to..";
			});
		
	}
	
	@Test
	void test2() {
		assertNotEquals(55, app.add(55, 30));
	}
	
	@Test
	@EnabledOnOs(OS.LINUX)
	void test3() {
		assertThrows(Exception.class, ()->{int x=5/0;});
	}
	
	@Nested
	class NestedTestDemo{
		@Test
		void t1() {
			assertFalse(x>0);
		}
		@Test
		void t2() {
			assertAll(
					()->assertEquals(5, 6),
					()->assertEquals(6, 6)
					
					);
		}
	}
}
