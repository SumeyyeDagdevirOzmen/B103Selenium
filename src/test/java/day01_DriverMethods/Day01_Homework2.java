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
        Thread.sleep(2000);

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu: " +driver.manage().window().getPosition()+"\n"+
                "Sayfanin Boyutu: "+driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
//        driver.manage().window().setSize(new Dimension(10,12));
//        driver.manage().window().setPosition(new Point(1000,1000));
//
        Point p= new Point(10,12);//Konum
        System.out.println("Sayfanin Yeni Konum Degerleri = " +"("+ p.x+","+p.y+")");


        Dimension d =new Dimension(1000,875);//Boyut
        System.out.println("Sayfanin yeni boyutlari = " + "("+d.width+","+d.height+")");


        Thread.sleep(3000);
        driver.manage().window().setPosition(p);
        Thread.sleep(3000);
        driver.manage().window().setSize(d);

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin


        if(d.width==1000 && d.height==875){
            System.out.println("Konum Testi PASSED");
        }else{
            System.out.println("Konum Testi FAILED");
        }

        if(p.x==10 && p.y==12){
            System.out.println("Boyut Testi PASSED");
        }else{
            System.out.println("Boyut Testi FAILED");
        }
        System.out.println("Son Konum Degerleri: "+driver.manage().window().getPosition());

        System.out.println("Son Boyut Degerleri: "+driver.manage().window().getSize());

        //Sayfayi kapatin
        driver.quit();
    }
}

/*
 // 5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
   int x=driver.manage().window().getPosition().getX();
   int y=driver.manage().window().getPosition().getY();
   int width=driver.manage().window().getSize().getWidth();
   int height=driver.manage().window().getSize().getHeight();

   if (x==0 && y==0 && width==500 && height==500){
       System.out.println("Test PASSED");
   }else{
       System.out.println("TEST FAILED");
   }
 */