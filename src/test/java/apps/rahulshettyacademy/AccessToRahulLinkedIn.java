package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AccessToRahulLinkedIn extends CommonAPI {
    @Test

    public void LinkedInRahul(){

        driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/ul/li[2]/a")).click();
    }
}
