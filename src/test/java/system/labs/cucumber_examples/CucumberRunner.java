package system.labs.cucumber_examples;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"features"}, glue = {"stepDefination"})
public class CucumberRunner {
   
}
