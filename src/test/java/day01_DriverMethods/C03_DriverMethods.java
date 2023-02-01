package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//Bos bir browser actik.
        driver.get("https://www.amazon.com");//ilk olarak gitmek istedigimiz sayfayi belirtiriz
        System.out.println("Sayfa Basligi: "+driver.getTitle());
        System.out.println("Sayfa Url'i = " + driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());//Hash Code'u verir. CDwindow-C66935F693AA312929B10AF36C098038 Diger pencereye gecmek icin kullanilir.
        //WindowHandle bize o window'a ait hash degerini verir.Biz bu hash degerlerini bir String'e atayip pencereler arasi gecis yapabiliriz.



    }
}
