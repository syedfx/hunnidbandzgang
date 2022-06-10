package apps.rahulshettyacademy;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class UpdateBillingAddress extends CommonAPI {

    @Test

    public void UpdateAddress(){

        waitFor(3);

        driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Marshalllaw@example.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc123");
        driver.findElement(By.xpath("/html/body/main/div/form/div[4]/input")).click();
        waitFor(3);

        driver.findElement(By.cssSelector("a[href ='#']")).click();
        driver.findElement(By.cssSelector("a[href='/current_user/subscriptions']")).click();
        waitFor(3);
        driver.findElement(By.cssSelector("a[href='/secure/9521/current_user/address']")).click();
        waitFor(3);

        WebElement country = driver.findElement(By.xpath("//*[@id=\"cardCountry\"]"));
        Select countryDropDown = new Select(country);
        countryDropDown.selectByValue("US");

        driver.findElement(By.id("billingStreetAddressLine1")).sendKeys("2002 Ellenway Apt 101");
        driver.findElement(By.id("billingCity")).sendKeys("Baltimore");

        WebElement state = driver.findElement(By.xpath("//*[@id=\"billingRegion\"]"));
        Select stateDropDown = new Select(state);
        stateDropDown.selectByValue("MD");

        driver.findElement(By.id("billingPostalCode")).sendKeys("21121");
        driver.findElement(By.xpath("//*[@id=\"react-address-profile\"]/div/button")).click();












    }
}
