package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Consulting extends CommonAPI {

    @Test
    public void JobSupportTest(){

        driver.findElement(By.xpath("/html/body/div/div[2]/section[1]/div/div/div[1]/a")).click();
        waitFor(3);
        driver.findElement(By.id("username")).sendKeys("Tauhid Ahmed");
        driver.findElement(By.id("mobileno")).sendKeys("2021119000");
        driver.findElement(By.id("email")).sendKeys("tauhid3@example.com");
        driver.findElement(By.id("requirements")).sendKeys("This is just a sample text using Selenium");

        WebElement program = driver.findElement(By.xpath("//*[@id=\"programming-language\"]"));
        Select programDropDown = new Select(program);
        programDropDown.selectByValue("Java");

        //driver.findElement(By.xpath("//*[@id=\"sharing\"]")).click();
        driver.findElement(By.xpath("//input[@id='sharing']")).click();


        WebElement timezone = driver.findElement(By.xpath("//*[@id=\"timezone\"]"));
        Select timezoneDropDown = new Select(timezone);
        timezoneDropDown.selectByValue("America/New_York");

       driver.findElement(By.xpath("//*[@id=\"afford\"]")).click();



    }
}
