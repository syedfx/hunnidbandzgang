package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvalidLoginAccount extends CommonAPI {
    @Test
    public void InvalidloginTest(){

        driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("JohnDoe@abc.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd1234");
        driver.findElement(By.xpath("/html/body/main/div/form/div[4]/input")).click();

    }
}
