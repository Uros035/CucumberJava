package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//Sve ti je objasnjeno -https://www.youtube.com/watch?v=DtSYzJtjfXQ&t=719s&ab_channel=OmegaAutomationTesting
//da koristis testng,junit,cucumber testove

@CucumberOptions(
        features = "src/test/resources/Login.feature",
        glue = {"stepDefinitions"} )

public class TestRunner  extends AbstractTestNGCucumberTests {
}
