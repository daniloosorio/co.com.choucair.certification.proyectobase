package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.fluentlenium.core.search.Search;
import org.mockito.stubbing.Answer;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        setTheStage(new OnlineCast());
        theActorCalled("brandom").wasAbleTo(OpenUp.thePage());
    }

    @Given("^than brandom wants to learn automation at academy Choucair$")
    public void thanBrandomWantsToLearnAutomationAtAcademyChoucair() {
       ///para el login
        OnStage.theActorCalled("brandom").wasAbleTo(Login.OnThepage());
        ///para el registro
        //OnStage.theActorCalled("brandom").wasAbleTo(Register.OnThepage());
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.the(course));
        ///solo llegue hasta el boton universidad choucair ya que no tengo acceso a lo demas.
    }

    @Then("^he finds the course called resourses (.*)$")
    public void heFindsTheCourseCalledResoursesRecursosAutomatizacionBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respuesta.toThe(question)));
    }
}
