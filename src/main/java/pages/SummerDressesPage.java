package pages;


import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SummerDressesPage {

	WebDriver driver;

	public SummerDressesPage(WebDriver driver) {
		this.driver = driver;
	}
	
		
	public void AddFirstItem() {
		
//		WebDriverWait wait = new WebDriverWait(this.driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title_block"))).getText().equalsIgnoreCase("CATALOG");
		
//		driver.findElement(By.className("title_block"));
//		Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(60))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(NoSuchElementException.class);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("scrollBy(0,100)");
				
		Actions actions = new Actions(this.driver);
		WebElement firstDresses = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]"));
		actions.moveToElement(firstDresses).build().perform();
		

		WebElement addFirstToCompare = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[3]/div[2]/a"));
		addFirstToCompare.click();
	}
	
	public void AddSecondItem() {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[2]/div[2]/form/button"))));
	
		Actions actions = new Actions(this.driver);
		//Add Second Dress in Compare List
		WebElement secondDresses = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]"));
		actions.moveToElement(secondDresses).perform();

		WebElement addSecondToCompare = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[3]/div[2]/a"));
		addSecondToCompare.click();
		
	}
	
	public void AddthirdItem() {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[2]/div[2]/form/button/span/strong")), "2"));
		
		Actions actions = new Actions(this.driver);
		//Add third Dress in Compare List
		WebElement thirdDress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]"));
		actions.moveToElement(thirdDress).perform();

		WebElement addthirdToCompare = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[3]/div/div[3]/div[2]/a"));
		addthirdToCompare.click();
		
	}
	
	public String totalNumberOfItems() {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[2]/div[2]/form/button/span/strong")), "3"));
		
		return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[2]/div[2]/form/button/span/strong")).getText();
	
	}
	
	public void clickOnCompareBtn() {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[2]/div[2]/form/button/span/strong")), "3"));
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[2]/div[2]/form/button/span/strong")).click();
		
	}
}
