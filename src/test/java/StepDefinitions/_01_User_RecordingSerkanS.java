package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_User_RecordingSerkanS {

    DialogContent dc=new DialogContent();

    @Given("Navigate to Site")
    public void navigateToCampus() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");

    }

    @When("Click {string}")
    public void click(String Click) {
        WebElement BtnClick = dc.ElementGet(Click);
        dc.Myclick(BtnClick);
    }

    @And("Write {string} and Click {string}")
    public void writeAndClick(String Email, String Click) {
        WebElement EmailS = dc.ElementGet(Email);
        WebElement BtnClick = dc.ElementGet(Click);
        dc.MysendKeys(EmailS, "Grp1829Techno3@gmail.com");
        dc.Myclick(BtnClick);
    }

    @Then("Select {string},Enter {string},{string},{string} and Date of Birth")
    public void selectEnterAndDateOfBirth(String MrSelect, String Firstname, String LastName, String Password) {
        WebElement WMrSelect = dc.ElementGet(MrSelect);
        WebElement WFirstname = dc.ElementGet(Firstname);
        WebElement WLastName = dc.ElementGet(LastName);
        WebElement WPassword = dc.ElementGet(Password);

        dc.Myclick(WMrSelect);
        dc.MysendKeys(WFirstname,"TestFirstname");
        dc.MysendKeys(WLastName,"TestLastName");
        dc.MysendKeys(WPassword,"test123");

        Select SelectDays = new Select(dc.Days);
        SelectDays.selectByValue("17");

        Select SelectMonths = new Select(dc.Months);
        SelectMonths.selectByValue("4");


        Select SelectYears = new Select(dc.Years);
        SelectYears.selectByValue("1990");

    }


//    @Then("Select Title,Enter Firstname,Lastname,Password and Date of Birth")
//    public void Fill_in_The_Required_Blanks(DataTable dt) {
//        List<List<String>> items = dt.asLists(String.class);
//        for (int i = 0; i < items.size(); i++) {
//
//
//        }
//        dc.Myclick(dc.MrSelect);
//        dc.MysendKeys(dc.Firstname, "TestFirstname");
//        dc.MysendKeys(dc.LastName, "TestLastName");
//        dc.MysendKeys(dc.Password, "test123");
//
//        Select SelectDays = new Select(dc.Days);
//        SelectDays.selectByValue("17");
//
//        Select SelectMonths = new Select(dc.Months);
//        SelectMonths.selectByValue("4");
//
//
//        Select SelectYears = new Select(dc.Years);
//        SelectYears.selectByValue("1990");
//    }

    @And("Click Register Button")
    public void clickRegisterButton() {

        dc.Myclick(dc.SubmitAccount);

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.VerifycontainsText(dc.Verify, "created");
        System.out.println("Account başarılı ile yartıldı. =" + dc.Verify.getText());
    }


}


