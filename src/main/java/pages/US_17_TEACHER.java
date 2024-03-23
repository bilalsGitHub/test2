package pages;

import PageObjectModel.AbstractClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_17_TEACHER  extends AbstractClass {

    public US_17_TEACHER() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='username']")// ViceDeanSinan
    public WebElement USERNAME_INPUT;

    @FindBy(xpath = "//input[@id='password']")// 123456kK
    public WebElement PASSWORD_INPUT;


    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement LOGIN_BUTTON;
    @FindBy(xpath = "//select[@id='lessonId']")
    public WebElement LESSON_DROWDOWN;
    @FindBy(xpath = "//select[@id='lessonId']/option")
    public List<WebElement> LESSON_DROWDOWNS;
    @FindBy(xpath = "//select[@id='studentId']")
    public WebElement STUDENT_DROPDOWN;

    @FindBy(xpath = "//select[@id='studentId']/option")
    public List<WebElement> STUDENT_DROPDOWNS;
    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement SEMESTER_DROPDOWN;

    @FindBy(xpath = "//select[@id='educationTermId']/option")
    public List<WebElement> SEMESTER_DROPDOWNS;
    @FindBy(xpath = "//input[@id='absentee']")
    public WebElement ABSENTE_FIELD;

    @FindBy(xpath = "//input[@id='midtermExam']")
    public WebElement MID_FIELD;

    @FindBy(xpath = "//input[@id='finalExam']")
    public WebElement FINAL_FIELD;

    @FindBy(xpath = "//input[@id='infoNote']")
    public WebElement INFO_FIELD;


    @FindBy(xpath = "//button[normalize-space()='Submit']")
    public WebElement SUBMIT_BUTTON;
}
