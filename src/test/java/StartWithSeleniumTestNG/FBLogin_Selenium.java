package StartWithSeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin_Selenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares & Dependencies\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("abc");
        driver.findElement(By.name("login")).click();
        driver.quit();
    }
}
