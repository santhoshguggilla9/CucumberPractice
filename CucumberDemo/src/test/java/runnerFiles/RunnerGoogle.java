package runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features="src/test/resources/Features/login.feature",
					glue={"toscaPack"},
					plugin = {"pretty","html:target/html/toscaReport.html",
							"json:target/json/toscaReport.json",
							"junit:target/xml/toscaReport.xml"},
					monochrome = true
				 )
public class RunnerGoogle {

}
