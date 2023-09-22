package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.GWD;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
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



    @FindBy(css = "a[class='product-name']")
    public List<WebElement> allSummerDresses;

    @FindBy(css = "button[name='Submit'] > span")
    public WebElement addToCartButton;

    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement confirmText;


    @FindBy(css = "span[class='cat-name']")
    public WebElement dressesText;




    public WebElement ElementGet(String element) {
        switch (element) {
        }
        return null;
    }t

    @FindBy(css ="")
    public WebElement cardBtn;

    @FindBy(css ="")
    public WebElement checkOutBtn;

    @FindBy(css ="")
    public WebElement adresChecked;


}
