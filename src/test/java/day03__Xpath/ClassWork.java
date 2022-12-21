package day03__Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder=""
        // class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search" spellcheck="false">
        // Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

        // Arama kutusunun tagName'inin input olduğunu test ediniz
        String actualTagName = aramaKutusu.getTagName();
        String expectedTagName ="input";
        if(actualTagName.equals(expectedTagName)){
            System.out.println("TagName testi PASSED "+actualTagName);
        }else System.out.println("TagName testi FAILED");

        // Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String actualAttributeName = aramaKutusu.getAttribute("name");
        String expectedAttributeName ="field-keywords";
        if(actualAttributeName.equals(expectedAttributeName)){
            System.out.println("Attribute Testi PASSED");
        }else System.out.println("Attribute Testi FAILED");
         // Sayfayı kapatınız

        driver.quit();

    }
}
