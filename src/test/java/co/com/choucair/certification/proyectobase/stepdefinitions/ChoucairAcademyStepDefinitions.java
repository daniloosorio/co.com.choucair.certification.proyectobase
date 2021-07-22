package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
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

import java.util.List;

import static co.com.choucair.certification.proyectobase.tasks.Login.OnThepage;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        setTheStage(new OnlineCast());
        theActorCalled("brandom").wasAbleTo(OpenUp.thePage());
    }

    @Given("^than brandom wants to learn automation at academy Choucair$")
    public void thanBrandomWantsToLearnAutomationAtAcademyChoucair(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorCalled("brandom").wasAbleTo(
                OnThepage(academyChoucairData.get(0).getStrUser(),
                        academyChoucairData.get(0).getStrPassword())
        );
    }

    @When("^he search for the course  on the choucair academy platform$")
    public void heSearchForTheCourseOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.the(academyChoucairData.get(0).getStrCourse()));
        ///solo llegue hasta el boton universidad choucair ya que no tengo acceso a lo demas.
    }

    @Then("^he finds the course called resourses$")
    public void heFindsTheCourseCalledResourses(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respuesta.toThe(academyChoucairData.get(0).getStrCourse())));
    }
}

