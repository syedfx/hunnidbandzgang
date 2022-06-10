package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PracticePage extends CommonAPI {
    @Test

    public void Practice(){

        driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[7]/a")).click();
        driver.findElement(By.id("name")).sendKeys("Marshall Law");
        driver.findElement(By.id("email")).sendKeys("marshalllaw@example.com");
    }
}
