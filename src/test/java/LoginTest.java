import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginTest extends BasePage{

    @Test
    public void loginTest(){
        LoginPage page = PageFactory.initElements(driver, LoginPage.class);

        driver.get("https://www.flyuia.com/ua/ru/home");

        page.accountButtonClick();

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("email"))));
        page.fillEmail("wecifa4707@geeky83.com");

        page.fillPassword("Autotest0%");

        page.buttonForLogin();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"obe-user-login-widget\"]/app-sign-in-root/div/div/button/i[2]")));
        page.assertSuccessfulLogin();
    }
}