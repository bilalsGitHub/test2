package stepDefinitions;

import PageObjectModel.AbstractClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.US_07_DEANPAGE;
import utilities.Driver;

import java.time.Duration;

public class US_07_STEP_DEFINITIONS extends AbstractClass {
    //DeanSinan01	Sinan123.
        US_07_DEANPAGE us07Deanpage=new US_07_DEANPAGE();
    private WebDriver driver;

    @Given("login as a dean")
    public void login_as_a_dean() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://managementonschools.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        us07Deanpage.sendKeysFunktion(us07Deanpage.USERNAME_INPUT,"DeanSinan01");
        us07Deanpage.sendKeysFunktion(us07Deanpage.PASSWORD_INPUT,"Sinan123.");
        us07Deanpage.clickFunktion(us07Deanpage.LOGIN_BUTTON);
    }
    @Given("the Dean is on the messages page")
    public void the_dean_is_on_the_messages_page() {
        us07Deanpage.clickFunktion(us07Deanpage.MENU_BUTTON);
        us07Deanpage.clickFunktion(us07Deanpage.CONTACT_GETALL_BUTTON);
    }
   @When("the Dean views the list of messages")
    public void the_dean_views_the_list_of_messages() {
       Assert.assertTrue(us07Deanpage.isThisVisible(us07Deanpage.CONTACT_MESSAGE_TITLE));
    }
    @Then("the Dean should see the edit button for each message")
    public void the_dean_should_see_the_edit_for_each_message() throws InterruptedException {
        us07Deanpage.checkAllPages();
    }
    @Then("the Dean should see message details including authors, emails, sending dates, and subject information")
    public void the_dean_should_see_message_details_including_authors_emails_sending_dates_and_subject_information() {
        //burada gene liste kontrolü var if break yapabilirsin unutma
        us07Deanpage.contactInformationsCheck();
    }

    @Then("close the browser")
    public void close_the_browser() {
        driver.close();
    }

}
