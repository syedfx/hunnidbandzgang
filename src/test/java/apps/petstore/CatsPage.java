package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CatsPage extends CommonAPI {
    @Test
    public void validateCatPage() {
        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[3]")).click();
    }
}
