package week2.day1.home.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebook {

	public static void main(String[] args) {
		
		//Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Indhumathi");
		driver.findElement(By.name("lastname")).sendKeys("Manikandan");
		driver.findElement(By.xpath("(//input[@name='firstname']/following::input)[2]")).sendKeys("9789133116");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Vikshanitha7&");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		//Calendar selection
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select dbyear = new Select(year);
		dbyear.selectByVisibleText("1991");
		
		WebElement month = driver.findElement(By.id("month"));
		Select dbmonth = new Select(month);
		dbmonth.selectByValue("8");
		
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select dbdate = new Select(date);
		dbdate.selectByIndex(11);
		driver.close();		
		
	}

}
