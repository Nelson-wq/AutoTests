import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage typeEmail(String email){
        driver.findElement(By.name("email")).sendKeys(email);
        return this;
    }

    public LoginPage typePassword(String password){
        driver.findElement(By.name("password")).sendKeys(password);
        return this;
    }
}