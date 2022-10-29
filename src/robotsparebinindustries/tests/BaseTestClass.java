package robotsparebinindustries.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTestClass {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeEach
    public void SetUp(){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "C:/webdrivers/chromedriver.exe"); // INFO: This one is set as that when you can't change the system path to include Selenium
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void AfterEachTest(){

        driver.quit();
    }
}
