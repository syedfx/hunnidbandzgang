package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PythonCourseInfo extends CommonAPI {
    @Test
    public void courseInfoPython(){

        driver.findElement(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/courses'")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[14]/div/div[1]/a/div/div[1]/img")).click();

    }
}
