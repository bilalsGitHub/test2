package pages;

import PageObjectModel.AbstractClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

import static utilities.Driver.driver;

public class US_07_DEANPAGE extends AbstractClass {

    public US_07_DEANPAGE(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement USERNAME_INPUT;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement PASSWORD_INPUT;


    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement LOGIN_BUTTON;

    @FindBy(xpath = "//button[normalize-space()='Menu']")
    public WebElement MENU_BUTTON;


    @FindBy(xpath = "//a[normalize-space()='Contact Get All']")
    public WebElement CONTACT_GETALL_BUTTON;

    @FindBy(xpath = "//h5[@class='fw-bold p-3 card-header']")
    public WebElement CONTACT_MESSAGE_TITLE;


    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> ROW_LIST;

    @FindBy(xpath = "//main[@class='content']//li[4]//a[1]")
    public WebElement nextButton;




    //*[@id="root"]/div/main/div/div/div/div/div/div[2]/div[2]/ul/li[4]/a
    @FindBy(xpath = "//*[@id='root']/div/main/div/div/div/div/div/div[2]/div[2]/ul/li[4]/a")
    public WebElement nextButton2;
    @FindBy(xpath = "(//div[@class='d-flex justify-content-start ps-5 col'])[1]")
    public WebElement totalpagesfield;


    public void checkAllPages() throws InterruptedException {
       // String text=totalpagesfield.getText();
        //System.out.println("text "+text);
        //int numberOfPages = Integer.parseInt(text.substring(text.indexOf("of")+1,text.indexOf(text.length())-1)); // "64"
//        int totalpages = Integer.parseInt(gettextfrompagesdiv.substring(gettextfrompagesdiv.indexOf("(") + 1, gettextfrompagesdiv.indexOf("Pages") - 1));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        for(int j=1; j<65;j++){

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr")));
            List<WebElement> lists = driver.findElements(By.xpath("//tbody/tr"));
            System.out.println("numberOfRows "+ lists.size());

            for(int i=1; i<lists.size(); i++){
                System.out.println(i);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr["+i+"]/td[6]")));

                WebElement specificColumn = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[6]"));

                WebElement isim=driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]"));
                Assert.assertTrue(specificColumn.getText().contains("Edit")); // Eğer editButton'un metni "Edit" olmalıysa
                System.out.println("specificColumn.getText() "+specificColumn.getText());
                System.out.println("isim.gettext "+isim.getText());
                if(isim.getText().contains("Sefa")){
                    System.out.println("girdi ife");
                    break;
                }
            }

            nextButton.click();
        }


    }


    public void contactInformationsCheck(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(( By.xpath("//tbody"))));
        int a=1;
        while(a<=10){//10 tane sayfa ilerlicek
            System.out.println("a=>"+ a);
            for(int i=1; i<20; i++){
                for(int j=1; j<5;j++){

                    WebElement infoofwor=driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]"));
                    System.out.print(driver.findElement(By.xpath("//table/thead/tr/th["+j+"]")).getText()+": "+ infoofwor.getText());
                    if(infoofwor.getText().contains("Kayitlar Hakkinda Bilgi\t")|| infoofwor.getText().isEmpty()){
                        SoftAssert softAssert=new SoftAssert();
                        softAssert.assertFalse(true,infoofwor.getText()+"boş eleman bulundu");
                        break;

                    }
                }
                System.out.println("");
            }
            nextButton2.click();
            a++;
        }


    }


}
