import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Auto extends Helper{
    @Test
    public void loginTest() {
        driver.get("https://zoom.us/");
        WebElement login_button = driver.findElement(By.className("signin"));
        login_button.click();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("wecifa4707@geeky83.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Autotest0");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/div[1]/button"));
        button.click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("sidemenu"))));
        }
}