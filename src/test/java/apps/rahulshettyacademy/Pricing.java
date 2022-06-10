package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Pricing extends CommonAPI {

    @Test
    public void pricing() {
        driver.findElement(By.cssSelector("a[href = 'https://phptravels.com/order']")).click();
    }

}
