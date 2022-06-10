package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ReptilePage extends CommonAPI {
    @Test
    public void validateReptilesPage() {
        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[4]")).click();
    }
}
