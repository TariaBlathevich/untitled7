import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RozetkaFT {
    WebDriver driver;

    @BeforeMethod  //прописываем условия для проведения тестов
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Taria\\AppData\\Local\\Temp\\7zOC70E4DD6\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();// открываем браузер на весь экоран
        driver.get("https://rozetka.com.ua/"); //гет - вводим юрл нужного сайта
    }

    @Test
    public void firstTest() {
        WebElement inputSearch = driver.findElement(By.xpath("//input[@name='search']"));
        inputSearch.sendKeys("Mac");
        WebElement searchBtn = driver.findElement(By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']"));
        searchBtn.click();


        WebElement titleOfFirstItem = (new WebDriverWait(driver, 10). //мы ждем появления и кликабельноси элемента, но не дольше 10 сек
                until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='goods-tile__heading ng-star-inserted']"))));
        String titleOfFirstItemText = titleOfFirstItem.getText(); //mы создаем стрингу и записываем текст из локатора актуальный чтобы сравнить с ожидаемым
        String titleOfFirstItemTextExpected = "Бокал для шампанского Chef&Sommelier 300 мл серия Macaron (L9348)";

        assertEquals("Its not equals", titleOfFirstItemTextExpected, titleOfFirstItemText);
    }

    @AfterMethod //.quit - закрывает все окна и процессы. close - закрывает браузер на моменте указания
    public void after() {
        driver.quit();
    }
}



