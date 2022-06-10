package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Help extends CommonAPI {
    @Test
    public void help() {

        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).click();
        waitFor(2);
        driver.findElement(By.cssSelector("a[href='../help.html']")).click();


    }
}
