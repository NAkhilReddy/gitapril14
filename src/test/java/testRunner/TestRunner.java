package testRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = ".\\Features\\jpet.feature",
glue = "steps",
monochrome = true,
plugin= {"pretty","html:test-output"}
)

public class TestRunner {

}
