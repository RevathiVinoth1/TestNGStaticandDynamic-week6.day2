package main.java.week6.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnEnable {

	@Test(priority=1)
	public void createLead() {
		System.out.println("I Created the Lead Successfully");
	}
	
	@Test(priority=-1)
	public void editLead() {
		System.out.println("I Edited the Lead Successfully");
	}
	
	@Test(enabled=false)
	public void deleteLead() {
		System.out.println("I Deleted the Lead Successfully");
	}
	@Ignore
		@Test(priority=2)
		public void mergeLead() {
			System.out.println("I Merged the Lead Successfully");
		}
		
		@Test(priority=-3)
		public void findLead() {
			System.out.println("I Found the Lead Successfully");
		}
		
		@Test(enabled=false)
		public void newLead() {
			System.out.println("I am the New Lead");

	}
		@Test
		public void Lead() {
			System.out.println("I am a Senior Lead");

}
}