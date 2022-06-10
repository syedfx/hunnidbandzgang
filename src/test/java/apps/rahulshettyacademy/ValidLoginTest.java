package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidLoginTest extends CommonAPI {

    @Test

    public void ValidAccountTest() {

        driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Marshalllaw@example.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc123");
        driver.findElement(By.xpath("/html/body/main/div/form/div[4]/input")).click();
    }

}
