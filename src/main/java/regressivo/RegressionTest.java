package regressivo;


import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"steps"},
        plugin = {"junit:cucumberTestingResult.xml", "com.bradesco.report.CucumberReporterPlugin"},
        snippets = SnippetType.CAMELCASE
)
public class RegressionTest {


}
