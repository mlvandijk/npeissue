import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        glue = {
                "*****.cucumberHook",
                "*****.citrus.steps",
                "*****.selenium.steps",
                "com.consol.citrus.cucumber.step.runner.core"
        },
        features = {
                "classpath:features",
        },
        format = {
                "json:target/cucumber-report/cucumber.json",
                "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json"
        },
        junit = "--step-notifications",
        monochrome = true,
        tags = {
                "@New",
        }
)
public class RunIT {
}