package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridStepDefs {

    WebDriver driver;

    @Given("user is on the application_url {string}")
    public void user_is_on_the_application_url(String url) throws MalformedURLException {
        // Chrome WebDriver'ı başlatma
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bilal Hinislioglu\\Desktop\\Selenium Server\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserName", "chrome");
        driver = new ChromeDriver(options);

        // Sayfa yüklenene kadar bekleyin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Tarayıcı penceresini maksimize etme
        driver.manage().window().maximize();

        // Belirtilen URL'ye gitme
        driver.get(url);
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String pagetitle) {
        // Sayfa başlığını alın
        String actualTitle = driver.getTitle();
        String expectedTitle = pagetitle;

        // Sayfa başlığını kontrol etme
        Assert.assertEquals(expectedTitle, actualTitle, "Başlık uyuşmuyor");
    }

    @Then("close the remote driver")
    public void close_the_remote_driver() {
        // Tarayıcıyı kapatma
        if (driver != null) {
            driver.quit();
        }
    }
}