package main.java.week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificationMethod {
     @Test(dataProvider="CreateLead")
	public void runcreate(String cname,String fname,String lname) {

		/*ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();*/
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
	}
     
     @DataProvider(name="CreateLead")
     public String[][] getData() {
    	 String[][] data=new String[4][3];
    	 data[0][0]="TestLeaf";
    	 data[0][1]="RevathiVinoth";
    	 data[0][2]="94746";
    	 
    	 data[1][0]="TCS";
    	 data[1][1]="SriramVinoth";
    	 data[1][2]="97348";
    	 
    	 data[2][0]="TechPark";
    	 data[2][1]="DevVinoth";
    	 data[2][2]="974348";
    	 
    	 data[3][0]="CTS";
    	 data[3][1]="VinothDevaraj";
    	 data[3][2]="97348";
    	 
    	 return data;
     }
}
