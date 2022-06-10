package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactUsPage extends CommonAPI {
    @Test
    public void ContactUs(){

        driver.findElement(By.xpath("/html/body/div/footer/div/div/div/div[2]/ul/li[2]/a")).click();
    }
}
