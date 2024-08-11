package week3.home.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAjioAssignments {

	public static void main(String[] args) throws InterruptedException {
				//Launch the Browser
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				driver.manage().window().maximize();
				
				//Launch the URL
				driver.get("https://www.ajio.com/");
				
				//Enter "bags" and press enter in search box
				driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
				driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
				
				//Select Gender="Men" from the left pane
				driver.findElement(By.xpath("//label[contains(text(),'Men ')]")).click();
				Thread.sleep(4000);
				
				//Select Category='Fashion Bags' from the left pane
				driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags ')]")).click();
				
				Thread.sleep(4000);
				
				//Count of the items found
				String countItems = driver.findElement(By.xpath("//div[contains(@aria-label,'Items Found')]")).getText();
				System.out.println("The count of the items filtered based on Gender and Category is: " +countItems);
				
				System.out.println();
				Thread.sleep(4000);
				
				//Brand of the products displayed in the page & print the list
				driver.findElement(By.xpath("//span[text()='brands']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//strong[text()='MORE'])[2]")).click();
				
				List<WebElement> brandPrice = driver.findElements(By.xpath("//span[@class='facet-list-title-name']"));
				int brandSize=brandPrice.size();
				System.out.println("List of Brand Names are displayed as below:");
				for(int i=0;i<brandSize;i++){
					String text = brandPrice.get(i).getText();
					System.out.println(text);
				}
				
				System.out.println();
				driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
				Thread.sleep(3000);
				
				System.out.println();
				
				//Get the list of the bags names and print it
				List<WebElement> brandName = driver.findElements(By.xpath("//div[@class='nameCls']"));
				int size1 = brandName.size();
				System.out.println("List of Bag Names are displayed as below:");
				for(int j=0;j<size1;j++)
				{
					String text1 = brandName.get(j).getText();
					System.out.println(text1);
				}		
				
				driver.close();
			}

		
	

}
