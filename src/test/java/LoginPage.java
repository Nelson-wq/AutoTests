import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By accountButtonClickLocator = By.xpath("//*[@id=\"obe-user-login-widget\"]/app-sign-in-root/div/div/button");
    By emailLocator = By.name("email");
    By passwordLocator = By.name("password");
    By buttonForLoginLocator = By.className("form--buttons");
    By assertSuccessfulLoginLocator = By.xpath("//*[@id=\"obe-user-login-widget\"]/app-sign-in-root/div/div/button/i[2]");

    public LoginPage accountButtonClick(){
        driver.findElement(accountButtonClickLocator).click();
        return this;
    }

    public LoginPage fillEmail(String email){
        driver.findElement(emailLocator).sendKeys(email);
        return this;
    }

    public LoginPage fillPassword(String password){
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public LoginPage buttonForLogin(){
        driver.findElement(buttonForLoginLocator).click();
        return this;
    }

    public LoginPage assertSuccessfulLogin(){
        Assert.assertTrue(driver.findElement(assertSuccessfulLoginLocator).isDisplayed());
        return this;
    }

}