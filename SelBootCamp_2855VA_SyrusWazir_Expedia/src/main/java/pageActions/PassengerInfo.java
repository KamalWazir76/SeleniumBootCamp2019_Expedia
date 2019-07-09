package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PassengerInfo {

	WebDriver driver;
	public PassengerInfo (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@id='firstname[0]']")
	WebElement firstName;
	
	@FindBy (xpath="//input[@id='middlename[0]']")
	WebElement middleName;
	
	@FindBy (xpath="//input[@id='lastname[0]']")
	WebElement lastName;
	
	@FindBy (xpath="//select[@id='country_code[0]']")
	WebElement countryCode;
	
	@FindBy (xpath="//input[@id='phone-number[0]']")
	WebElement phoneNumber;
	
	@FindBy (xpath="//input[@id='confirmation-sms-provider-checkbox']")
	WebElement checkBox;
	
	@FindBy (xpath="//select[@id='passport[0]']")
	WebElement passPort;
	
	@FindBy (xpath="//input[@id='gender_male[0]']")
	WebElement gender;
	
	@FindBy (xpath="//select[@id='date_of_birth_month0']")
	WebElement DOB_Month;
	
	@FindBy (xpath="//select[@id='date_of_birth_day[0]']")
	WebElement DOB_Day;
	
	@FindBy (xpath="//select[@id='date_of_birth_year[0]']")
	WebElement DOB_Year;
	
	
	public WebElement FirstName()
	{
		return firstName;
	}
	
	public WebElement MiddleName()
	{
		return middleName;
	}
	
	public WebElement LastName()
	{
		return lastName;
	}
	
	public void Select_Country_Code()
	{
		Select s = new Select(countryCode);
		s.selectByValue("91");
	}
	
	public WebElement PhoneNumber()
	{
		return phoneNumber;
	}
	
	public WebElement CheckBox()
	{
		return checkBox;
	}
	
	public void Select_Passport()
	{
		Select s = new Select(passPort);
		s.selectByValue("4281173");
	}
	
	public WebElement Select_Gender()
	{
		return gender;
	}
	
	public void Select_DOB_Month()
	{
		Select s = new Select(DOB_Month);
		s.selectByValue("05");
	}
	
	public void Select_DOB_Day()
	{
		Select s = new Select(DOB_Day);
		s.selectByValue("09");
	}
	
	public void Select_DOB_Year()
	{
		Select s = new Select(DOB_Year);
		s.selectByValue("1989");
	}
	
	
	
	
}
