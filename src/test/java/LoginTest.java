import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.IOException;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest() throws IOException {
        LoginPage page = PageFactory.initElements(driver, LoginPage.class);

        page.GoToLoginPage();

        page.clickAccountButton();

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("email"))));
        page.fillEmail("wecifa4707@geeky83.com");

        page.fillPassword("Autotest0%");

        page.clickButtonForLogin();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"obe-user-login-widget\"]/app-sign-in-root/div/div/button/i[2]")));
        page.assertUserLoggedIn();
    }
}