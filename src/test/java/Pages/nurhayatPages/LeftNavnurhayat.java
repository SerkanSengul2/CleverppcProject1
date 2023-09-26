package Pages.nurhayatPages;

import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavnurhayat extends Parent {
    public LeftNavnurhayat() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@title='Dresses'])[2]")
    public WebElement dresBtn;

}
