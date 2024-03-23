package pages;

import PageObjectModel.AbstractClass;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import utilities.Driver;

public class Page_Orange_HRM extends AbstractClass {

    public Page_Orange_HRM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement USERNAME_INPUT;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement userpasswordinput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginbutton;

    @FindBy(xpath = "//img[@alt='company-branding']")
    public WebElement pagelogo;

    public void sendsendstoinputfield(){
        sendKeysFunktion(USERNAME_INPUT,"username123");
    }//bu sekilde de yazabilirsin




}
