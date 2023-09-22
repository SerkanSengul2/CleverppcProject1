package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class _07_Ordering_And_Payment {
    DialogContent dc=new DialogContent();
    @And("The shopping cart icon \\(Cart) must be clickable.")
    public void theShoppingCartIconCartMustBeClickable() {
        dc.cardBtn.click();
    }

    @And("The {string} button should be clickable.")
    public void theButtonShouldBeClickable(String arg0) {
    dc.checkOutBtn.click();
    }

    @And("Select address created in story {string}")
    public void selectAddressCreatedInStory(String arg0) {
        dc.adresChecked.click();
    }

    @And("Shipment method should be selected by default and the Terms of Use Agreement should be accepted")
    public void shipmentMethodShouldBeSelectedByDefaultAndTheTermsOfUseAgreementShouldBeAccepted() {
    }

    @And("The {string} button must be clicked.")
    public void theButtonMustBeClicked(String arg0) {
    }

    @And("The {string} button should be clicked and {string} The negative message must be verified.")
    public void theButtonShouldBeClickedAndTheNegativeMessageMustBeVerified(String arg0, String arg1) {
    }

    @And("The {string} button should be clicked and the {string} button should be clicked.")
    public void theButtonShouldBeClickedAndTheButtonShouldBeClicked(String arg0, String arg1) {
    }
}
