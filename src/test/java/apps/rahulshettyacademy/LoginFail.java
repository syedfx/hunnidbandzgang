package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginFail extends CommonAPI {
    @Test
    public void loginFailTest(){
        driver.findElement(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/sign_in'")).click();
        driver.findElement(By.id("email")).sendKeys("johndoe@example.com");
        driver.findElement(By.id("password")).sendKeys("abc123");
        driver.findElement(By.xpath("/html/body/main/div/form/div[4]/input")).click();
    }
}
