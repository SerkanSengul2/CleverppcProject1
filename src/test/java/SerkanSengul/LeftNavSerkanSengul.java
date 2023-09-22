package SerkanSengul;

import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LeftNavSerkanSengul extends Parent {

    public LeftNavSerkanSengul() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    public WebElement GetWebelement(String element) {
        switch (element) {
        }
        return null;
    }
}
