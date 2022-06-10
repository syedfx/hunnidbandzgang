package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidateMultiAnimals extends CommonAPI {
    @Test
    public void MultiPets() {
        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[5]/img")).click();
        waitFor(1);
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action']")).click();
        waitFor(1);
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[4]/img")).click();
        waitFor(1);
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action']")).click();
        waitFor(1);
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[3]/img")).click();
        waitFor(1);
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action']")).click();
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img")).click();
        waitFor(1);
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action']")).click();
        waitFor(1);
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img")).click();
        waitFor(1);
        driver.findElement(By.cssSelector("a[href='/actions/Catalog.action']")).click();

    }
}
