package Walmart;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WalmartHomepage extends CommonAPI {

    public WalmartHomepage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
