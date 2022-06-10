package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectNonBillingAddress extends CommonAPI {
    @Test
    public void SelectNonBilling() {

        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).click();
        driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("TigerKing");
        waitFor(1);
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
        waitFor(1);
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).sendKeys("exotic");
        waitFor(1);
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[5]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
        driver.findElement(By.cssSelector("a[href='/actions/Cart.action?addItemToCart=&workingItemId=EST-18']")).click();
        driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
        waitFor(1);
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table/tbody/tr[2]/td[2]/select")).click();
        waitFor(1);
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table/tbody/tr[2]/td[2]/select/option[3]")).click();
        waitFor(1);
        driver.findElement(By.cssSelector("input[name='order.creditCard']")).clear();
        waitFor(1);
        driver.findElement(By.cssSelector("input[name='order.creditCard']")).sendKeys("123 4567 890");
        waitFor(1);
        driver.findElement(By.cssSelector("input[name='order.expiryDate']")).clear();
        waitFor(1);
        driver.findElement(By.cssSelector("input[name='order.expiryDate']")).sendKeys("12/13");
        waitFor(3);
        driver.findElement(By.cssSelector("input[name='shippingAddressRequired']")).click();
        driver.findElement(By.cssSelector("input[name='newOrder']")).click();

    }
}
