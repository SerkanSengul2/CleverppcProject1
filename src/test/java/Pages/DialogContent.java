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
    @FindBy(css = "a[class='product-name']")
    public List<WebElement> allSummerDresses;

    @FindBy(css = "button[name='Submit'] > span")
    public WebElement addToCartButton;

    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement confirmText;

    @FindBy(css = "span[class='category-name']")
    public WebElement dressesText;

    @FindBy(css = "span[class='heading-counter']")
    public WebElement headingCounter;

    @FindBy(xpath = "(//div[@class='product-count'])[1]")
    public WebElement productCount;

    @FindBy(css = "[id='product_list'] > li")
    public List<WebElement> allProducts;

    @FindBy(css = "a[title='Sitemap']")
    public WebElement sitemapButton;

    @FindBy(css = "h1[class='page-heading']")
    public WebElement sitemapText;

    @FindBy(css = "a[title='View a list of my addresses']")
    public WebElement addressButton;

    @FindBy(css = "h1[class='page-heading']")
    public WebElement addressText;

    @FindBy(css = "a[title='Add an address']")
    public WebElement newAddressButton;

    @FindBy(id = "firstname")
    public WebElement nameInput;

    @FindBy(id = "lastname")
    public WebElement lastnameInput;

    @FindBy(id = "address1")
    public WebElement addressInput;

    @FindBy(id = "city")
    public WebElement cityInput;

    @FindBy(id = "id_state")
    public WebElement state;

    @FindBy(id = "postcode")
    public WebElement zipCode;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "alias")
    public WebElement addressAlias;

    @FindBy(id = "submitAddress")
    public WebElement saveButton;

    @FindBy(xpath = "(//h3[@class='page-subheading'])[2]")
    public WebElement addressConfirm;

    @FindBy(xpath = "(//a[@title='Delete'])[2]")
    public WebElement deleteSecondAddress;

    @FindBy(css = "span[title='Continue shopping']")
    public WebElement continueShoppingButton;

    @FindBy(css = "td[data-title='Total'] span")
    public List<WebElement> productsPrice;

    @FindBy(id = "total_product")
    public WebElement totalPrice;

    @FindBy(css = "div[id='center_column'] > p")
    public WebElement alertText;

    @FindBy(linkText = "Best sellers")
    public WebElement bestSellersButton;

    @FindBy(css = "div[id='center_column'] > h1")
    public WebElement bestSellerText;

    @FindBy(id = "facebook_block")
    public WebElement facebookBlock;

    @FindBy(css = "a[target='_blank']")
    public WebElement facebookLink;

    @FindBy(css = "[title='Xu Clothing']")
    public WebElement backToMainPage;

    @FindBy(className = "login")
    public WebElement SingButton;

    @FindBy(id = "email_create")
    public WebElement Email;

    @FindBy(id = "SubmitCreate")
    public WebElement CreateAcc;

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

    @FindBy(xpath = "(//*[@class='product-name'])[5]")
    public WebElement Productitem;

    @FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement AddToCart;
    @FindBy(xpath = "(//*[@class='icon-chevron-right right'])[2]")
    public WebElement Proceed;
    @FindBy(css = "[title='Delete']")
    public WebElement DeleteBtn;

    public WebElement ElementGet(String element) {
        switch (element) {
            case "nameInput": return this.nameInput;
            case "lastnameInput": return this.lastnameInput;
            case "addressInput": return this.addressInput;
            case "cityInput": return this.cityInput;
            case "zipCode": return this.zipCode;
            case "phone": return this.phone;
            case "addressAlias": return this.addressAlias;
            case "SingButton": return SingButton;
            case "Email":return Email;
            case "CreateAcc":return CreateAcc;
            case "Firstname":return Firstname;
            case "LastName":return LastName;
            case "Password":return Password;
            case "MrSelect":return MrSelect;
        }

        return null;
    }


}


