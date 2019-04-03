package testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(features="src/features",
            glue="stepDefinitions",
            plugin={"html:target/cucumber-html-report"}
    )
    public class NewTestRunner {


}
