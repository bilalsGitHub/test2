package pages;

import PageObjectModel.AbstractClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_19_TEACHER extends AbstractClass {

    public US_19_TEACHER() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[normalize-space()='Menu']")
    public WebElement MENU_BUTTON;



    @FindBy(xpath = "//a[normalize-space()='Meet Management']")
    public WebElement MEET_MANAGEMENT_BUTTON;




    //1
    @FindBy(xpath="//input[@id='react-select-2-input']")
    public WebElement CHOOSE_STUDENTS_FIELD;

    //2

    @FindBy(xpath="//*[@id='react-select-2-listbox']/div/div")
    public List<WebElement> CHOOSE_STUDENTS_FIELDS;
    //3

    //input[@id='date']

    @FindBy(xpath="//input[@id='date']")
    public WebElement DATE_OF_MEET;
    //4

    //input[@id='startTime']
    @FindBy(xpath="//input[@id='startTime']")
    public WebElement START_TIME;
    //5

    @FindBy(xpath="//input[@id='stopTime']")
    public WebElement STOP_TIME;


    //6
    @FindBy(xpath=" //input[@id='description']")
    public WebElement DESCRIPTION;

    //button[normalize-space()='Submit']
    @FindBy(xpath="//button[normalize-space()='Submit']")
    public WebElement SUBMIT_BUTTON;



}
