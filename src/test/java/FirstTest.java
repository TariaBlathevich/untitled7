import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class FirstTest {

    @Test
    public void firstTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Taria\\AppData\\Local\\Temp\\7zOC70E4DD6\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com.ua");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.close();
 }
    //li[@class='menu-categories__item ng-star-inserted']

}

