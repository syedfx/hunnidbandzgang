package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Enroll extends CommonAPI {
    @Test
    public void Enroll(){
        driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"enroll-button-top\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"new_sale\"]/div[1]/label[1]/div[3]/button")).click();
    }
}
