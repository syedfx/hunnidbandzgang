package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class WhatsNewSelenium extends CommonAPI {

    @Test

    public void whatsNewSelenium(){

      waitFor(5);
      driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[8]/a")).click();
        waitFor(5);
        driver.findElement(By.xpath("//*[@id=\"menu-item-1166\"]/a")).click();
        waitFor(5);
        driver.findElement(By.xpath("//*[@id=\"tve_editor\"]/div[3]/div[2]/div[25]/div[2]/div[2]/div/div[2]/div/div/a")).click();



    }
}
