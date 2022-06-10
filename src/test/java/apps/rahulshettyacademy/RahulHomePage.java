package apps.rahulshettyacademy;

import base.CommonAPI;
import org.testng.annotations.Test;

public class RahulHomePage extends CommonAPI {

    @Test
    public void HomePage(){
        driver.getTitle();
    }
}
