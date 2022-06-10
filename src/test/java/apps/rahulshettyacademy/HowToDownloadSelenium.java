package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HowToDownloadSelenium extends CommonAPI {

    @Test
    public void DownloadInstallSelenium(){

        driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[8]/a")).click();
        driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/blog/index.php/selenium-tutorial/'")).click();
        driver.findElement(By.xpath("//*[@id=\"tve_editor\"]/div[3]/div[2]/div[5]/div[2]/div[2]/div/div[2]/div/div/a")).click();

    }
}
