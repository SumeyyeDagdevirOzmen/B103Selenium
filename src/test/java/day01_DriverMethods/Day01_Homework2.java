package day01_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Homework2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu: " +driver.manage().window().getPosition()+"\n"+
                "Sayfanin Boyutu: "+driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Dimension d =new Dimension(1000,1000);
        System.out.println("Sayfanin yeni boyutlari = " + "("+d.width+","+d.height+")");

        Point p= new Point(10,12);
        System.out.println("Sayfanin Yeni Konum Degerleri = " +"("+ p.x+","+p.y+")");
        driver.manage().window().setPosition(p);
        driver.manage().window().setSize(d);

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        if(d.width==1000 && d.height==1000){
            System.out.println("Konum Testi PASSED");
        }else{
            System.out.println("Konum Testi FAILED");
        }

        if(p.x==10 && p.y==12){
            System.out.println("Boyut Testi PASSED");
        }else{
            System.out.println("Boyut Testi FAILED");
        }

        //Sayfayi kapatin
        driver.quit();
    }
}