package co.com.choucair.FirstChallengeAutomation.tasks;

import co.com.choucair.FirstChallengeAutomation.userinterface.SecondStepPage;
import co.com.choucair.FirstChallengeAutomation.userinterface.ThirdStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class FullStep3 implements Task {

    public static FullStep3 complete() {
        return Tasks.instrumented(FullStep3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ThirdStepPage.DIV_OS),
                Enter.theValue("Windows").into(ThirdStepPage.INPUT_OS),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_OS),
                Click.on(ThirdStepPage.DIV_VERSION),
                Enter.theValue("7 64-bit").into(ThirdStepPage.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_VERSION),
                Click.on(ThirdStepPage.DIV_LANGUAGE),
                Enter.theValue("English").into(ThirdStepPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_LANGUAGE),
                Click.on(ThirdStepPage.DIV_BRAND),
                Enter.theValue("Xiaomi").into(ThirdStepPage.INPUT_BRAND),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_BRAND),
                Click.on(ThirdStepPage.DIV_MODEL),
                Enter.theValue("Poco X3 Pro").into(ThirdStepPage.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_MODEL),
                Click.on(ThirdStepPage.DIV_OS_MOBILE),
                Enter.theValue("Android 11").into(ThirdStepPage.INPUT_OS_MOBILE),
                Hit.the(Keys.ENTER).into(ThirdStepPage.INPUT_OS_MOBILE),
                Click.on(ThirdStepPage.BUTTON_SUBMIT)
                );
    }
}
