package pages;

import PageObjectModel.AbstractClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_20_TEACHER extends AbstractClass {

    public US_20_TEACHER() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement USERNAME_INPUT;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement PASSWORD_INPUT;
    @FindBy(xpath = "//button[normalize-space()='Menu']")
    public WebElement MENU_BUTTON;



    @FindBy(xpath = "//a[normalize-space()='Meet Management']")
    public WebElement MEET_MANAGEMENT_BUTTON;


    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement LOGIN_BUTTON;

    //11 eleman var
    @FindBy(xpath = "//th[normalize-space()='Date']")
        public WebElement DATE_TITLE;
    @FindBy(xpath = "//th[normalize-space()='Start Time']")
    public WebElement START_TIME_TITLE;
    @FindBy(xpath = "//th[normalize-space()='Stop Time']")
    public WebElement STOP_TIME_TITLE;
    @FindBy(xpath = "//th[normalize-space()='Description']")
    public WebElement DESCRIPTION_TITLE;

    //tbody/tr[1]/td[6]/span[1]/button[1]
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]/button[1]")
    public WebElement EDIT_BUTTON;

    //İlk delete button sadece
    @FindBy(xpath = "//tbody/tr[1]/td[7]")
    public WebElement DELETE_BUTTON;

    //Edit butonuna basınca gelen elemanlar
    //1
    @FindBy(xpath = "//div[@class='ms-4 me-4 text-center border border-3 shadow-sm bg-body rounded card border-warning']//input[@id='date']")
    public WebElement DATE_OF_MEET_EDIT;
    //2
    @FindBy(xpath = "//div[@class='mb-3 mt-4']//input[@id='startTime']")
    public WebElement DATE_OF_START_TIME_EDIT;
    //3
    @FindBy(xpath = "//div[@class='mb-3 mt-4']//input[@id='stopTime']")
    public WebElement DATE_OF_STOP_TIME_EDIT;
    //4
    @FindBy(xpath = "//div[@role='dialog']//div[@class='mt-5 col-md-auto']//input[1]")
    public WebElement DESCRIPTION_EDIT;
// /html/body/div[4]/div/div/div[2]/div[1]/div/div/form/div/div[5]/div/input
//div[@role='dialog']//div[@class='mt-5 col-md-auto']//input[1]
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[2]/button")
    public WebElement SUBMIT_EDIT_BUTTON;


}
