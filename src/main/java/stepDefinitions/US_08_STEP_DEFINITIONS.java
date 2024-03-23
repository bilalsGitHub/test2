package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.US_08_VICEDEAN_PAGE;
import utilities.Driver;

import java.time.Duration;

public class US_08_STEP_DEFINITIONS  {

        US_08_VICEDEAN_PAGE us08VicedeanPage=new US_08_VICEDEAN_PAGE();
    private final WebDriver driver= Driver.getDriver();


    @Given("login as a vice dean")
    public void login_as_a_vice_dean() {
        driver.manage().window().maximize();
        driver.get("https://managementonschools.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        us08VicedeanPage.sendKeysFunktion(us08VicedeanPage.USERNAME_INPUT,"ViceDeanSinan");
        us08VicedeanPage.sendKeysFunktion(us08VicedeanPage.PASSWORD_INPUT,"123456kK");
        us08VicedeanPage.clickFunktion(us08VicedeanPage.LOGIN_BUTTON);
    }

    @Given("Vice Dean should be able to enter the name of lesson.")
    public void vice_dean_should_be_able_to_enter_the_name_of_lesson() {
        us08VicedeanPage.clickFunktion(us08VicedeanPage.LESSON_BUTTON);
        us08VicedeanPage.sendKeysFunktion(us08VicedeanPage.LESSON_INPUT_FIELD,"Deneme texti 1 ");

    }
    @Then("Vice Dean should be able to mark whether the course is compulsory or not.")
    public void vice_dean_should_be_able_to_mark_whether_the_course_is_compulsory_or_not() {
        us08VicedeanPage.clickFunktion(us08VicedeanPage.CHECK_FIELD);
    }
    @Then("Vice Dean should be able to enter the Credit Score.")
    public void vice_dean_should_be_able_to_enter_the_credit_score() {
        us08VicedeanPage.sendKeysFunktion(us08VicedeanPage.CREDIT_SCORE_FIELD,"100");
    }

    @Then("close the browser on the page vice dean")
    public void close_the_browser_on_the_page_vice_dean() {
        Driver.closeDriver();
    }
}
