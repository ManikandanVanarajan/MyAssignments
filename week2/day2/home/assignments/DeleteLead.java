package week2.day2.home.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws Throwable {
		
		//Launch browser & Wait concept
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/.");
		
		//Login to the application & click on Find Lead button
    	driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();		
		//Verify that search results are displayed based on Phone number provided
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(10000);
		
		//1st row of the result is taken & Lead ID has been noted
		WebElement leadElement = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a"));
		String leadId = leadElement.getText();
		System.out.println("Lead Id to be deleted is " + leadId);
		leadElement.click();
		Thread.sleep(3000);
		
		//Verify that the same Lead ID is deleted
		//Verify that No record found message is deleted for the deleted Lead ID
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.name("id")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String message = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();	
		System.out.println(message);
		if (message.contains("No records to display"))
		{
			System.out.println("Lead id " +leadId+  " is deleted successfully");
		}else {
			System.out.println("Lead ID "+leadId+" not deleted");
		}
	
	}
	
}
