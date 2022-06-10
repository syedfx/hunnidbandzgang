package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

    @Test
    public void test1() {
        driver.getTitle();

    }


    @Test
    public void CatalogPage() {
        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
    }



}
