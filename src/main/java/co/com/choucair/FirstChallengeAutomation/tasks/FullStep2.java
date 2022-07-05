package co.com.choucair.FirstChallengeAutomation.tasks;

import co.com.choucair.FirstChallengeAutomation.userinterface.FirstStepPage;
import co.com.choucair.FirstChallengeAutomation.userinterface.SecondStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class FullStep2 implements Task {

    public static FullStep2 complete() {
        return Tasks.instrumented(FullStep2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Soacha").into(SecondStepPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(SecondStepPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(SecondStepPage.INPUT_CITY),
                Enter.theValue("250054").into(SecondStepPage.INPUT_ZIP),
                Click.on(SecondStepPage.DIV_COUNTRY),
                Enter.theValue("Colombia").into(SecondStepPage.INPUT_COUNTRY),
                Click.on(SecondStepPage.BUTTON_SUBMIT)
                );
    }
}
