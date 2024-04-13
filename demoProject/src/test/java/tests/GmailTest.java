package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailTest {
	private WebDriver driver;
    
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "Utilities/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
      
    }
    @Test
    public void openWebsite() {
    	driver.get("https://www.gmail.com");
        driver.manage().window().maximize();
    }
    
    @AfterClass
    public void tearDown() 
    {
        driver.quit();
    }
}
