package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchJavaTopic extends CommonAPI {
    @Test
    public void Search(){
        driver.findElement(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/courses'")).click();
        driver.findElement(By.id("search-courses")).sendKeys("Java");
        driver.findElement(By.id("search-course-button")).click();
    }
}
