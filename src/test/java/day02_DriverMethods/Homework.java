package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        /*
        //1-Test01 isimli bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        //3- Browseri tam sayfa yapin
        //4-Sayfayi "refresh" yapin
        //5-"Salesforce Apex Questions Bank" icin arama yapiniz
        //6- Kac sonuc bulundugunu yaziniz
        //7-Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();
        //4-Sayfayi "refresh" yapin
        driver.navigate().refresh();
        //5-"Salesforce Apex Questions Bank" icin arama yapiniz
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Salesforce Apex Questions Bank", Keys.ENTER);
        //6- Kac sonuc bulundugunu yaziniz
        WebElement aramaSonucYazisi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.getText());

        //7-Sayfayi kapatin
        driver.close();

        /*
        Google search
        1- Open a chrome browser --crom tarayici acin
        2- Go to: https://google.com......gir google
        3- Write "apple" in search box......Arama kutusuna apple yazin
        4- Click google search button,,,,,arama butonuna tiklayin
        5- Verify title:....basligi dogrulayin
        Expected: Title should start with "apple" word....baslik elma kelimesiyle baslamalidir
           */
//        // 1- Open a chrome browser --crom tarayici acin
////        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
////        WebDriver driver = new ChromeDriver();
// //       driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//
//
//        // 2- Go to: https://google.com......gir google
//        driver.get(" https://google.com");
//
//        // 3- Write "apple" in search box......Arama kutusuna apple yazin
//        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
//        aramaKutusu.sendKeys("apple", Keys.ENTER);
//
//        //  5- Verify title:....basligi dogrulayin
//        WebElement aramsonucYazisi= driver.findElement(By.className("sg-col-inner"));
//        System.out.println(aramsonucYazisi.getText());
//
//        //  Expected: Title should start with "apple" word....baslik elma kelimesiyle baslamalidir
//        String baslik=aramsonucYazisi.getText();
//        if (baslik.startsWith("apple")){
//            System.out.println("Baslik testi passed");
//        }else{
//            System.out.println("baslik testi failed");
//        }
//
//  driver.close();


    }
}
