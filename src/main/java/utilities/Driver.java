package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
                driver=new ChromeDriver();
        }
        System.out.println("olustu mu?");
        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
