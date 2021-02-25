import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/src/main/resources/seleniumDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,5);
    }
    @After
    public void closeBrowser() {
        driver.quit();
    }
}
