package main.java.week6.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(priority=1)
	public void createLead() {
		System.out.println("I Created the Lead Successfully");
	}
	
	@Test(invocationCount=5,threadPoolSize = 4)
	public void editLead() {
		System.out.println("I Edited the Lead Successfully");
	}
	
	@Test(enabled=false)
	public void deleteLead() {
		System.out.println("I Deleted the Lead Successfully");
	}
	
		@Test(invocationCount=3,invocationTimeOut=2000)
		public void mergeLead() {
			System.out.println("I Merged the Lead Successfully");
		}
		
		@Test(invocationCount=3,threadPoolSize=2)
		public void findLead() {
			System.out.println("I Found the Lead Successfully");
		}
		@Ignore
		@Test()
		public void newLead() {
			System.out.println("I am the New Lead");

	}
		@Test(invocationCount=1)
		public void Lead() {
			System.out.println("I am a Senior Lead");

}

}
