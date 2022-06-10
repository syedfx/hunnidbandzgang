package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogoutAccount extends CommonAPI {

    @Test

    public void Logout(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Marshalllaw@example.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc123");
        driver.findElement(By.xpath("/html/body/main/div/form/div[4]/input")).click();

        driver.findElement(By.cssSelector("a[href ='#']")).click();
        driver.findElement(By.cssSelector("a[href='/current_user/subscriptions']")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[7]/a")).click();


    }
}
