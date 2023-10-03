import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
    public WebDriver driver;
    @BeforeTest
    public void seleniuminit() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rehmasuf\\OneDrive - PERSEUS MANAGEMENT GROUP INC\\AutoITAutomation\\bin\\Debug\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/"); // Use get() to navigate to a URL
    }
    @AfterTest
    public void TearDown()
    {
        driver.close();
    }
}
