package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ViewMultipleFishIDTest extends CommonAPI {

    @Test
    public void viewMultipleFishId() {
        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).click();
        driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[2]")).click();
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewProduct=&productId=FI-SW-01']")).click();
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewItem=&itemId=EST-1']")).click();
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewProduct=&productId=FI-SW-01']")).click();
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewItem=&itemId=EST-2']")).click();

    }
}
