package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebelementsVeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidelim
        driver.get("https://amazon.com");

        //Search bolumunu locate edelim
        //WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));

        //Search bolumunde iphone aratali.
        aramaKutusu.sendKeys("iphone", Keys.ENTER);
        /*
        Eger bir webelementi(Web sayfasindaki herbir buton yada text/yazi) locate(konumunu belirleme) etmek istersek
        once manuel olarak web sayfasini acip sayfa uzerinde sag click yapip incele(inspect)'e tiklariz.
        Karsimiza cikan HTML kodlarindan locater(konum belirleyiciler)'lardan essiz olani seceriz.
        Genellikle id attribute'u kullanilir.Sectigimiz attribute degerini findelement() methodu icine
        findelement(By.id("attribute degeri")) seklinde yazariz.
         */

        //Amazon sayfasindaki <input> ve <a> taglarinin sayisini yazdiriniz.

        List<WebElement> inputTags =driver.findElements(By.tagName("input"));
        System.out.println("Input Tag Sayisi= "+inputTags.size());
        List<WebElement> linklerList =driver.findElements(By.tagName("a"));
        System.out.println("Link Sayisi= "+linklerList.size());

        //linklerList.stream().forEach(t-> System.out.println(t.getText()));


        for (WebElement w:linklerList){
            System.out.println(w.getText());
        }






    }
}
