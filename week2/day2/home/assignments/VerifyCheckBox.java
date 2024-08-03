package week2.day2.home.assignments;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckBox {

	public static void main(String[] args) throws Throwable {
		
		//Launch Driver & Wait concept
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Verify that Basic check box is checked
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
        boolean checkBox = driver.findElement(By.xpath("//span[text()='Basic']/preceding::input[1]")).isSelected();
        if(checkBox==true) {
        	System.out.println("Basic checkbox is selected");
        }
        
        //Verify Ajax check bow is checked
        driver.findElement(By.xpath("//span[text()='Ajax']")).click();
        String ajaxPopup = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		boolean textAjax = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		if(textAjax==true) {
			System.out.println("Notification message for " + ajaxPopup + " is displayed");
		}
		else {
			System.out.println("Notification message for " + ajaxPopup + "is not displayed");
		}
		
		Thread.sleep(2000);
		
		//Verify Fav language is selected
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Javascript']")).click();
		//Check Tri-State
		driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'State has been changed')]/following::p")).click();
		Thread.sleep(3000);

		WebElement state = driver.findElement(By.xpath("(//div[@class='ui-growl-message']//span)[1]"));
		String stateName = driver.findElement(By.xpath("//p[contains(text(),'State')]")).getText();
		if (state.isDisplayed()==true) {
			System.out.println("The state name is: " + stateName);
			System.out.println("Notification message for " + stateName + " is displayed");
		}
		else{
			System.out.println("Notification message for " + stateName + " is not displayed");
		}
		
		//Toggle check
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();	
		Thread.sleep(3000);
		String toggle = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		boolean togOff = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		if(togOff==true) {
			System.out.println("Notification message for Toggle " + toggle + " is displayed");
		}
		else {
			System.out.println("Notification message for Toggle " + toggle + "is not displayed");
		}
		
		String check = driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']")).getText();
        boolean select = driver.findElement(By.xpath("//span[contains(text(),'Disabled')]/preceding::input[@id='j_idt87:j_idt102_input']")).isSelected();
        if(select==true) {
        	System.out.println("The check box in " + check + " section enabled");
        }
        else {
        	System.out.println("The check box in " + check + " by default");
        }
                  
        driver.findElement(By.xpath("(//div[@class='ui-helper-hidden']/following-sibling::ul)[1]")).click();
        List<WebElement> manyCheck = driver.findElements(By.xpath("(//div[contains(@class, 'ui-selectcheckboxmenu-panel ui-widget ui-widget-content ui-corner-all ui-helper-hidden ui-input-overlay')]//ul/li/div[@class='ui-chkbox ui-widget'])")).subList(0, 9);
        manyCheck.get(2).click();
        manyCheck.get(3).click();
        manyCheck.get(4).click();        
        Thread.sleep(5000);
        
        //All check bow count
        System.out.println("Total no. of checkboxes in Select Multiple section: " +manyCheck.size());
        
        WebElement name= driver.findElement(By.xpath("//ul[@data-label='Cities']//following::span[@class='ui-selectcheckboxmenu-token-label']"));
        String check1=driver.findElement(By.xpath("(//ul[@data-label='Cities']//following::span[@class='ui-selectcheckboxmenu-token-label'])[1]")).getText();
        String check2=driver.findElement(By.xpath("(//ul[@data-label='Cities']//following::span[@class='ui-selectcheckboxmenu-token-label'])[2]")).getText();
        String check3=driver.findElement(By.xpath("(//ul[@data-label='Cities']//following::span[@class='ui-selectcheckboxmenu-token-label'])[3]")).getText();
        if(name.isDisplayed()==true) {
        	System.out.println("The multiple cities selected are " + check1 + ", "  + check2 + ", "  + check3);
        }
        Thread.sleep(5000);
        driver.close();
	}

		
	

}
