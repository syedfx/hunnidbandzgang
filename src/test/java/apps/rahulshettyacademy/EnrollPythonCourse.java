package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EnrollPythonCourse extends CommonAPI {
    @Test
    public void CourseEnroll(){

        driver.findElement(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/courses'")).click();
        waitFor(5);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[14]/div/div[1]/a/div/div[1]/img")).click();
        waitFor(5);
        driver.findElement(By.id("enroll-button")).click();


    }
}
