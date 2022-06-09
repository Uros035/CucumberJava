package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

    @Given("User is on NetBanking landing page")
    public void user_is_on_netbanking_landing_page() {
        System.out.println("navigated to login url");
    }

    @When("User login into application with username and password")
    public void user_login_into_application_with_username_and_password() {
        System.out.println("Logged in success");

        }
    @Then("Home page is populated")
    public void home_page_is_populated()  {
        System.out.println("Validated home page");
    }
    //Ovaj when je da se gruva sifra i username svaki put,npr da svaki scenarijo proba razlicite kreden.
    @When("User login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String string, String string2) {
        System.out.println("Ovo je za kukumber 2");
        //string 1 i 2 poziva svaki put kad prodje scenario da printa username i password
        System.out.println(string);
        System.out.println(string2);
         }


    @Then("Cards displayed are {string}")
    public void cards_displayed_are(String string)  {
        System.out.println(string);
    }

}

