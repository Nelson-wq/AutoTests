import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginTest extends BasePage{

    @Test
    public void loginTest(){

        driver.get("https://www.flyuia.com/ua/ru/home");
        WebElement account = driver.findElement(By.xpath("//*[@id=\"obe-user-login-widget\"]/app-sign-in-root/div/div/button"));
        account.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("email"))));

        LoginPage page = PageFactory.initElements(driver, LoginPage.class);

        page.typeEmail("wecifa4707@geeky83.com");

        page.typePassword("Autotest0%");

        WebElement button = driver.findElement(By.className("form--buttons"));
        button.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"obe-user-login-widget\"]/app-sign-in-root/div/div/button/i[2]")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"obe-user-login-widget\"]/app-sign-in-root/div/div/button/i[2]")).isDisplayed());
    }
}