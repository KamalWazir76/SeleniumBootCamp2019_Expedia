package pageActions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlightsPage {

	WebDriver driver;
	public SelectFlightsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(@class,'bookButton')]")
	WebElement ContinueBookingButton;
	
	
	
	
	public void HandleNewTab()
	{
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> Ite = windowHandles.iterator();
		driver.switchTo().window(Ite.next());
		driver.switchTo().window(Ite.next());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	public WebElement ContinueBooking()
	{
		return ContinueBookingButton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
