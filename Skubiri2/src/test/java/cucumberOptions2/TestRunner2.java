package cucumberOptions2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/login.feature",
        glue = {"stepDefinitions2"} )

public class TestRunner2 extends AbstractTestNGCucumberTests {
}
