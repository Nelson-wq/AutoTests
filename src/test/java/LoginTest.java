import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginTest extends BasePage{
    @Test
    public void loginTest() {
        driver.get("https://www.flyuia.com/ua/ru/home");
        WebElement account = driver.findElement(By.xpath("//*[@id=\"obe-user-login-widget\"]/app-sign-in-root/div/div/button"));
        account.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("email"))));
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("wecifa4707@geeky83.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Autotest0%");
        WebElement button = driver.findElement(By.className("form--buttons"));
        button.click();
    }
}