package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShipToNonBilling extends CommonAPI {
    @Test
    public void ShipToNonBilling() {

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
        driver.findElement(By.cssSelector("input[name='order.shipToFirstName']")).clear();
        driver.findElement(By.cssSelector("input[name='order.shipToFirstName']")).sendKeys("Joe");
        driver.findElement(By.cssSelector("input[name='order.shipToLastName']")).clear();
        driver.findElement(By.cssSelector("input[name='order.shipToLastName']")).sendKeys("Exotic");
        driver.findElement(By.cssSelector("input[name='order.shipAddress1']")).clear();
        driver.findElement(By.cssSelector("input[name='order.shipAddress1']")).sendKeys("Suwoop Gang");
        driver.findElement(By.cssSelector("input[name='order.shipAddress2']")).clear();
        driver.findElement(By.cssSelector("input[name='order.shipAddress2']")).sendKeys("Apt B's UP");
        driver.findElement(By.cssSelector("input[name='order.shipCity']")).clear();
        driver.findElement(By.cssSelector("input[name='order.shipCity']")).sendKeys("Bompton");
        driver.findElement(By.cssSelector("input[name='order.shipState']")).clear();
        driver.findElement(By.cssSelector("input[name='order.shipState']")).sendKeys("CA");
        driver.findElement(By.cssSelector("input[name='order.shipZip']")).clear();
        driver.findElement(By.cssSelector("input[name='order.shipZip']")).sendKeys("66666");
        driver.findElement(By.cssSelector("input[name='order.shipCountry']")).clear();
        driver.findElement(By.cssSelector("input[name='order.shipCountry']")).sendKeys("USA");

    }

}
