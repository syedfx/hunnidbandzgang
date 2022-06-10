package apps.petstore;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignWithGoogle extends CommonAPI {

    @Test
    public void SignWithGoogle(){
        driver.findElement(By.cssSelector("a[href='actions/Catalog.action']")).click();
        driver.findElement(By.cssSelector("a[href='http://www.mybatis.org']")).click();
        driver.findElement(By.xpath("//*[@id=\"PageList1\"]/div/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"c5165584514665515148\"]/div[2]/span/a")).click();

    }
}
