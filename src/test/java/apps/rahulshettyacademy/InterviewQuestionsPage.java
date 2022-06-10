package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class InterviewQuestionsPage extends CommonAPI {

    @Test
    public void Interview(){

        driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[8]/a")).click();
        //waitFor(2);
        //driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/blog/index.php/automation-testing-interview-questions/")).click();

    }
}
