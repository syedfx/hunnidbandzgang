package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignInTest extends CommonAPI {
    @Test
    public void signIn() {

        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        waitFor(1);
        driver.findElement(By.cssSelector("input[type='text']")).click();
        waitFor(1);
        driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
        waitFor(1);
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("johndoe");
        waitFor(1);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("password");
        waitFor(1);
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();

    }
}
