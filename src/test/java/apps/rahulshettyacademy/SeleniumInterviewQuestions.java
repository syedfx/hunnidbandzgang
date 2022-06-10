package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SeleniumInterviewQuestions extends CommonAPI {

    @Test

    public void SeleniumInterview() {

        driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[8]/a")).click();
        waitFor(8);
        driver.findElement(By.xpath("//*[@id=\"tve_editor\"]/div[6]/div[1]/div[2]")).click();


    }
}
