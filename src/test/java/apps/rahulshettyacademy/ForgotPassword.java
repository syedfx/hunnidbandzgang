package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class ForgotPassword extends CommonAPI {
    @Test
    public void forgotPassword(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.cssSelector("a[href = '/account/']")).click();
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/li[2]/div[1]/a")).click();
        driver.findElement(By.id("mailTextBox")).sendKeys("JohnDoe@example.com");
        driver.findElement(By.xpath("//*[@id=\"sendRecoveryMailBtn\"]")).click();


    }
}
