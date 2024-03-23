package stepDefinitions;

import PageObjectModel.AbstractClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Page_Orange_HRM;
import utilities.Driver;

import java.time.Duration;

public class Login_Steps extends AbstractClass {

        private WebDriver driver;

    Page_Orange_HRM orangeHrm = new Page_Orange_HRM();




    @Given("Go to the page")
    public void go_to_the_page() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Given("type loginusername")
    public void type_loginusername() {
    orangeHrm.sendKeysFunktion(orangeHrm.USERNAME_INPUT, "Admin");
        //orangeHrm.sendsendstoinputfield();
    }
    @Given("type password")
    public void type_password() {
        orangeHrm.sendKeysFunktion(orangeHrm.userpasswordinput,"admin123");
    }
    @When("click on the login button")
    public void click_on_the_login_button() {
        orangeHrm.clickFunktion(orangeHrm.loginbutton);
    }
    @Then("check the logo visibility")
    public void check_the_logo_visibility() {
        orangeHrm.isThisVisible(orangeHrm.pagelogo);
    }

}
