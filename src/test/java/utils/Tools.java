package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Tools {

    private static WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromdriver\\chromedriver.exe");
    }


    public static WebElement myElement(By by) {
        WebElement element = driver.findElement(by);
        return element;
    }

    public static WebElement clearAndFill(By selector, String data) {
        WebElement element = driver.findElement(selector);
        element.clear();
        element.sendKeys(data);
        return element;
    }

    public static void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized", "--incognito");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Variables.Url);
        driver.manage().timeouts().implicitlyWait(5, SECONDS);

    }

    public static void finish() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
