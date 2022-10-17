package robotsparebinindustries.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePageClass {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePageClass(WebDriver driver, WebDriverWait webDriverWait) {
    }

    public void BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public String environment = "https://robotsparebinindustries.com/#/";
    public WebDriver Driver() {
        return driver;
    }
    public WebDriverWait Wait() {
        return wait;
    }
    public WebElement findElementWithWait(By locator){
        return Wait().until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public List<WebElement> findElementsWithWait(By locator){
        return Wait().until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

    }
    public String AssertErrorValidationMessage() {
        //??
    }

    public void Refresh(){
        Driver().navigate().refresh();
    }


}
