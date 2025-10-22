package co.com.certificacion.mobile.stepdefinitions.login;

import co.com.certificacion.mobile.tasks.AppiumConfig;
import co.com.certificacion.mobile.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginAppStepDefinition {

    String actorName = "User";

    @Given("User install or init the application")
    public void userInstallOrInitTheApplication() {
        theActorCalled(actorName).wasAbleTo(AppiumConfig.initializeDriver());
    }

    @When("User enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        theActorCalled(actorName).wasAbleTo(Login.withCredentials());
    }

    @When("Clicks on login button")
    public void clicksOnLoginButton() {
        System.out.println("Clicks on login button");
    }
    @Then("User is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        System.out.println("User is navigated to the home page");
    }
}
