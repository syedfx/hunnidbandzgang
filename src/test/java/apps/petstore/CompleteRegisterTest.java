package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CompleteRegisterTest extends CommonAPI {
    @Test
    public void RegisterNow() {

        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).click();
        driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("abc123");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[name='account.firstName']")).sendKeys("Zimu");
        driver.findElement(By.cssSelector("input[name='account.lastName']")).sendKeys("Nacer");
        driver.findElement(By.cssSelector("input[name='account.email']")).sendKeys("Nacer@xyz.com");
        driver.findElement(By.cssSelector("input[name='account.phone']")).sendKeys("123-456-7890");
        driver.findElement(By.cssSelector("input[name='account.address1']")).sendKeys("123 456 Avenue");
        driver.findElement(By.cssSelector("input[name='account.address2']")).sendKeys("Apartment 2");
        driver.findElement(By.cssSelector("input[name='account.city']")).sendKeys("LIC");
        driver.findElement(By.cssSelector("input[name='account.state']")).sendKeys("NY");
        driver.findElement(By.cssSelector("input[name='account.zip']")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[name='account.country']")).sendKeys("USA");
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();


    }
}
