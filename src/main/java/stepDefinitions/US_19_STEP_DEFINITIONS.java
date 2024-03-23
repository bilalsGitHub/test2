package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import pages.US_17_TEACHER;
import pages.US_19_TEACHER;
import utilities.Driver;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class US_19_STEP_DEFINITIONS  {

        WebDriver driver= Driver.getDriver();

    US_19_TEACHER us19Teacher=new US_19_TEACHER();

    


    @Given("switch to meet management")
    public void switch_to_meet_management() {
        us19Teacher.clickFunktion(us19Teacher.MENU_BUTTON);
        us19Teacher.clickFunktion(us19Teacher.MEET_MANAGEMENT_BUTTON);

    }
    @Given("Choose Students should be selected")
    public void choose_students_should_be_selected() throws InterruptedException {
        us19Teacher.clickFunktion(us19Teacher.CHOOSE_STUDENTS_FIELD);
                Thread.sleep(2000);
        for(WebElement each:us19Teacher.CHOOSE_STUDENTS_FIELDS){
            System.out.println(each.getText());
            if(each.getText().contains("Ali")){
            each.click();
            break;
            }

        }
    }
    @Then("Date Of Meet meeting time can be selected. Past date should not be entered.")
    public void date_of_meet_meeting_time_can_be_selected_past_date_should_not_be_entered() {
        us19Teacher.sendKeysFunktion(us19Teacher.DATE_OF_MEET,"10152023");
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date => "+currentDate);

        LocalDate dateOfMeet = LocalDate.parse("10152023", DateTimeFormatter.ofPattern("MMddyyyy"));

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
        }

    }
    @Then("Start Time ve Stop Time start and end times must be entered")
    public void start_time_ve_stop_time_start_and_end_times_must_be_entered() {
        us19Teacher.sendKeysFunktion(us19Teacher.START_TIME,"1212P");
        LocalTime currentTime = LocalTime.now();

        String inputTimeString = "1212";

        // Parse the input time
        int inputHours = Integer.parseInt(inputTimeString.substring(0, 2));
        int inputMinutes = Integer.parseInt(inputTimeString.substring(2, 4));

        LocalTime inputTime = LocalTime.of(inputHours, inputMinutes);

        // Compare the input time to the current time
        if (inputTime.isBefore(currentTime)) {
            System.out.println("The input time is in the past.");
            SoftAssert softAssert=new SoftAssert();
            softAssert.assertTrue(false,"The input time is in the past.");
        } else if (inputTime.equals(currentTime)) {
            System.out.println("The input time is the same as the current time.");
        } else {
            System.out.println("The input time is in the future.");
        }

        // Print the current time
        System.out.println("Current time: " + currentTime);
        us19Teacher.sendKeysFunktion(us19Teacher.STOP_TIME,"1313P");



    }

    @Then("Description must be entered")
    public void description_must_be_entered() {
        us19Teacher.sendKeysFunktion(us19Teacher.DESCRIPTION,"Selamlar test 01");
        us19Teacher.clickFunktion(us19Teacher.SUBMIT_BUTTON);
            }


    @Then("close the browser172")
    public void close_the_browser172() {
        System.out.println("close the ");
    }
}
