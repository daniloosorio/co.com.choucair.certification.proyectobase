package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.mockito.stubbing.Answer;

public class Respuesta implements Question<Boolean> {
    private  String question;
    public Respuesta(String question) {
    this.question = question;
    }
    public static Respuesta toThe(String question){
        return new Respuesta(question);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
