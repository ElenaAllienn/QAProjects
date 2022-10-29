package robotsparebinindustries.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePageClass{
    By username = By.id("username");  // Put locators and other class elements in the beginning of the class, not in the middle or at the end!
    By password = By.id("password");  // Put locators and other class elements in the beginning of the class, not in the middle or at the end!
    By loginButton = By.xpath("//button[@class='btn btn-primary']");;  // Put locators and other class elements in the beginning of the class, not in the middle or at the end!


    public LoginPage(WebDriver driver, WebDriverWait wait)
    {
        super(driver, new WebDriverWait(driver, Duration.ofSeconds(10)));
    }

    public void NavigateToUrl(){
        Driver().navigate().to(environment);
    }


    public void Login(String user, String pass){
        findElementWithWait(username).sendKeys(user);
        findElementWithWait(password).sendKeys(pass);
        findElementWithWait(loginButton).click();
    }
}
