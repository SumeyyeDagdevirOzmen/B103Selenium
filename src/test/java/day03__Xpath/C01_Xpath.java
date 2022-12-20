package day03__Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//        1 - https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

//        2 - Add Element butonuna basin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();

//        3 Delete butonu’nun gorunur oldugunu test edin

       WebElement deleteButonu=  driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
       if(deleteButonu.isDisplayed()){//Bir web elementin gorunur olup olmadigini isDisplayed() methodu ile bakariz.
           System.out.println("Test PASSED");
       }else System.out.println("Test FAILED");


//        4 Delete tusuna basin
//        5 “Add / Remove Elements”yazisinin gorunur oldugunu test edin
    }
}
/*
//https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

//Add Element butonuna basin
driver.findElement(By.xpath("//*[text() ='Add Element']")).click();

//Delete butonu'nun gorunur oldugunu test edin
WebElement delete = driver.findElement(By.xpath("//*[text() ='Delete']"));
if (delete.isDisplayed()){
    System.out.println("delete button test PASSED");
}else System.out.println("delete button test FAILED!!!");

//Delete tusuna basin
delete.click();

//"Add/Remove Elements" yazisinin gorunur oldugunu test edin
WebElement add_remove = driver.findElement(By.xpath("//*[text() ='Add/Remove Elements']"));
if (add_remove.isDisplayed()){
    System.out.println("add/remove test PASSED");
}else System.out.println("add/remove test FAILED!!!");
 */