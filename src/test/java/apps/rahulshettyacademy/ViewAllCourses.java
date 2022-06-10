package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ViewAllCourses extends CommonAPI {
    @Test
    public void Courses(){

        driver.findElement(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/courses")).click();
    }
}
