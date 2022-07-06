package co.com.choucair.FirstChallengeAutomation.tasks;

import co.com.choucair.FirstChallengeAutomation.model.DataFirstStep;
import co.com.choucair.FirstChallengeAutomation.userinterface.FirstStepPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import java.io.IOException;

public class FullStep1 implements Task {

    private final DataFirstStep dataFirstStep = new DataFirstStep();

    public static FullStep1 complete() throws IOException {
        return Tasks.instrumented(FullStep1.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FirstStepPage.JOIN_TODAY_BUTTON),
                Enter.theValue(dataFirstStep.FirstName).into(FirstStepPage.INPUT_FIRSTNAME),
                Enter.theValue(dataFirstStep.LastName).into(FirstStepPage.INPUT_LASTNAME),
                Enter.theValue(dataFirstStep.EmailAddress).into(FirstStepPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(dataFirstStep.BirthMonth).from(FirstStepPage.SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(dataFirstStep.BirthDay).from(FirstStepPage.SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(dataFirstStep.BirthYear).from(FirstStepPage.SELECT_BIRTH_YEAR),
                Enter.theValue(dataFirstStep.Languages).into(FirstStepPage.INPUT_LANGUAGES),
                Hit.the(Keys.ENTER).into(FirstStepPage.INPUT_LANGUAGES),
                Click.on(FirstStepPage.SUBMIT_BUTTON)
        );
    }
}
