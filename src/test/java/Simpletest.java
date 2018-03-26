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
import org.openqa.selenium.interactions.Actions;
import java.io.FileWriter;
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

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // WebElement element = driver.findElements(By.cssSelector("")).get(1);
        //element.click();
        driver.get("https://vk.com/stolica_chernozemia"); //страница вк
        WebElement myWebEl = driver.findElements(By.cssSelector("[class='wall_post_text']")).get(0); // гет () - значения которого по счету поста необходимо вернуть
        String Zap = myWebEl.getAttribute("textContent");
        try (FileWriter writer = new FileWriter("F:\\Itogo\\test1.txt", true)) {
            String text = Zap;
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('\\');
            writer.flush();
        }
        //поиск по СЛОВУ в записях на стене
        driver.findElement(By.cssSelector("[class='ui_tab_plain ui_tab_search']")).click();
        WebElement Teg2 = driver.findElement(By.cssSelector("[id='wall_search']"));
        Teg2.click();
        Teg2.sendKeys("Фотографии"+ Keys.ENTER);//слово поиска

        WebElement Z1 = driver.findElements(By.cssSelector("[class= 'ui_search_field _field']")).get(0);
        String Tag1 = Z1.getAttribute("textContent");

        try (FileWriter writer = new FileWriter("F:\\Itogo\\test2.txt", true)) {
            String text = Tag1;
            writer.write(text);
            writer.append('\n');
            writer.append('\\');
            writer.flush();
        }

        catch (IOException ex) {

                System.out.println(ex.getMessage());
            }

        }


        // Actions actions = new Actions(driver).click(); //наведение мыши на элемент
        // actions.moveToElement(element).build().perform();// наведение мыши на элемент


    }







