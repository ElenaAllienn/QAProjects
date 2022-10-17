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
    }

    By firstName = By.id("firstname");
    By lastName = By.id("lastname");
    By salesTarget = By.id("salestarget");
    By salesResult = By.id("salesresult");
    By submitBtn = By.xpath("//button[@class='btn btn-primary']");

    public void Sales(String user, String pass){
        // with for to add more values ???? list from values
        findElementWithWait(firstName).sendKeys("firstname");
        findElementWithWait(lastName).sendKeys("lastName");
        findElementWithWait(salesTarget).sendKeys(value).click(); //??? double , choose from menu
        findElementWithWait(salesResult).sendKeys(value).click(); //??? double , choose from menu;
        findElementWithWait(submitBtn).click();
    }

}
