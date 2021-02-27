import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginPage {
    private WebDriver driver;

    By accountButtonClick = By.xpath("//*[@id=\"obe-user-login-widget\"]/app-sign-in-root/div/div/button");
    By emailForLogin = By.name("email");
    By passwordForLogin = By.name("password");
    By buttonForLogin = By.className("form--buttons");
    By assertSuccessfulLogin = By.xpath("//*[@id=\"obe-user-login-widget\"]/app-sign-in-root/div/div/button/i[2]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage GoToLoginPage() throws IOException {

        FileInputStream properties;
        Properties property = new Properties();

        properties = new FileInputStream("src/main/resources/config.properties");
        property.load(properties);

        String loginPageUrl = property.getProperty("loginPageUrl");

        driver.get(loginPageUrl);
        return this;
    }

    public LoginPage clickAccountButton(){
        driver.findElement(accountButtonClick).click();
        return this;
    }

    public LoginPage fillEmail(String email){
        driver.findElement(emailForLogin).sendKeys(email);
        return this;
    }

    public LoginPage fillPassword(String password){
        driver.findElement(passwordForLogin).sendKeys(password);
        return this;
    }

    public LoginPage clickButtonForLogin(){
        driver.findElement(buttonForLogin).click();
        return this;
    }

    public LoginPage assertUserLoggedIn(){
        Assert.assertTrue(driver.findElement(assertSuccessfulLogin).isDisplayed());
        return this;
    }

}