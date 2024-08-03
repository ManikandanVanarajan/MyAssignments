package week2.day2.home.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws Throwable {
		
		//Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Wait concept
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/.");
		
		//Verify that a New lead is created successfully
    	driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CTS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Morris");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Garage");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Garage");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Mechanical");
		WebElement description = driver.findElement(By.xpath("//textarea[@name='description']"));
		description.sendKeys("Testing Selenium week2");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("Morris@gmail.com");
		WebElement element = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state = new Select(element);
		state.selectByVisibleText("Arizona");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		System.out.println("A New Lead created successfully");
		
		//Updating the Lead
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Cleared description and updated imp notes");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		//Verify the Title is displayed as View Lead
		String title = driver.getTitle();		
		if (title.contains("View Lead"))
		{
			System.out.println("Lead updated successfully");
		}else {
			System.out.println("Lead not updated");
		}
	}

}
