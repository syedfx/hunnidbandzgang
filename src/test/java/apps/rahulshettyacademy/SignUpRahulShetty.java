package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignUpRahulShetty extends CommonAPI {
    @Test
    public void SignUp(){
        driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[1]/a")).click();
        driver.findElement(By.id("user_email")).sendKeys("Marshalllaw@example.com");
        driver.findElement(By.id("password")).sendKeys("abc123");
        driver.findElement(By.xpath("/html/body/main/div/form/div[6]/input")).click();


    }
}
