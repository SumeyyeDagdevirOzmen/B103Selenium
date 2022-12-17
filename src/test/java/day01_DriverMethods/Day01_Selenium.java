package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        /*
        En temel haliyle otomasyon yapmak icin Class'imiza otomasyon icin gerekli olan
        webdriver'in yerini gostermemiz gerekir. Bunun icin Java kutuphanesinden Sydtem.setProperty()
        method'unun icine ilk olarak driver'i yazariz. Iknci olaeak driver'in fiziki yolunu kopyalariz.
         */
        WebDriver driver = new ChromeDriver();// uzerine geldigimizde interface yazdigini göruruz.webdriver interface oldugu icin ondan obje olusturamiyoruz ama
                                                // chrome driver klasindan obje olusturabiliyoruz.

        driver.get("https://www.amazon.com");

    }
}
