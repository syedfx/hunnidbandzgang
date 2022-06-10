package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class PartTimeJobs extends CommonAPI {

    @Test
    public void PartTime(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[9]/a")).click();
        driver.findElement((By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[9]/ul/li[2]/a"))).click();

        WebElement jobs = driver.findElement(By.xpath("//*[@id=\"select-job-type\"]"));
        Select jobDropDown = new Select(jobs);
        jobDropDown.selectByValue("qaArticle");

        driver.findElement(By.xpath("//*[@id=\"partTimeJobForm\"]/div/div[2]/div/p/a")).click();
    }
}
