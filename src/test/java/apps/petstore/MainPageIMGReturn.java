package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MainPageIMGReturn extends CommonAPI {

    @Test
    public void validateMainPageImageReturn() {
        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).click();
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"LogoContent\"]/a")).click();

    }
}
