package day03__Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_CssSelector {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-C01_TekrarTesti isimli bir class olusturun
        // 2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        // 3- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5-Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String arananKelime ="Spend less";
        if(actualTitle.contains(arananKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //6-Gift Cards sekmesine basin
        driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();

        //7-Birthday butonuna basin
        driver.findElement(By.cssSelector("img[alt='Birthday']")).click();

        //8- Best Seller bolumunden ilk urunu tiklayin
        List<WebElement> bestSellerBolumu = driver.findElements(By.cssSelector("img[alt='Amazon.com eGift Card']"));
        bestSellerBolumu.get(0).click();

        //9- Gift card details’den 25 $’i secin
        driver.findElement(By.cssSelector("span[id='a-autoid-28']")).click();

        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcreti = driver.findElement(By.cssSelector("span[id='gc-live-preview-amount']"));
        if(urunUcreti.getText().equals("25$.00")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");


        //10-Sayfayi kapatin
        driver.close();

        /*
        /*
-Amazon sayfasına gidiniz
-Arama kutusunu locate ediniz
-Arama kutusunun tagName'inin input olduğunu test ediniz
-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
-Sayfayı kapatınız
 */

























    }
}
/*
driver.get("https://www.amazon.com/");
driver.navigate().refresh();
if (driver.getTitle().contains("Spend less")){
    System.out.println("Title Test PASSED");
}System.out.println("Title Test FAILED");
driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
driver.findElement(By.xpath("//*[@id=\"contentGrid_850952\"]/div/div[2]/div[2]/div/div/a"));
driver.findElement(By.xpath("//*[@id=\"acs-product-block-0\"]/div[1]/a/img"));
driver.findElement(By.xpath("//*[@id=\"gc-mini-picker-amount-1\"]"));
String ucret = driver.findElement(By.xpath("//*[@id=\"gc-buy-box-text\"]/span")).getText();
if(ucret.equals("25$")){
    System.out.println("Ucret Testi PASSED");
}else System.out.println("Ucret Testi FAILED");
driver.close();
 */




        /*
        String actualUcret = ucret.getText();
    if(actualUcret.equals("25$")){
    System.out.println("ucret testi PASSED");
    }else System.out.println("ucret testi FAILED!!!"+ actualUcret);
         */