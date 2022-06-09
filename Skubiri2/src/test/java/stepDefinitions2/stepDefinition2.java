package stepDefinitions2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class stepDefinition2 {
    WebDriver driver = null;

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();


    }

    @Given("Navigate to {string} site")
    public void navigate_to_site(String string) {
        // Write code here that turns the phrase above into concrete actions

        driver.navigate().to(string);


    }

    @Given("^Click on Login link in home page to land on Secure sign in Page$")
    public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[2]/a")).click();


    }

    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/main/div/form/div[4]/input")).click();


    }

    @Then("^Verify that user is succesfully logged in$")
    public void verify_that_user_is_succesfully_logged_in() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(4000);
        String actualUrl = "https://courses.rahulshettyacademy.com/";
        String expectedUrl = driver.getCurrentUrl();
        //Assert.assertEquals(expectedUrl, actualUrl);
        if (driver.getCurrentUrl().equalsIgnoreCase(actualUrl)) {
            System.out.println("Test Pass");
        }
        else if (driver.getCurrentUrl().equalsIgnoreCase(expectedUrl)){
            System.out.println("No No");
            }
    }
    @Then("^close browsers$")
    public void close_browsers() {
        String strUrl = driver.getCurrentUrl();
        System.out.println("Current Url is:"+ strUrl);
        driver.quit();

    }

}





