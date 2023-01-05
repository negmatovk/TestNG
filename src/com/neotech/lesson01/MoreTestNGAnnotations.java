package com.neotech.lesson01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MoreTestNGAnnotations {
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Before Suite method!");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("After Suite method!");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test method!");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test method!");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class method!");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class method!");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Class method!");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Class method!");
	}
	
	@Test
	public void test1() {
		System.out.println("Test case 1 running...");
	}
	
}
