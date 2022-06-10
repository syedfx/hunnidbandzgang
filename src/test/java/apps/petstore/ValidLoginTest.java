package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidLoginTest extends CommonAPI {
    @Test
    public void ValidLogIn() {

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

    }


}
