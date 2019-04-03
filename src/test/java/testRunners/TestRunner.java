package testRunners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/features",
        glue= "stepDefinitions",
//        plugin={"html:target/cucumber-html-report"}
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}

)
public class TestRunner {


    @AfterClass
    public static void setup() throws IOException {
        Reporter.loadXMLConfig(new File("configs/extent-config.xml"));
        Reporter.setSystemInfo("os", "Ubuntu");
        Reporter.setTestRunnerOutput("Sample test runner output message");

    }


}
