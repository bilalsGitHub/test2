package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.US_20_TEACHER;
import utilities.Driver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class US_20_STEP_DEFINITIONS {

            US_20_TEACHER us20Teacher=new US_20_TEACHER();
    WebDriver driver= Driver.getDriver();


    @Given("login as a teacher2")
    public void login_as_a_teacher2() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://managementonschools.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        us20Teacher.sendKeysFunktion(us20Teacher.USERNAME_INPUT,"teachersenem");
        us20Teacher.sendKeysFunktion(us20Teacher.PASSWORD_INPUT,"Sa1996344454");
        us20Teacher.clickFunktion(us20Teacher.LOGIN_BUTTON);

    }
    @Given("switch to meet management2")
    public void switch_to_meet_management2() throws InterruptedException {
        us20Teacher.clickFunktion(us20Teacher.MENU_BUTTON);
        us20Teacher.clickFunktion(us20Teacher.MEET_MANAGEMENT_BUTTON);
        us20Teacher.clickFunktion(us20Teacher.EDIT_BUTTON);
        System.out.println("us20Teacher.DATE_OF_MEET_EDIT.isDisplayed()=>"+us20Teacher.DESCRIPTION_EDIT.isDisplayed());

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertFalse(us20Teacher.DESCRIPTION_EDIT.isDisplayed(),"DATE_OF_MEET_EDIT is visible");
    }
    SoftAssert softAssert=new SoftAssert();

    @Given("The Date, Start Time, Stop Time and Description of the meetings should be visible to the teacher")
    public void the_date_start_time_stop_time_and_description_of_the_meetings_should_be_visible_to_the_teacher() {
        softAssert.assertTrue(us20Teacher.DATE_OF_MEET_EDIT.isDisplayed(),"DATE_OF_MEET_EDIT is visible");
        softAssert.assertTrue(us20Teacher.DATE_OF_START_TIME_EDIT.isDisplayed(),"DATE_OF_START_TIME_EDIT is visible");
        softAssert.assertTrue(us20Teacher.DATE_OF_STOP_TIME_EDIT.isDisplayed(),"DATE_OF_STOP_TIME_EDIT is visible");
        softAssert.assertTrue(us20Teacher.DESCRIPTION_EDIT.isDisplayed(),"DESCRIPTION_EDIT is visible");




    }
    @Then("The teacher should be able to update the meetings2")
    public void the_teacher_should_be_able_to_update_the_meetings2() {
        System.out.println("the_teacher_should_be_able_to_update_the_meetings");
        us20Teacher.sendKeysFunktion(us20Teacher.DATE_OF_MEET_EDIT,"10152023");
        us20Teacher.sendKeysFunktion(us20Teacher.DATE_OF_START_TIME_EDIT,"0100P");
        us20Teacher.sendKeysFunktion(us20Teacher.DATE_OF_STOP_TIME_EDIT,"0200P");
        us20Teacher.sendKeysFunktion(us20Teacher.DESCRIPTION_EDIT,"Açıklama 1 ");
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date => "+currentDate);

        LocalDate dateOfMeet = LocalDate.parse("10162023", DateTimeFormatter.ofPattern("MMddyyyy"));
        // Compare the entered date with the current date
        if (dateOfMeet.isBefore(currentDate)) {
            System.out.println("The entered date is in the past.");
            SoftAssert softAssert=new SoftAssert();
            softAssert.assertTrue(false);

        } else if (dateOfMeet.isEqual(currentDate)) {
            System.out.println("The entered date is today.");
            SoftAssert softAssert=new SoftAssert();
            softAssert.assertTrue(false,"The entered date is today.");
        } else {
            System.out.println("The entered date is in the future.");
            us20Teacher.clickFunktion(us20Teacher.SUBMIT_EDIT_BUTTON);

            WebElement popup= driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[2]/div/div/div[1]/div[2]"));//pop up
            System.out.println("pop up gözüktü"+popup.isDisplayed());

        }

    }


    @Then("The teacher should be able to delete the meetings.")
    public void the_teacher_should_be_able_to_delete_the_meetings() {
        System.out.println("the_teacher_should_be_able_to_delete_the_meetings");
        softAssert.assertAll();

    }


}
