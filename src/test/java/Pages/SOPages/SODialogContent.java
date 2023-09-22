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
}
