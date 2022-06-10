package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FilterCurrency extends CommonAPI {

    @Test

    public void FilterCurrency(){

        driver.findElement(By.xpath("/html/body/div/div[2]/section[2]/div[1]/div[1]/div[2]/div/label")).click();
    }
}
