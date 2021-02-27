import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUp() throws IOException {
        FileInputStream properties;
        Properties property = new Properties();

        properties = new FileInputStream("src/main/resources/config.properties");
        property.load(properties);

        String pathToDriver = property.getProperty("pathToDriver");

        System.setProperty("webdriver.chrome.driver", pathToDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,5);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
