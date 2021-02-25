import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {
    public WebDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/src/main/resources/seleniumDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public void closeBrowser() {
        driver.quit();
    }
}
