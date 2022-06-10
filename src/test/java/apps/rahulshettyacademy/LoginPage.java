package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends CommonAPI {

    @Test
    public void LoginPage(){
        driver.findElement(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/sign_in'")).click();

    }
}
