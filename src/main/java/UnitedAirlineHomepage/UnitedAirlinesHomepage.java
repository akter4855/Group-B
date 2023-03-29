package UnitedAirlineHomepage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UnitedAirlinesHomepage extends CommonAPI {

    public UnitedAirlinesHomepage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
