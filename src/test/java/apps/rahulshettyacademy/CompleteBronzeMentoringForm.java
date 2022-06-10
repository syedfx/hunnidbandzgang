package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CompleteBronzeMentoringForm extends CommonAPI {
    @Test

    public void CompleteForm(){

        driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[5]/a")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/button/span")).click();
        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Hi");



    }
}
