package Pages;

import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(css = "a[class='product-name']")
    public List<WebElement> summerDress;

    @FindBy(css = "button[name='Submit'] > span")
    public WebElement addToCart;

    @FindBy(css = "span[title='Continue shopping']")
    public WebElement continueShopping;

    @FindBy(css = "a[title='View my shopping cart']")
    public WebElement shoppingCart;

    @FindBy(css = "span[id='summary_products_quantity']")
    public WebElement shoppingText;









}
