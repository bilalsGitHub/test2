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

    //tbody/tr[1]/td[6]/span[1]/button[1]


    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> ROW_LIST;

    @FindBy(xpath = "//main[@class='content']//li[4]//a[1]")
    public WebElement nextButton;

    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[3]/div/div/div[2]/div[1]")
    public WebElement totalpagesfield;
    //String pagesText = totalpagesfield.getText(); // "Page 1 of 64"
    //int numberOfPages = Integer.parseInt(totalpagesfield.getText().split(" of ")[1]); // "64"
    public void checkAllPages() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        for(int j=1; j<65;j++){

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr")));
            List<WebElement> lists = driver.findElements(By.xpath("/html/body/div[1]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr"));
            System.out.println("numberOfRows "+ lists.size());

            for(int i=1; i<lists.size(); i++){
                System.out.println(i);
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
    public void checkEditButtonsInRows(int elementList) {
        System.out.println("toplam eleman o anki sayfada=>" +elementList);
        for(int i=1; i<=10; i++){
            WebElement specificColumn = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[6]"));
            //Assert.assertEquals("Edit", specificColumn.getText()); // Eğer editButton'un metni "Edit" olmalıysa
            System.out.println(driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]")).getText());
        }
        System.out.println("o anki eleman sayisi =>"+ elementList);
        nextButton.click();

    }


}
