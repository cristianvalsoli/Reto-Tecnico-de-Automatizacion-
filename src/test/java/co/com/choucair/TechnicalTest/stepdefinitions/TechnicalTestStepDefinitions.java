package co.com.choucair.TechnicalTest.stepdefinitions;
import co.com.choucair.TechnicalTest.model.DataModel;
import co.com.choucair.TechnicalTest.questions.Answer;
import co.com.choucair.TechnicalTest.tasks.OpenUp;
import co.com.choucair.TechnicalTest.tasks.Create;
import co.com.choucair.TechnicalTest.userinterface.UtestCreateUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

///unauthenticated-nav-bar__sign-up
public class TechnicalTestStepDefinitions {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}
    @Given("^that  cristian wants to start a personalized learning path in tests$")
    public void thatCristianWantsToStartAPersonalizedLearningPathInTests() {

        OnStage.theActorCalled("Brandon").attemptsTo(OpenUp.thePage());
    }


    @When("^you enter your personal data in the user creation form$")
    public void youEnterYourPersonalDataInTheUserCreationForm(List<DataModel> datos) throws  Exception {

        OnStage.theActorInTheSpotlight().attemptsTo( Create.theUser(datos.get(0).getName(),datos.get(0).getSurname(),datos.get(0).getEmail(),datos.get(0).getMonth(),datos.get(0).getDay(),datos.get(0).getYear(),datos.get(0).getCity(),datos.get(0).getCode(),datos.get(0).getCountry(),datos.get(0).getOsPc(),datos.get(0).getOsVersion(),datos.get(0).getOsLanguage(),datos.get(0).getMobileBrand(),datos.get(0).getMobileModel(),datos.get(0).getMobileOs(),datos.get(0).getUserPassword(),datos.get(0).getConfirmPassword(),datos.get(0).isAcceptNews(),datos.get(0).isTerms(),datos.get(0).isPrivacyPolicy(),datos.get(0).getLanguages()));
    }

    @Then("^send the completed form(.*)$")
    public void sendTheCompletedForm(String question) {
OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }


}
