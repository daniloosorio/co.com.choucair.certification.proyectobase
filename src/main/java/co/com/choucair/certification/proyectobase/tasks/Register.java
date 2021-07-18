package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.proyectobase.userinterface.ChoucairRegisterPage.BUTON_JOIN_TODAY;

public class Register implements Task {

    public static Register OnThepage() {
        return Tasks.instrumented(Register.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(BUTON_JOIN_TODAY)
        );
    }
}
