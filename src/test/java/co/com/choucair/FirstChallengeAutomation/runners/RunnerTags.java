package co.com.choucair.FirstChallengeAutomation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        tags = "@register",
        glue = "co.com.choucair.FirstChallengeAutomation.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
