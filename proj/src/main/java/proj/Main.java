package proj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main (String[] args ){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.airblue.com\n");
        driver.findElement(By.className("form-submit")).click();
    }

}
