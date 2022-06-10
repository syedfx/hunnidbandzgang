package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class BlogSelenium extends CommonAPI {

    @Test

    public void Blog(){

        driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[8]/a")).click();
        driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/blog/index.php/selenium-tutorial/'")).click();



    }
}
