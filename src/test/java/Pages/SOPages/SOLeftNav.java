package Pages.SOPages;

import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SOLeftNav extends Parent {

    public SOLeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "a[title='Women']")
    public WebElement womenButton;

    @FindBy(linkText = "Summer Dresses")
    public WebElement summerDressesButton;

    @FindBy(xpath = "(//*[@title='Dresses'])[2]")
    public WebElement dressesButton;

    @FindBy(css = "a[title='View my shopping cart']")
    public WebElement cartButton;

    @FindBy(id = "search_query_top")
    public WebElement search;
}
