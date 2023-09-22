package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GWD;
import java.util.List;

public class DialogContent extends Parent {

    @FindBy(css = "ul[id='product_list'] img")
    public List<WebElement> allSummerDresses;

    @FindBy(id = "add_to_cart")
    public WebElement addToCartButton;

    @FindBy(css = "td[class='cart_description'] > p")
    public WebElement productsInCart;

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    public WebElement ElementGet(String element) {
        switch (element) {

        }

        return null;
    }


}


