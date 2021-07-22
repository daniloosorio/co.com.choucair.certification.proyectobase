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


    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    private String strUser;
    private String strPassword;

    public static Login OnThepage(String strUser,String strPassword) {

        return Tasks.instrumented(Login.class,strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.wasAbleTo(
                Click.on(BUTON_LOGIN),
               Enter.theValue(strUser).into(ChoucairLoginPage.INPUT_USER),
               Enter.theValue(strPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
               Click.on(BUTON_ACCEDER)
        );
    }
}
