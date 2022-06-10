package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class StartCoreJavaCourse extends CommonAPI {

    @Test

    public void JavaCourse(){

        driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Marshalllaw@example.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc123");
        waitFor(2);
        driver.findElement(By.xpath("/html/body/main/div/form/div[4]/input")).click();
        waitFor(3);
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[3]/a")).click();
        waitFor(5);
        driver.findElement(By.cssSelector("img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/EHNvJZiTZaHSTUusirJM'")).click();
        waitFor(3);
        driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/ul/li[1]/a/div/div")).click();


    }
}
