package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddMoreSearchItemsTest extends CommonAPI {
    @Test
    public void addAdditionalItems() {
        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).click();
        driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[2]")).click();
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewProduct=&productId=FI-SW-01']")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Bulldog");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();

    }
}
