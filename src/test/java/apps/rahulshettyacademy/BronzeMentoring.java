package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BronzeMentoring extends CommonAPI {
    @Test

    public void Bronze(){

        driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[5]/a")).click();
        waitFor(3);
       driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/button/span")).click();
       waitFor(4);
       driver.findElement(By.id("name")).sendKeys("Tauhid");
       driver.findElement(By.id("email")).sendKeys("tauhid3@example.com");
       driver.findElement(By.id("mobile")).sendKeys("2021119000");
       driver.findElement(By.id("serviceType")).click();
       driver.findElement(By.id("bio")).sendKeys("This is just an example of adding a message using Selenium");

    }
}
