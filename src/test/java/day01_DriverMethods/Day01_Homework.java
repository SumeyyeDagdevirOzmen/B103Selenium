package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_Homework {

    /*
    Youtube ana sayfasina gidelim . https://www.youtube.com/
    Amazon soyfasina gidelim. https://www.amazon.com/
    Tekrar YouTube’sayfasina donelim
    Yeniden Amazon sayfasina gidelim
    Sayfayi Refresh(yenile) yapalim
    Sayfayi kapatalim / Tum sayfalari kapatalim

     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com");
        Thread.sleep(3000);

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);

        // Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.quit();


    }
}
