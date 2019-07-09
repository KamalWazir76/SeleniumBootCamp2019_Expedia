package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="//button[@data-offer-index='0']")
	WebElement Select;
	
	@FindBy (xpath="//a[@id='forcedChoiceNoThanks']")
	WebElement popup;
	
	By pop=By.xpath("//a[@id='forcedChoiceNoThanks']");
	public WebElement Select()
	{
		return Select;
	}
	
	public int pop()
	{
		return driver.findElements(pop).size();
	}
	
	public WebElement popup()
	{
		return popup;
	}
}
