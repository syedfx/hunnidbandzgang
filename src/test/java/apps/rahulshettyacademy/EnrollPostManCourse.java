package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EnrollPostManCourse extends CommonAPI {

    @Test

    public void PostManCourse(){

        driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[2]/a")).click();
        waitFor(3);
        driver.findElement(By.cssSelector("img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/sLVgDa8kQ1SncAbyxjpk']")).click();
        waitFor(3);
        driver.findElement(By.xpath("//*[@id=\"watchpromo\"]")).click();


    }
}
