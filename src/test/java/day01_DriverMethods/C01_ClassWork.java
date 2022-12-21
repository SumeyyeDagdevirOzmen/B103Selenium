package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ClassWork {
    /*
    Yeni bir package olusturalim : day01
    Yeni bir class olusturalim : C03_GetMethods
    Amazon sayfasina gidelim. https://www.amazon.com/
    Sayfa basligini(title) yazdirin
    Sayfa basliginin “Amazon” icerdigini test edin
    Sayfa adresini(url) yazdirin
    Sayfa url’inin “amazon” icerdigini test edin.
    Sayfa handle degerini yazdirin
    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
    Sayfayi kapatin.

     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        // Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Basligi :" +driver.getTitle());

        // Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle=driver.getTitle();
        if(actualTitle.contains("Amazon")){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAILED");
        }

//        if(driver.getTitle().contains("Amazon")){
//            System.out.println("Evet baslik var");
//        }else{
//            System.out.println("Baslik Yok");
//        }

        // Sayfa adresini(url) yazdirin
        System.out.println("Sayfa Url = " + driver.getCurrentUrl());

        //Sayfa url’inin “amazon” icerdigini test edin.
//        String actualUrl = driver.getCurrentUrl();
//        if(actualUrl.contains("amazon")){
//            System.out.println("Url Testi PASSED");
//        }else System.out.println("Url Testi FAILED");

        // Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl= driver.getCurrentUrl();
        if(actualUrl.contains("amazon")){
            System.out.println("Url adresi  'amazon' kelimesini iceriyor.");
        }else{
            System.out.println("Url adresi  'amazon' kelimesini icermiyor.");
        }

        // Sayfa handle degerini yazdirin
        System.out.println("Window Handle Degeri :" +driver.getWindowHandle());

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin

        String sayfaKodlari= driver.getPageSource();
        if(sayfaKodlari.contains("Gateway")){
            System.out.println("Source Code Testi PASSED");
        }else{
            System.out.println("Source Code Testi FAILED");
        }
//
//        boolean str=driver.getPageSource().contains("Gateway");
//        System.out.println(str);

       driver.close();//Sayfayi kapatmak icin close() methodu kullaniriz.
        System.out.println("Amazon Sayfasi KApandi");
    }




}
