package com.ecommerce.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("JUnit 5 Nested Example")
@RunWith(JUnitPlatform.class)
public class NestedTestClass {

	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all test methods");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each test method");
	}

	@AfterEach
	void adterEach() {
		System.out.println("After each test method");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("After all test methods");
	}

	@Nested
	@DisplayName("Tests for the method A")
	class A {
		@BeforeEach
		void beforeEach() {
			System.out.println("Before each test method of the A Class");
		}

		@AfterEach
		void afterEach() {
			System.out.println("After each test method of the A class");
		}

		@Test
		@DisplayName("Example test for method A")
		public void sameTestForMethodA() {
			System.out.println("Example Test for Method A - Class A");
		}

		@Nested
		@DisplayName("When X is true")
		class WhenX {
			@BeforeEach
			void beforeEach() {
				System.out.println("Before each test method of the WhenX Class");
			}

			@AfterEach
			void afterEach() {
				System.out.println("After each test method of the WhenX Class");
			}

			@Test
			@DisplayName("Example test for the method A when X is true")
			void sampleTestForWhenX() {
				System.out.println("Example test for method A when X is true");
			}
		}
	}
}
