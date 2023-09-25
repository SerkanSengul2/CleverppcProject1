package Pages;

import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iremDialogContent extends Parent {
    public iremDialogContent() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(css = "div[class='header_user_info']>a")
    public WebElement signIn;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id = "SubmitLogin")
    public WebElement submitButton;









}
