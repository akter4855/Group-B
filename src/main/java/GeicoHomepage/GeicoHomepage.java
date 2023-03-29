package GeicoHomepage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GeicoHomepage extends CommonAPI {

    public GeicoHomepage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
