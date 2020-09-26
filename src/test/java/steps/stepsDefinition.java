package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ComparePage;
import pages.HomePage;
import pages.SummerDressesPage;

public class stepsDefinition {

	WebDriver chrome;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {

		WebDriverManager.chromedriver().setup();
		
		chrome = new ChromeDriver();
		chrome.navigate().to("http://automationpractice.com");
		
		chrome.manage().window().maximize();
	}

	@When("user select on summer dresses")
	public void user_select_on_summer_dresses() {

		HomePage home = new HomePage(chrome);
		home.clickOnSummerDressesBtn();
	}

	@When("add first dress to compare list")
	public void add_first_dress_to_compare_list() {

		SummerDressesPage page = new SummerDressesPage(chrome);
		page.AddFirstItem();
	}

	@When("add second dress to compare list")
	public void add_second_dress_to_compare_list() {

		SummerDressesPage page = new SummerDressesPage(chrome);
		page.AddSecondItem();
	}

	@When("add third third to compare list")
	public void add_third_third_to_compare_list() {
		SummerDressesPage page = new SummerDressesPage(chrome);
		page.AddthirdItem();
	}

	@When("user ensure the name of selected dresses")
	public void user_ensure_the_name_of_selected_dresses() {

		SummerDressesPage page = new SummerDressesPage(chrome);
		String totalDress = page.totalNumberOfItems();
		Assert.assertEquals(totalDress, "3");
		page.clickOnCompareBtn();
		
		//Check name of First Dress
		String firstDressName = chrome.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[1]/td[2]/h5/a")).getText();
		Assert.assertEquals ("Printed Summer Dress", firstDressName);
		
		String secondDressName = chrome.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[1]/td[3]/h5/a")).getText();
		Assert.assertEquals("Printed Summer Dress",secondDressName);
		
		String thirdDressName = chrome.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[1]/td[4]/h5/a")).getText();
		Assert.assertEquals("Printed Chiffon Dress", thirdDressName);
	}

	@When("user compare between their prices")
	public void user_compare_between_their_prices() {

		ComparePage comparePage = new ComparePage(chrome);
		comparePage.compareDressPrices();
	}

	@When("user ensure that features components for each dress is displayed")
	public void user_ensure_that_features_components_for_each_dress_is_displayed() {
		ComparePage comparePage = new ComparePage(chrome);
		Assert.assertTrue(comparePage.existenceOfFeatureComponents());
	}

	@Then("user add choosen dress to cart")
	public void user_add_choosen_dress_to_cart() {	
		ComparePage comparePage = new ComparePage(chrome);
		chrome.quit();

	}

}
