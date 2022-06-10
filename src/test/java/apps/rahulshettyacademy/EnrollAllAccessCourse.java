package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class EnrollAllAccessCourse extends CommonAPI {

    @Test

    public void AllAccessMembership(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/courses")).click();
        driver.findElement(By.cssSelector("img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/36X2X8fsRsC042XJQs6S']")).click();
        click("//button[text()='Enroll']");


    }
}
