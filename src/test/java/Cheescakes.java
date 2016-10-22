import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by Alena on 22.10.2016.
 */
public class Cheescakes {




    @Test

    public void listCheesecakes() {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Alena\\geckodriver-v0.11.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.thecheesecakefactory.com");

        driver.findElement(By.linkText("Menu")).click();
        driver.findElement(By.linkText("Desserts")).click();
        driver.findElement(By.linkText("Cheesecake")).click();

        List<WebElement> cheesecakes = driver.findElements(By.xpath("id('leftNav_levelTwo')//li"));


        System.out.println(cheesecakes.size() + " cheesecakes:");

        for (int i=0; i<cheesecakes.size(); i++) {

            System.out.println(i+1 + ". " + cheesecakes.get(i).getText());

        }

    }









}
