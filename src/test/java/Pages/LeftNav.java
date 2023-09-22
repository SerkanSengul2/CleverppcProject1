package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.GWD;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "a[title='Women']")
    public WebElement womenButton;

    @FindBy(linkText = "Summer Dresses")
    public WebElement summerDressesButton;

    @FindBy(linkText = "Dresses")
    public WebElement dressesButton;

    public WebElement GetWebelement(String element) {
        switch (element) {
        }
        return null;
    }
}
