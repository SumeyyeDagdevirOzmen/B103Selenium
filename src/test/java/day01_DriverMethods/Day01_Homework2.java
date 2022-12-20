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

        Point konum= new Point(10,12);//Konum
        System.out.println("Sayfanin Yeni Konum Degerleri = " +"("+ konum.x+","+konum.y+")");


        Dimension size =new Dimension(1000,875);//Boyut
        System.out.println("Sayfanin yeni boyutlari = " + "("+size.width+","+size.height+")");




        Thread.sleep(3000);
        driver.manage().window().setPosition(konum);
        Thread.sleep(3000);
        driver.manage().window().setSize(size);

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin


        if(size.width==1000 && size.height==875){
            System.out.println("Boyut Testi PASSED");
        }else{
            System.out.println("Boyut Testi FAILED");
        }

        if(konum.x==10 && konum.y==12){
            System.out.println("Konum Testi PASSED");
        }else{
            System.out.println("Konum Testi FAILED");
        }
        System.out.println("Son Konum Degerleri: "+driver.manage().window().getPosition());

        System.out.println("Son Boyut Degerleri: "+driver.manage().window().getSize());

        //Sayfayi kapatin
        driver.close();
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

/*
// Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
Point point = driver.manage().window().getPosition();
System.out.println(point);
if (point.equals(point)) {
    System.out.println("Browser konumu PASSED");
} else {
    System.out.println("Browser konumu FAILED");
}
Dimension dimension = driver.manage().window().getSize();
System.out.println(dimension);
if (dimension.equals(dimension)) {
    System.out.println("Browser boyutu PASSED");
} else {
    System.out.println("Browser boyutu FAILED");
}
 */

/*
 //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        int genislik = driver.manage().window().getSize().width;
        int yukseklik = driver.manage().window().getSize().height;
        int x =driver.manage().window().getPosition().x;
        int y =driver.manage().window().getPosition().y;
        if (genislik==800&&yukseklik==600&&x==80&&y==0){
            System.out.println("Width and Height test PASSED");
        }else{
            System.out.println("Width and Height test PASSED");
        }
 */