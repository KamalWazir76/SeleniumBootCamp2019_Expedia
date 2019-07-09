package baseProperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

		public static WebDriver driver;
		Properties prop =new Properties();

		public void Invoke() throws IOException
		{
		SelectBrowser();
		geturl();
		}


		public void SelectBrowser() throws IOException 
		{
		FileInputStream baseFile=new FileInputStream("src//main//java//resourcesUsed//Base.properties");
		prop.load(baseFile);
		//String br=prop.getProperty("Browser");

		if(prop.getProperty("Browser").equalsIgnoreCase("chrome"))
		{

		System.setProperty("webdriver.chrome.driver", "src//main//java//webDriver//chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (prop.getProperty("Browser").equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "src//main//java//webDriver//geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else
		{
		System.setProperty("webdriver.ie.driver", "src/main/java/com/qa/WebDrivers/geckodriver.exe");
		driver = new InternetExplorerDriver();

		}
		}

		public void geturl()
		{
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}
	
	
	
	
	
	
	

