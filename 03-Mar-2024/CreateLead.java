package week5.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	
	@DataProvider(name="getData")
	// for static method we can call without creating object
	
	
	public String[][] sendData() throws IOException
	{
		return ExcelIntegrationWithCreateLeadTestCase.excelValue();
		
	//	data[1][0]="HCL";
	//	data[1][1]="Pavithra";
	//	data[1][2]="Thayalakumar";
	//	data[1][3]="996";
		
	//	data[2][0]="Iris Softek";
	//	data[2][1]="Pavithra";
	//	data[2][2]="T";
	//	data[2][3]="97";
		
	//	return data;
	}
	@Test(dataProvider="getData")
	public void runCreateLead(String companyName, String firstName, String lastName, String phoneNumber) {
		//ChromeDriver driver  = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		//driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		//driver.close();


	}

}
