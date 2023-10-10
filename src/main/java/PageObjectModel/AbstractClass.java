package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public abstract class AbstractClass {

    private WebDriver driver= Driver.getDriver();
    WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(10));


    public  void clickFunktion(WebElement clickelement){
    webDriverWait.until(ExpectedConditions.elementToBeClickable(clickelement));
    clickelement.click();
    }

    public void sendKeysFunktion(WebElement sendkeyselement,String value){
        webDriverWait.until(ExpectedConditions.visibilityOf(sendkeyselement));

        sendkeyselement.sendKeys(value);
    }

    public void selectElementFromDropDown(WebElement dropdown,String value){
        Select slc=new Select(dropdown);
        slc.selectByVisibleText(value);
    }

    public boolean isThisVisible(WebElement webElement){
            boolean isdisplayed=webElement.isDisplayed();
                return isdisplayed;
    }



    public void checkEditButtonsInRows(List<WebElement> elementList) {

        for(int i=1; i<elementList.size(); i++){
            WebElement specificColumn = driver.findElement(By.xpath("//tbody/tr[" + i  + "]/td[6]"));
            Assert.assertEquals("Edit", specificColumn.getText()); // Eğer editButton'un metni "Edit" olmalıysa

        }
    }

}
