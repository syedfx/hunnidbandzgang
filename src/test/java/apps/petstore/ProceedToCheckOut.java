package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ProceedToCheckOut extends CommonAPI {
    @Test
    public void proceedToCheckout() {

        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        waitFor(1);
        driver.findElement(By.cssSelector("input[type='text']")).click();
        waitFor(1);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("snake");
        waitFor(1);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        waitFor(1);
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewProduct=&productId=RP-SN-01']")).click();
        waitFor(1);
        driver.findElement(By.cssSelector("a[href='/actions/Cart.action?addItemToCart=&workingItemId=EST-11']")).click();
        waitFor(1);
        driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();

    }
}
