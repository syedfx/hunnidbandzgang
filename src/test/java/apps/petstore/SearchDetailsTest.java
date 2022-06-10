package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchDetailsTest extends CommonAPI {

    @Test

    public void searchDetails() {

        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("snake");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewProduct=&productId=RP-SN-01']")).click();
    }

}
