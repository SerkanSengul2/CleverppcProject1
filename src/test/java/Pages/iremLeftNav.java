package Pages;

import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iremLeftNav extends Parent {
    public iremLeftNav() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    public WebElement dressesBtn;




}
