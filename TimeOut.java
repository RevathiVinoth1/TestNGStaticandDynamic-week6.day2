package main.java.week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TimeOut {
	@Test(timeOut=10000)
	public void timeout() {
		
			 ChromeOptions option = new ChromeOptions();
			 option.addArguments("--disable-notifications");
			 ChromeDriver driver=new ChromeDriver(option);
		     driver.manage().window().maximize();
		     driver.get("https://login.salesforce.com/");
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		     driver.findElement(By.xpath("//input[@id='Login']")).click();
		     driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		}	
	}


