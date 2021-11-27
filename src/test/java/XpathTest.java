import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class XpathTest {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Taria\\AppData\\Local\\Temp\\7zOC70E4DD6\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com.ua");
    }
}

