package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BirdsPage extends CommonAPI {
    @Test
    public void validateBirdPage() {
        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[5]")).click();
    }
}
