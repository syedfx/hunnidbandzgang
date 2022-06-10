package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoggedinParrotCheckOut extends CommonAPI {
    @Test
    public void ParrotCheckOut() {

        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).click();
        driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("TigerKing");
        waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
        waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).sendKeys("exotic");
        waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[5]/img")).click();
        waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
        driver.findElement(By.cssSelector("a[href='/actions/Cart.action?addItemToCart=&workingItemId=EST-18']")).click();
        waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
        waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
        waitFor(2);
        driver.findElement(By.cssSelector("a[href='/actions/Order.action?newOrder=&confirmed=true']")).click();

    }
}
