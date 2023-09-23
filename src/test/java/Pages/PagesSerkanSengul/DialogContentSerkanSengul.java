package Pages.PagesSerkanSengul;


import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContentSerkanSengul extends Parent {

    public DialogContentSerkanSengul() {
        PageFactory.initElements(GWD.getDriver(), this);

    }

    @FindBy(className = "login")
    public WebElement SingButton;

    @FindBy(id = "email_create")
    public WebElement Email;

    @FindBy(id = "SubmitCreate")
    public WebElement CreatAcc;

    @FindBy(id = "id_gender1")
    public WebElement MrSelect;

    @FindBy(id = "customer_firstname")
    public WebElement Firstname;

    @FindBy(id = "customer_lastname")
    public WebElement LastName;

    @FindBy(id = "passwd")
    public WebElement Password;

    @FindBy(id = "days")
    public WebElement Days;

    @FindBy(id = "months")
    public WebElement Months;

    @FindBy(id = "years")
    public WebElement Years;

    @FindBy(id = "submitAccount")
    public WebElement SubmitAccount;

    @FindBy(css = "p[class='alert alert-success']")
    public WebElement Verify;


    @FindBy(id = "email")
    public WebElement EmailAdress;
    @FindBy(id = "SubmitLogin")
    public WebElement LoginButton;

    @FindBy(xpath = "(//*[@title='Contact us'])[1]")
    public WebElement ContactUS;
    @FindBy(id = "id_contact")
    public WebElement SubjectHeading;
    @FindBy(id = "message")
    public WebElement Message;

    @FindBy(id = "uniform-fileUpload")
    public WebElement ChooseFile;

    @FindBy(xpath = "(//*[@class='form-control'])[2]")
    public WebElement OrderRef;

    @FindBy(id = "submitMessage")
    public WebElement Send;
    @FindBy(id = "87_order_products")
    public WebElement Product;

    @FindBy(id = "search_query_top")
    public WebElement SearchBox;

    @FindBy(xpath = "(//*[@title='Printed Summer Dress'])[6]")
    public WebElement Productitem;

    @FindBy(id = "add_to_cart")
    public WebElement AddToCart;
    @FindBy(xpath = "(//*[@class='icon-chevron-right right'])[2]")
    public WebElement Proceed;
    @FindBy(css = "[title='Delete']")
    public WebElement DeleteBtn;

    public WebElement ElementGet(String element) {
        switch (element) {
            case "SingButton":
                return SingButton;
        }

        return null;
    }


}


