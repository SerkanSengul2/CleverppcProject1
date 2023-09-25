package Pages.PagesIrem;

import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iremDialogContent extends Parent {

    public iremDialogContent(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Add to cart'])[1]")
    public WebElement AddToCart1;

    @FindBy(css = "span[title='Continue shopping']")
    public WebElement ContinueShopping1;

    @FindBy(xpath = "(//span[text()='Add to cart'])[2]")
    public WebElement AddToCart2;

    @FindBy(css = "span[title='Continue shopping']")
    public WebElement ContinueShopping2;

    @FindBy(xpath = "(//span[text()='Add to cart'])[3]")
    public WebElement ContinueShopping3;



}
