package pages;

import PageObjectModel.AbstractClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_08_VICEDEAN_PAGE extends AbstractClass {

    public US_08_VICEDEAN_PAGE() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='username']")// ViceDeanSinan
    public WebElement USERNAME_INPUT;

    @FindBy(xpath = "//input[@id='password']")// 123456kK
    public WebElement PASSWORD_INPUT;


    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement LOGIN_BUTTON;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement LESSON_BUTTON;

    @FindBy(xpath = "//input[@id='lessonName']")
    public WebElement LESSON_INPUT_FIELD;

    //input[@id='compulsory']
    @FindBy(xpath = "//input[@id='compulsory']")
    public WebElement CHECK_FIELD;

    //input[@id='creditScore']
    @FindBy(xpath = "//input[@id='creditScore']")
    public WebElement CREDIT_SCORE_FIELD;


}
