package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UpdatePassWord extends CommonAPI {
    @Test
    public void newPassword() {

        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).click();
        driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("TigerKing");
        waitFor(5);
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
        waitFor(3);
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).sendKeys("exotic");
        waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
        driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
        waitFor(2);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("exotic1");
        waitFor(2);
        driver.findElement(By.cssSelector("input[name='repeatedPassword']")).sendKeys("exotic1");

    }


}


