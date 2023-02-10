package main.java.week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class EditLead extends ProjectSpecificationMethod {
	@Test(dataProvider = "EditLead")
	public void runEdit(String phonenum,String cname) throws InterruptedException {
		
		/*ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();*/
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
		driver.close();
}
	@DataProvider(name="EditLead")
	public String[][] editData() {
		String[][] edit=new String[3][2];
		edit[0][0]="7346";
		edit[0][1]="CTS";
		
		edit[1][0]="734543";
		edit[1][1]="TechPark";
		
		edit[2][0]="73453";
		edit[2][1]="TestLeaf";
		return edit;
	}
}






