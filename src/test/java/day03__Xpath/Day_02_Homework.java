package day03__Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day_02_Homework {
    public static void main(String[] args) {
              /*
            -Amazon sayfasına gidiniz
            -Arama kutusunu locate ediniz
            -Arama kutusunun tagName'inin input olduğunu test ediniz
            -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
            -Sayfayı kapatınız
            */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com/");

        // -Arama kutusunu locate ediniz
//        driver.findElement(By.id("twotabsearchtextbox"));
//        driver.findElement(By.cssSelector("input[type='text']"));



        //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search" spellcheck="false">


        // -Arama kutusunun tagName'inin input olduğunu test ediniz
        String arama =driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).getTagName();
        if(arama.equals("input")){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }
        //-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String attribute =driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).getAttribute("name");
        if(attribute.equals("field-keywords")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search" spellcheck="false">


        //Arama kutusunu locate ediniz

        //-Sayfayı kapatınız
        driver.close();


    }
}
