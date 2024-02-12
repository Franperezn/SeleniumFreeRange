package pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeRangeTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void navegamosAFreeRangeTesters(){
        driver.get("https://www.freerangetesters.com/");
   
    }

    @After
    public void tearDown(){
        if(driver !=null){
            driver.quit();
        }
    }

}


    

