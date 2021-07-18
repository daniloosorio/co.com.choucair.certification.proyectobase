package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage.BUTON_ACCEDER;
import static co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage.BUTON_LOGIN;

public class Login implements Task {

    public static Login OnThepage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.wasAbleTo(
                Click.on(BUTON_LOGIN),
               Enter.theValue("1036662427").into(ChoucairLoginPage.INPUT_USER),
               Enter.theValue("Choucair2021*").into(ChoucairLoginPage.INPUT_PASSWORD),
               Click.on(BUTON_ACCEDER)
        );
    }
}
