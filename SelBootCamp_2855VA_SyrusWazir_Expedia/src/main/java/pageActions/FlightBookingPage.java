package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FlightBookingPage  {

	
	WebDriver driver;
	public FlightBookingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	

	@FindBy (xpath="//label[contains(@id,'roundtrip')]")
	WebElement Roundtrip;
	
	@FindBy (xpath="//input[@id='flight-origin-hp-flight']")
	WebElement Flyingfrom;
	
	@FindBy (xpath="//input[@id='flight-destination-hp-flight']")
	WebElement Flyingto;
	
	@FindBy (xpath="//input[@id='flight-departing-hp-flight']")
	WebElement SelectDepartureDate;
	
	@FindBy (xpath="(//button[@data-day='25'])[1]")
	WebElement DepartureDate;
	
	@FindBy (xpath="//input[@id='flight-returning-hp-flight']")
	WebElement SelectReturnDate;
	
	@FindBy (xpath="//button[@data-day='15']") 
	WebElement ReturnDate;
	
	@FindBy (xpath="(//button[contains(@class,'gcw-submit')])[1]") 
	WebElement SearchFlightsButton;
	
	public WebElement Roundtrip()
	{
		return Roundtrip;
	}
	
	public WebElement Flyingfrom()
	{
		return Flyingfrom;
	}
	
	public WebElement Flyingto()
	{
		return Flyingto;
	}
	
	public WebElement SelectDepartureDate()
	{
		return SelectDepartureDate;
	}
	
	public WebElement DepartureDate()
	{
		return DepartureDate;
	}
	
	public WebElement SelectReturnDate()
	{
		return SelectReturnDate;
	}
	
	public WebElement ReturnDate()
	{
		return ReturnDate;
	}
	
	public WebElement SearchFlightsButton()
	{
		return SearchFlightsButton;
	}
}
