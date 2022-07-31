package co.com.choucair.TechnicalTest.tasks;

import co.com.choucair.TechnicalTest.userinterface.UtestSubmitForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class send implements Task {

    public static send theUser() {
        return Tasks.instrumented(send.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
       Click.on(UtestSubmitForm.BUTTON_SUBMIT)

);

    }

}
