package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class EnrollAngularCourse extends CommonAPI {

    @Test

    public void EnrollAngular(){

        waitFor(3);

        driver.findElement(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/courses']")).click();
        waitFor(3);
        driver.findElement(By.cssSelector("img[src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/Oo4o9b0Q2iXk8WNvf0GC']")).click();
        waitFor(5);
        driver.findElement(By.xpath("//*[@id=\"block-63887016\"]/div/div/div/div[1]/div/ul/li[1]/a/div")).click();

    }

}
