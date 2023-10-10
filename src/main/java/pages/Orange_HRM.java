package pages;

import PageObjectModel.AbstractClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.Driver;

public class Orange_HRM extends AbstractClass {

    public Orange_HRM(){
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




}
