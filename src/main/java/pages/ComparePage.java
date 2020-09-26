package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ComparePage {

	WebDriver driver;

	public ComparePage(WebDriver driver) {
		this.driver = driver;
	}


	public void compareDressPrices() {

		// First Dress Price
		String firstDressPrice = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[1]/td[2]/div[3]/span[1]")).getText();
		System.out.println("The price of first dress is: " +firstDressPrice);

		// second Dress Price
		String secondDressPrice = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[1]/td[3]/div[3]/span")).getText();
		System.out.println("The price of second dress is: " + secondDressPrice);


		// third Dress Price
		String thirdDressPrice = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[1]/td[4]/div[3]/span[1]")).getText();
		System.out.println("The price of third dress is: " + thirdDressPrice);

	}

	public boolean existenceOfFeatureComponents() {

		// First Dress Styles
		boolean firstDressStyle = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[2]/td[2]")).isDisplayed();

		// First Dress Compositions
		boolean firstDressCompositions = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[3]/td[2]")).isDisplayed();

		// First Dress Properties
		boolean firstDressProperties = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[4]/td[2]")).isDisplayed();


		// Second Dress Styles
		boolean secondDressStyle = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[2]/td[3]")).isDisplayed();

		// Second Dress Compositions
		boolean secondDressCompositions = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[3]/td[3]")).isDisplayed();

		// Second Dress Properties
		boolean secondDressProperties = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[4]/td[3]")).isDisplayed();

		// Third Dress Styles
		boolean thirdDressStyle = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[2]/td[4]")).isDisplayed();

		// Third Dress Compositions
		boolean thirdDressCompositions = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[3]/td[4]")).isDisplayed();

		// Third Dress Properties
		boolean thirdDressProperties = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[4]/td[4]")).isDisplayed();


		if (firstDressStyle && firstDressCompositions && firstDressProperties 
			&& secondDressStyle && secondDressCompositions && secondDressProperties 
			&& thirdDressStyle && thirdDressCompositions && thirdDressProperties )
		{
			return true;
		}
		else
		{
			return false;
		}

	}

}
