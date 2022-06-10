package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Blog extends CommonAPI {
    @Test
    public void Blog(){
        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("a[href='http://www.mybatis.org']")).click();

    }
}
