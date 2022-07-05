package co.com.choucair.FirstChallengeAutomation.tasks;

import co.com.choucair.FirstChallengeAutomation.userinterface.FirstStepPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromBy;
import org.openqa.selenium.Keys;

public class FullStep1 implements Task {

    public static FullStep1 complete() {
        return Tasks.instrumented(FullStep1.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FirstStepPage.JOIN_TODAY_BUTTON),
                Enter.theValue("Julian Esteban").into(FirstStepPage.INPUT_FIRSTNAME),
                Enter.theValue("Polanco Sogamoso").into(FirstStepPage.INPUT_LASTNAME),
                Enter.theValue("jpolancos+1@choucairtesting.com").into(FirstStepPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("September").from(FirstStepPage.SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText("14").from(FirstStepPage.SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText("2002").from(FirstStepPage.SELECT_BIRTH_YEAR),
                Enter.theValue("Spanish").into(FirstStepPage.INPUT_LANGUAGES),
                Hit.the(Keys.ENTER).into(FirstStepPage.INPUT_LANGUAGES),
                Click.on(FirstStepPage.SUBMIT_BUTTON)
                );
    }
}
