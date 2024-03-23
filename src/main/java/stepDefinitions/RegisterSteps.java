package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import jdk.jfr.Threshold;
import org.openqa.selenium.WebDriver;
import pages.Page_RegisterStepsPage;
import utilities.Driver;

import java.time.Duration;

public class RegisterSteps {

    Page_RegisterStepsPage registerStepsPage=new Page_RegisterStepsPage();

    WebDriver driver;

    @Given("navigate to website")
    public void navigate_to_website() throws InterruptedException {
        driver=Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(500);

    }

    @And("closethepopup")
    public void closethepopup() throws InterruptedException {
        Thread.sleep(1000);
        registerStepsPage.clickPopUp();
        Thread.sleep(1000);
    }

    @Given("type firstname {string}")
    public void firstname(String string) {
        registerStepsPage.fillfirstname(string);
    }
    @Given("type lastname {string}")
    public void type_lastname(String string) {
        registerStepsPage.filllastname(string);
    }
    @Given("type adress {string}")
    public void type_adress(String string) {
        registerStepsPage.filladress(string);
    }
    @And("type email {string}")
    public void typeEmail(String arg0) {
        registerStepsPage.fillemail(arg0);
    }

    @Given("type phone {string}")
    public void type_phone(String string) {
    registerStepsPage.fillphone(string);
    }
    @Given("select gender")
    public void select_gender() {
        registerStepsPage.selectGender();
    }
    @Given("select hobby")
    public void select_hobby() {
        registerStepsPage.selectHobby();
    }


    @And("click langfield")
    public void clickLangfield() {
        registerStepsPage.clickthelanglistfield();
    }

    @And("chose from langfield")
    public void choseFromLangfield() {
        registerStepsPage.selectTheLanguage();
    }



    @And("choose from countryfield {string}")
    public void chooseFromCountryfield(String arg0) {
        registerStepsPage.selectFromCountryField(arg0);
    }






    @And("choose month {string}")
    public void chooseMonth(String arg0) {
        registerStepsPage.selectMonthField(arg0);
    }

    @And("choose year {string}")
    public void chooseYear(String arg0) {
        registerStepsPage.selecttheYearField(arg0);
    }

    @And("choose day {string}")
    public void chooseDay(String arg0) {
        registerStepsPage.selecttheDayField(arg0);

    }

    @And("fill password {string}")
    public void fillPassword(String arg0) {
        registerStepsPage.fillpassword(arg0);
    }

    @And("fill againthepassword {string}")
    public void fillAgainthepassword(String arg0) {
        registerStepsPage.fillagainthepassword(arg0);
    }


    @And("click the Submit Button")
    public void clickTheSubmitButton() {
        registerStepsPage.clickSubmitButton();
    }
}
