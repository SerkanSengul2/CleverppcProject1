package Pages.SOPages;

import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SODialogContent extends Parent {

    public SODialogContent() {
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
    public WebElement deleteSecondAdress;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {

            case "nameInput": return this.nameInput;
            case "lastnameInput": return this.lastnameInput;
            case "addressInput": return this.addressInput;
            case "cityInput": return this.cityInput;
            case "zipCode": return this.zipCode;
            case "phone": return this.phone;
            case "addressAlias": return this.addressAlias;
        }
        return null;
    }

    // To Be DELETED

    @FindBy(css = "div[class='header_user_info']")
    public WebElement signInButton;

    @FindBy(id = "email")
    public WebElement emailText;

    @FindBy(id = "passwd")
    public WebElement passwordText;

    @FindBy(id = "SubmitLogin")
    public WebElement submitButton;
}
