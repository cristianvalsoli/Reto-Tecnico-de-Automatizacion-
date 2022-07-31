package co.com.choucair.TechnicalTest.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/technicalTest.feature",
        tags="@stories",
        glue="co.com.choucair.TechnicalTest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}

