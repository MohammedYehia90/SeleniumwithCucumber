package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//click on Summer Dresses button
	
	public void clickOnSummerDressesBtn() {
		Actions actions = new Actions(this.driver);
		
		WebElement dresses = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a"));
		actions.moveToElement(dresses).perform();
		
		WebElement summerDresses = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a"));
		summerDresses.click();
		
	}


	


}
