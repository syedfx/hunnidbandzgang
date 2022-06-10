package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class ReferFriendCopyURL extends CommonAPI {

    @Test

    public void Referral(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Marshalllaw@example.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc123");
        driver.findElement(By.xpath("/html/body/main/div/form/div[4]/input")).click();

        driver.findElement(By.cssSelector("a[href ='#']")).click();
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[9]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"react-refer-a-friend\"]/div/div[1]/div[2]/button")).click();




    }
}
