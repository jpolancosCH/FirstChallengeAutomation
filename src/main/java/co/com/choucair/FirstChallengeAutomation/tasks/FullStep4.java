package co.com.choucair.FirstChallengeAutomation.tasks;

import co.com.choucair.FirstChallengeAutomation.userinterface.FourthStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FullStep4 implements Task {

    public static FullStep4 complete() {
        return Tasks.instrumented(FullStep4.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Opiuru56*´'").into(FourthStepPage.INPUT_PASSWORD),
                Enter.theValue("Opiuru56*´'").into(FourthStepPage.INPUT_CONFIRMED_PASSWORD),
                Click.on(FourthStepPage.CHECK_STAY_INFORMED),
                Click.on(FourthStepPage.CHECK_TERMS_OF_USE),
                Click.on(FourthStepPage.CHECK_PRIVACY_POLICY),
                Click.on(FourthStepPage.SUBMIT_BUTTON)
        );
    }
}
