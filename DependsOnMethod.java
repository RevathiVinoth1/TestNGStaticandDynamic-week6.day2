package main.java.week6.day2;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void createLead() {
		System.out.println("I Created the Lead Successfully");
	}
	
	@Test(dependsOnMethods="createLead")
	public void editLead() {
		System.out.println("I Edited the Lead Successfully");
	}
	
	@Test(dependsOnMethods={"createLead","editLead"})
	public void deleteLead() {
		System.out.println("I Deleted the Lead Successfully");
	}
	
		@Test()
		public void mergeLead() {
			System.out.println("I Merged the Lead Successfully");
			//throw new RuntimeException("Execution TimeOut");
		}
		
		@Test(dependsOnMethods = {"mergeLead","newLead"},alwaysRun=true)
		public void findLead() {
			System.out.println("I Found the Lead Successfully");
		}
		
		@Test
		public void newLead() {
			System.out.println("I am the New Lead");
			throw new RuntimeException("Execution TimeOut");

	}
		@Test(invocationCount=3,threadPoolSize=2)
		public void Lead() {
			System.out.println("I am a Senior Lead");

}
	}

