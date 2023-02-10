package main.java.week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class ProjectSpecificationMethod {
	
	public ChromeDriver driver;
	@Parameters({"url","name","password"})
	@BeforeMethod
	public void launchBrowser(String URL,String NAME,String PASSWORD) {
		driver=new ChromeDriver();
	//ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(NAME);
	driver.findElement(By.id("password")).sendKeys(PASSWORD);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();

}
@AfterMethod
public void tearDown() {
	driver.close();
}
}
