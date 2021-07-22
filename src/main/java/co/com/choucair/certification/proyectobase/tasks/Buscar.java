package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Buscar  implements Task {
    private String course;

    public Buscar(String course) {
        this.course = course;
    }

    public static Buscar the(String course) {
        return Tasks.instrumented(Buscar.class, course);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchCoursePage.BUTON_UC)
                //continua escribir el curso no se impelementa porque no se tiene permisos
        );
    }
}
