import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.interactions.Actions;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class Simpletest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
    }

    @Test
    public void mySamTest() throws Exception {
        driver.get("https://www.google.ru/");
        WebElement Googla = driver.findElement(By.id("lst-ib"));
        Googla.click();
        Googla.sendKeys("Вконтакте" + Keys.ENTER);
        Thread.sleep(40);
        WebElement VK = driver.findElement(By.linkText("ВКонтакте: Добро пожаловать"));
        VK.click();
        ArrayList tabs2 = new ArrayList (driver.getWindowHandles());//Получение списка табов
        driver.switchTo().window(tabs2.get(1));//Переключение на второй таб в браузере

//ДРУГОЙ ТЕСТ ДЛЯ ВК.
//        Thread.sleep(100);


//        Login.sendKeys("eqweqweqweqwe"+ Keys.ENTER);
//
////[id='index_pass']"
//        WebElement Password = driver.findElement(By.cssSelector("index_pass"));
//        Password.sendKeys("224416T");
//        // Assert.assertTrue(menuName.equals("Медиа"));
//
//        // driver.findElement(By.xpath(".//*[@id='rso']")).click();
//
//
//        //WebElement myWebEl = driver.findElements(By.cssSelector("[class='wall_post_text']")).get(0);
//        // String Zap = myWebEl.getAttribute("textContent");  //обращаемся к свойству
//        //try (FileWriter writer = new FileWriter("F:\\Itogo\\test1.txt", true)) {
//        //  String text = Zap;
//        //   writer.write(text);
//        // запись по символам
//        //   writer.append('\n');
//        //  writer.append('\\');
//        // writer.flush();
    }
    //поиск по СЛОВУ в записях на стене
    // driver.findElement(By.cssSelector("[class='ui_tab_plain ui_tab_search']")).click();
    //WebElement Teg2 = driver.findElement(By.cssSelector("[id='wall_search']"));
    //Teg2.click();
    //Teg2.sendKeys("Фотографии"+ Keys.ENTER);//слово поиска
    // WebElement Z1 = driver.findElements(By.cssSelector("[class= 'ui_search_field _field']")).get(0);
    //String Tag1 = Z1.getAttribute("textContent");

    // try (FileWriter writer = new FileWriter("F:\\Itogo\\test2.txt", true)) {
    // String text = Tag1;
    // writer.write(text);
    // writer.append('\n');
    // writer.append('\\');
    // writer.flush();
    // }

    //  catch (IOException ex) {

    //      System.out.println(ex.getMessage());
    // }
//
    //  }
//
}

