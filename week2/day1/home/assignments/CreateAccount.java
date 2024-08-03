package week2.day1.home.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	
	public static void main(String[] args) {
		
		//Launch browser & Wait concept
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/.");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//*[contains(@class,'decorativeSubmit')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//*[@id='accountName']")).sendKeys("Working session");
		driver.findElement(By.xpath("(//input[@id='accountName']/following::textarea)[1]")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.xpath("//input[contains(@id,'numberEmployees')]")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println("New Account created");
		
		//Verify the Title of the Account page
		String accountTitle = driver.getTitle();		
		if (accountTitle.contains("Account Details"))
		{
			System.out.println("New Account created successfully");
		} else {
			System.out.println("New Account not created successfully");
		}
		driver.close();
	}

}
