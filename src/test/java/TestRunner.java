import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
         features = {"src/test/java/features/register.feature"},

         plugin = {"pretty","html:target/report.html"}

        //monochrome = true,
        //strict = true,
        //dryRun = true,

        //tags = "@regression"

)





@RunWith(Cucumber.class)
public class TestRunner
{

}
