package Pages.nurhayatPages;

import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContentNurhayat extends Parent {

    public DialogContentNurhayat() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(css = "a[class='login']")
    public WebElement signInBtn;

    @FindBy(id = "email")
    public  WebElement email;

    @FindBy(id = "passwd")
    public  WebElement password;

    @FindBy(id = "SubmitLogin")
    public WebElement submitLoginBtn;


    @FindBy (xpath = "(//a[@class='product-name'])[1]")
    public WebElement addToBtn;

    @FindBy(css = "[class='exclusive']")
    public WebElement addToCartBtn;

    @FindBy(css = "[title='Proceed to checkout']")
    public WebElement checkoutBtn;

    @FindBy (xpath = "(//a[@title='Proceed to checkout'])[2]")
    public WebElement checkoutBtn2;

    @FindBy(css = "[name='processAddress']")
    public WebElement checkoutBtn3;

    @FindBy(css = "input[type='checkbox']")
    public WebElement checkBoxBtn;

    @FindBy(name = "processCarrier")
    public WebElement checkoutBtn4;

    @FindBy(id = "paypal-standard-btn")
    public WebElement paypalBtn;

    @FindBy(css = "div[class='message']")
    public WebElement paypalErrorMsg;

    @FindBy(id = "ccBillForm")
    public WebElement creditCartBtn;

    @FindBy(xpath = "//body[text()='Invalid request (1).']")
    public WebElement creditCartErrorMsg;

    @FindBy(css = "[title='Pay by bank wire']")
    public WebElement bankCartBtn;

    @FindBy(css = "span[id='amount']")
    public WebElement total1;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement checkoutBtn5;

   @FindBy(css = "[class='price']")
   public WebElement total2;

    @FindBy(css = "[class='alert alert-success']")
    public WebElement message;

    @FindBy(css = "[title='Go to your order history page']")
    public WebElement orderHistory;
    @FindBy(xpath = "(//a[@class='color-myaccount'])[1]")
    public WebElement orderMessage;












}
