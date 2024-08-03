package week2.day2.home.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://leafground.com/button.xhtml");
		
		//Disable button check
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Disabled']/ancestor::div/h5"));
		String disableButtonText = element1.getText();
		System.out.println("Disable button header text is " + disableButtonText);
		WebElement disableButton = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']"));
		if (disableButtonText.contains("Confirm if the button is disabled"))
		{
			if (disableButton.isEnabled())
			{
				System.out.println("Button is enabled");
			}else{				
				System.out.println("Button is disabled");
			}
			
		}else{
			System.out.println("Click button text is not correct. It should be Confirm if the button is disabled");
		}
		
		//Position of the button check
		WebElement position = driver.findElement(By.xpath("//button[contains(@class,'ui-button-text-icon-left mr-2')]"));
		int x = position.getRect().getX();
		int y = position.getRect().getY();
		String color = position.getCssValue("background-color");
		System.out.println("The X point of the element is "+x);
		System.out.println("The X point of the element is "+y);
		System.out.println("Color of the button "+color);
		System.out.println("Location of the element "+position.getLocation());		
		
		//Height & Width of the button
		WebElement heightWidth = driver.findElement(By.xpath("//button[contains(@class,'ui-button-text-icon-right')]"));
		int height = heightWidth.getRect().getHeight();
		int width = heightWidth.getRect().getWidth();
		System.out.println("Height of the element is "+height);
		System.out.println("Width of the element is "+width);
		
		//Color of the button
		WebElement saveColor = driver.findElement(By.xpath("//button[contains(@class,'ui-button-secondary mr-2 mb-2')]"));
		String color1 = saveColor.getCssValue("background-color");
		System.out.println("Color of the button "+color1);		
		
		//Click button enable check
		WebElement element = driver.findElement(By.xpath("//span[text()='Click']/ancestor::div/h5"));
		String text = element.getText();
		System.out.println("Click button header text is " + text);
		WebElement clickButton = driver.findElement(By.xpath("//span[text()='Click']"));
		if (text.contains("Click and Confirm"))
		{
			boolean flag = clickButton.isDisplayed() && clickButton.isEnabled();
			System.out.println("Verify that Click button is displayed & enabled "+ flag);
			clickButton.click();
		}else {
			System.out.println("Click button text is not correct. It should be Click and Confirm title.");
		}
		
		//Title check
		String currentTitle = driver.getTitle();
		boolean title = currentTitle.contains("Dashboard");
		System.out.println("Verify that the title is displayed as Dashboard " + title);
		
		driver.close();
	}

}
