package stepDefinitions;

import PageObjectModel.AbstractClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US_08_VICEDEAN_PAGE;
import pages.US_17_TEACHER;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class US_17_STEP_DEFINITION  {

    //teachersenem	Sa1996344454
    US_17_TEACHER us17Teacher=new US_17_TEACHER();
    WebDriver driver= Driver.getDriver();

    @Given("login as a teacher")
    public void login_as_a_teacher() {
        driver.manage().window().maximize();
        driver.get("https://managementonschools.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        us17Teacher.sendKeysFunktion(us17Teacher.USERNAME_INPUT,"teachersenem");
        us17Teacher.sendKeysFunktion(us17Teacher.PASSWORD_INPUT,"Sa1996344454");
        us17Teacher.clickFunktion(us17Teacher.LOGIN_BUTTON);
    }

    @Given("The lesson, student and semester should be selectable17.")
    public void the_lesson_student_and_semester_should_be_selectable17() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
        us17Teacher.clickFunktion(us17Teacher.LESSON_DROWDOWN);

        Thread.sleep(2000);

        for (WebElement elements: us17Teacher.LESSON_DROWDOWNS){
            System.out.println(elements.getText());
            elements.click();


        }
        us17Teacher.clickFunktion(us17Teacher.STUDENT_DROPDOWN);

        for (WebElement elements: us17Teacher.STUDENT_DROPDOWNS){
           // System.out.println(elements.getText());
            if(elements.getText().contains("Adil")){
                elements.click();
            }

        }
        us17Teacher.clickFunktion(us17Teacher.SEMESTER_DROPDOWN);
        for (WebElement elements: us17Teacher.SEMESTER_DROPDOWNS){
            System.out.println(elements.getText());
            elements.click();
        }
        us17Teacher.clickFunktion(us17Teacher.SUBMIT_BUTTON);
    }


    @Then("Absences should be able to be entered17.")
    public void absences_should_be_able_to_be_entered17() {
        us17Teacher.clickFunktion(us17Teacher.ABSENTE_FIELD);
        us17Teacher.sendKeysFunktion(us17Teacher.ABSENTE_FIELD,"1");
    }
    @Then("Midterm and Final Exam grades should be able to be entered17.")
    public void midterm_and_final_exam_grades_should_be_able_to_be_entered17() {
        us17Teacher.sendKeysFunktion(us17Teacher.MID_FIELD,"100");
        us17Teacher.sendKeysFunktion(us17Teacher.FINAL_FIELD,"100");
    }
    @Then("Info note about the student should be able to be entered17.")
    public void info_note_about_the_student_should_be_able_to_be_entered17() {
        us17Teacher.sendKeysFunktion(us17Teacher.INFO_FIELD,"Great Lesson ");

    }
    @Then("close the browser17")
    public void close_the_browser17() {
        Driver.closeDriver();
    }
}
