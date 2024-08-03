package week2.day1.home.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelectclass {

	public static void main(String[] args) {
		
		//Launch Browser & Wait concept
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/.");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//*[contains(@class,'decorativeSubmit')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//*[@id='accountName']")).sendKeys("Create Account of ICIC");
		driver.findElement(By.xpath("(//input[@id='accountName']/following::textarea)[1]")).sendKeys("Selenium Automation Tester."); WebElement options =
		driver.findElement(By.xpath("//select[@name='industryEnumId']")); 
		
		//Verifying Select class
		Select industry = new Select(options);
		industry.selectByVisibleText("Computer Software"); 
		WebElement options1 = driver.findElement(By.xpath("//select[contains(@name,'ownershipEnumId')]"));
		Select ownership = new Select(options1);
		ownership.selectByVisibleText("S-Corporation"); 
		WebElement options2 = driver.findElement(By.xpath("//select[@id='dataSourceId']")); 
		Select source = new Select(options2); source.selectByValue("LEAD_EMPLOYEE"); 
		WebElement options3 = driver.findElement(By.xpath("//select[@id='marketingCampaignId']")); 
		Select marketingCamp = new Select(options3); marketingCamp.selectByIndex(4);
		WebElement options4 = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select state = new Select(options4); 
		state.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String accName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println(accName);
		
		//Verifying account name
		  if(accName.contains("Create Account of ICIC"))
		  {
			  System.out.println("Account name is displayed correctly");
		  }else {
			  System.out.println("Account name is displayed wrong");
		  }
		driver.close();
		 
	}

}
