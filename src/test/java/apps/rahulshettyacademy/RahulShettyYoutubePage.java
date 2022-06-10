package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RahulShettyYoutubePage extends CommonAPI {

    @Test
    public void YoutubeTest(){

        driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/ul/li[1]/a")).click();
    }
}
