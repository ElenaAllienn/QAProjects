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
    public String environment = "https://robotsparebinindustries.com/#/";  // Put strings and other variables that define a class element in the beginning of the class, not somewhere in the middle
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
        return "Sample error message";
        // Zdravko: There was a missing return statement, why?
    }

    public void Refresh(){
        Driver().navigate().refresh();
    }


}
