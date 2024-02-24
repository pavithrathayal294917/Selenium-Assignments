package Week3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@aria-label='search']")).click();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(3000);
		String numberOfItems=driver.findElement(By.xpath("//div[@class='length']//strong")).getText();
		Thread.sleep(3000);
		System.out.println(numberOfItems);
		
		List<WebElement> bagBrand=(List<WebElement>) driver.findElements(By.xpath("//div[@class='brand']//strong"));
		for (WebElement  brand: bagBrand) {
			String brName=brand.getText();
			List<String> BagBrand=new ArrayList<String>();
			BagBrand.add(brName);
			System.out.println("Brand Name: " + BagBrand);
        }
		List<WebElement> bagName=(List<WebElement>) driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("Bag Name: ");
		for(WebElement bName:bagName)
        {
        	String bagN=bName.getText();
        	List<String> BagName1=new ArrayList<String>();
        	BagName1.add(bagN);
        	System.out.println(BagName1);
        }
        
        

	}

}
