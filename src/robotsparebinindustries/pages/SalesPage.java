package robotsparebinindustries.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SalesPage extends BasePageClass{
    public SalesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, new WebDriverWait(driver, Duration.ofSeconds(10)));
    }

    public void NavigateToUrl(){
        Driver().navigate().to(environment+"/?firstname=.html"); //???
    }  // Make all strings as a class element i.e. the URL part '/?firstname=.html' to be a variable with its own name!

    By firstName = By.id("firstname");  // Put locators and other class elements in the beginning of the class, not in the middle or at the end!
    By lastName = By.id("lastname");  // Put locators and other class elements in the beginning of the class, not in the middle or at the end!
    By salesTarget = By.xpath("//select[@id=\"salestarget\"]/option[@value=\"25000\"]");  // Put locators and other class elements in the beginning of the class, not in the middle or at the end!
    By salesResult = By.id("salesresult"); // Put locators and other class elements in the beginning of the class, not in the middle or at the end!
    By submitBtn = By.xpath("//button[@class='btn btn-primary']");  // Put locators and other class elements in the beginning of the class, not in the middle or at the end!

    public void Sales(String user, String pass){
        // with for to add more values ???? list from values
        findElementWithWait(firstName).sendKeys("firstname");  // Make all data elements that are submitted in the inputs as a variable with its own name in the beginning of the class
        findElementWithWait(lastName).sendKeys("lastName");  // Make all data elements that are submitted in the inputs as a variable with its own name in the beginning of the class
        //findElementWithWait(salesTarget).sendKeys(value).click(); //??? double , choose from menu    Zdravko: Use a locator to pick the dropdown values and then select one of the present; sendKeys is not used here + can't click a method that uses sendKeys!
        //findElementWithWait(salesResult).sendKeys(value).click(); //??? double , choose from menu;   Zdravko: Send a numerical value to test against the one selected in the dropdown above; sendKeys is not used here + can't click a method that uses sendKeys!
        findElementWithWait(salesTarget).click();
        findElementWithWait(salesResult).sendKeys("12345");
        findElementWithWait(submitBtn).click();
    }

}
