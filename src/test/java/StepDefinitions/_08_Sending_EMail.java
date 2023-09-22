package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

public class _08_Sending_EMail{
   DialogContent dc=new DialogContent();
        @And("Click Contact Us button")
        public void clickContactUsButton() {
           dc.Myclick(dc.ContactUS);
        }

        @Then("Select SubjectHeading and Send Message")
        public void selectSubjectHeadingAndOrderReference() {
            Select SelectSub=new Select(dc.SubjectHeading);
            SelectSub.selectByValue("2");
            dc.MysendKeys(dc.Message,"ürünlerinizi bir harika");

        }

        @And("Click Attach File")
        public void clickAttachFile() {
        dc.Myclick(dc.ChooseFile);

}
}


