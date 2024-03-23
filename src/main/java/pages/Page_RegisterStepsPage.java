package pages;

import PageObjectModel.AbstractClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import javax.swing.text.html.Option;
import java.util.List;

public class Page_RegisterStepsPage extends AbstractClass {
    public Page_RegisterStepsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div[2]/div[2]/button[2]/p")
    public WebElement popUpElement;

    public void clickPopUp(){
        clickFunktion(popUpElement);
    }
    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstname;

    public void fillfirstname(String name){
        sendKeysFunktion(firstname,name);
    }


    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastnamefield;

    public void filllastname(String lastname){
        sendKeysFunktion(lastnamefield,lastname);
    }

    //textarea[@class='form-control ng-pristine ng-valid ng-touched']
    @FindBy(xpath = "/html/body/section/div/div/div[2]/form/div[2]/div/textarea")
    public WebElement adressfield;
    public void filladress(String adress){
        sendKeysFunktion(adressfield,adress);
    }


    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailfield;

    public void fillemail(String email){
        sendKeysFunktion(emailfield,email);
    }


    @FindBy(xpath = "//input[@type='tel']")
    public WebElement phonefield;
    public void fillphone(String phone){
        sendKeysFunktion(phonefield,phone);
    }
    //label[normalize-space()='Male']
    @FindBy(xpath = "//label[normalize-space()='Male']")
    public WebElement gender;

    public void selectGender(){
        clickFunktion(gender);
    }

    @FindBy(xpath = "/html/body/section/div/div/div[2]/form/div[6]/div/div[1]/input")
    public WebElement hobbies;

    public void selectHobby(){
        clickFunktion(hobbies);

    }



    @FindBy(xpath = "/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]")
    public WebElement languagelistfield;
    @FindBy(xpath = "/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li")
    public List<WebElement> languagelist;
    public void clickthelanglistfield(){
        clickFunktion(languagelistfield);
    }
        public void selectTheLanguage(){
                for(WebElement each:languagelist){
                        if(each.getText().contains("Arabic")){
                                each.click();
                        }
                }
        }




    //*[@id="country"]
    @FindBy(xpath = "//*[@id='country']")
    public WebElement selectCountryField;


    public void selectFromCountryField(String string){
        Select select = new Select(selectCountryField);
        select.selectByVisibleText(string);
    }

    @FindBy(xpath = "//select[@id='yearbox']")
    public WebElement selectYear;
    public void selecttheYearField(String string){
        Select select = new Select(selectYear);
        select.selectByVisibleText(string);
    }

    @FindBy(xpath = "//*[@id='basicBootstrapForm']/div[11]/div[2]/select")
    public WebElement selectMonth;
    public void selectMonthField(String string){
        Select select = new Select(selectMonth);
        select.selectByVisibleText(string);
    }
    @FindBy(xpath = "//*[@id='daybox']")
    public WebElement selectDay;
    public void selecttheDayField(String string){
        Select select = new Select(selectDay);
        select.selectByVisibleText(string);
    }

    @FindBy(xpath = "//input[@id='firstpassword']")
    public WebElement passoword;

    public void fillpassword(String string){
        sendKeysFunktion(passoword,string);
    }

    @FindBy(xpath = "//*[@id='secondpassword']")
    public WebElement secondPassword;
    public void fillagainthepassword(String string){
        sendKeysFunktion(secondPassword,string);
    }

    //button[@id='submitbtn']

    @FindBy(xpath = "//button[@id='submitbtn']")
    public WebElement submitButton;

    public void clickSubmitButton(){
        clickFunktion(submitButton);
    }



}

