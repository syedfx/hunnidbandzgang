package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RemoveFishQauntityTest extends CommonAPI {

    @Test
    public void EmptyCart() {
        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).click();
        driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[2]")).click();
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action?viewProduct=&productId=FI-SW-01']")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
        driver.findElement(By.cssSelector("input[name='EST-1']")).sendKeys("4");
        driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[3]/td[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")).click();


    }
}
