package co.com.choucair.FirstChallengeAutomation.stepdefinitions;

import co.com.choucair.FirstChallengeAutomation.questions.Answer;
import co.com.choucair.FirstChallengeAutomation.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class UTestComStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than julian want to register in the website$")
    public void thanJulianWantToRegisterInTheWebsite() {
        OnStage.theActorCalled("julian").wasAbleTo(OpenUp.thePage());
    }

    @When("^he complete the four parts of the register$")
    public void heCompleteTheFourPartsOfTheRegister() throws IOException {
        OnStage.theActorInTheSpotlight().attemptsTo(FullStep1.complete(),(FullStep2.complete()),(FullStep3.complete()),(FullStep4.complete()));
    }

    @Then("^he can se the welcome message$")
    public void heCanSeTheWelcomeMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));
    }

}
