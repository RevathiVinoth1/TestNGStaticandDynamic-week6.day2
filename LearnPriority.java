package main.java.week6.day2;

import org.testng.annotations.Test;

public class LearnPriority {
	@Test(timeOut=2000)
	public void createLead() {
		System.out.println("I Created the Lead Successfully");
	}
	
	@Test(priority=-2)
	public void editLead() {
		System.out.println("I Edited the Lead Successfully");
	}
	
	@Test(priority=-1)
	public void deleteLead() {
		System.out.println("I Deleted the Lead Successfully");
	}

}
