package week2.day2.home.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Throwable {
		
		//Launch browser with url
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/radio.xhtml");
		
		//Verify that Favorite browser is "Selected"
		//Verify that Favorite browser is not "Unselected" by clicking on the same radio button 2nd time
		WebElement chromeDriver = driver.findElement(By.xpath("(//label[text()='Chrome'])[1]/preceding::div[1]"));
		for(int i=0; i<2; i++)
		{
			chromeDriver.click();
		}
		WebElement inspect = driver.findElement(By.xpath("(//label[text()='Chrome'])[1]/preceding::div[2]/input"));
		boolean favBrowser = inspect.isSelected();
		System.out.println(favBrowser);
		if (favBrowser==true) 
		  { 
			  System.out.println("Actual result is: Chrome driver is not unselected which is as expected, working fine"); 			  
		  }else{
			  System.out.println("Chrome driver radio option is unselected"); 
		  }
		
		//Default browser check
		//Verify that the default browser selected is "Safari" for the text "Find the default select radio button"
		WebElement defaultBrowser = driver.findElement(By.xpath("(//label[text()='Safari'])[2]/preceding::div[2]/input"));
		boolean defaultBro = defaultBrowser.isSelected();
		System.out.println(defaultBro);
		if (defaultBro==true)
		{
			WebElement name= driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
			String browserName = name.getText();
			System.out.println("Default selected browser is " + browserName);
		}else{
			System.out.println("Default selected browser is not Safari");
		}
		
		//Checking that the Age group is selected by default as 21-40 years
		//If not selected by default -> Selecting the date rage from 21-40
		WebElement ageRange = driver.findElement(By.xpath("//label[text()='21-40 Years']/preceding::div[2]/input"));
		boolean defaultAge = ageRange.isSelected();
		System.out.println(defaultAge);
		if (defaultAge==true)
		{
			WebElement age= driver.findElement(By.xpath("//label[text()='21-40 Years']"));
			String ageYears = age.getText();
			System.out.println("Default selected age range is " + ageYears);
		}else if (defaultAge==false){
			ageRange.click();
			boolean defaultAge1 = ageRange.isSelected();
			if (defaultAge1==true)
			{
				WebElement age1= driver.findElement(By.xpath("//label[text()='21-40 Years']"));
				String ageYears1 = age1.getText();
				System.out.println("After selecting the date range is " + ageYears1);
			}
		}
		else {
			System.out.println("Default selected age range is not inbetween 21-40");
		}
		
		driver.close();
		
	}

}
