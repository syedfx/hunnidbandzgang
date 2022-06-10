package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FishIDDetails extends CommonAPI {
    @Test
    public void fishId() {
        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).click();
        driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[2]")).click();
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewProduct=&productId=FI-SW-01']")).click();
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewItem=&itemId=EST-1']")).click();

    }

}
