package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InValidSearch extends CommonAPI {
    @Test
    public void searchTest() {

        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Zebra");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }

}
