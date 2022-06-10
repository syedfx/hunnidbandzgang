package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LearningPathOnlyJava extends CommonAPI {

    @Test

    public void FilterJav(){

        driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/div/a[4]")).click();
    }
}
