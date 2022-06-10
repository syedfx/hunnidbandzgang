package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EnrollSoftwareQualityAssurance extends CommonAPI {

    @Test
    public void EnrollQA(){

        waitFor(5);
        driver.findElement(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/courses")).click();
        waitFor(5);
        driver.findElement(By.cssSelector("img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/jQsdyYATUOK9hAc4cbNP'")).click();
        waitFor(5);
        driver.findElement(By.xpath("//*[@id=\"enroll-button\"]")).click();
        waitFor(5);
        driver.findElement(By.xpath("//*[@id=\"react-checkout\"]/div/div/div[1]/div[2]/div/button")).click();
        waitFor(5);
        driver.findElement(By.cssSelector("input[placeholder='Coupon code'")).sendKeys("Shetty");
        waitFor(3);
        driver.findElement(By.xpath("//*[@id=\"react-checkout\"]/div/div/div[1]/div[2]/div/div[2]/div/div[1]/div/button")).click();
    }
}
