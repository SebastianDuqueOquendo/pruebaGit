package co.com.certificacion.mobile.tasks;

import static co.com.certificacion.mobile.userinterfaces.LoginElements.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Login implements Task, IsSilent {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BANCOLOMBIA_ICON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BANCOLOMBIA_ICON)

        );

        actor.attemptsTo(
                WaitUntil.the(LOGIN_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LOGIN_BUTTON)
        );

        actor.attemptsTo(
                Click.on(CONTINUE_WITHOUT_PROTECTION)
        );

        actor.attemptsTo(
                Click.on(USERNAME_INPUT)
        );

        actor.attemptsTo(
                Enter.keyValues("histori01").into(USERNAME_INPUT)
        );
        actor.attemptsTo(
                Click.on(CONTINUE_BUTTON)
        );
        actor.attemptsTo(
                Enter.keyValues("1234").into(USERNAME_INPUT)
        );
        actor.attemptsTo(
                Click.on(LOGIN_SUBMIT)
        );
        actor.attemptsTo(
                WaitUntil.the(BALANCE_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BALANCE_BUTTON)
        );
        actor.attemptsTo(
                WaitUntil.the(ACCOUNT_DETAILS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ACCOUNT_DETAILS)
        );
        actor.attemptsTo(
                WaitUntil.the(DETAILS_TAB, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DETAILS_TAB)
        );
        actor.attemptsTo(
                WaitUntil.the(MOVEMENTS_TAB, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(MOVEMENTS_TAB)
        );
        actor.attemptsTo(
                WaitUntil.the(PLAN_TAB, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PLAN_TAB)
        );
        actor.attemptsTo(
                Click.on(BACK_BUTTON)
        );
        actor.attemptsTo(
                Click.on(BACK_BUTTON)
        );
        actor.attemptsTo(
                Click.on(LOGOUT_BUTTON)
        );
        actor.attemptsTo(
                Click.on(LOGOUT_CONFIRM)
        );



/*
        actor.attemptsTo(
                WaitUntil.the(BANCOLOMBIA_ICON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BANCOLOMBIA_ICON),
                WaitUntil.the(LOGIN_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LOGIN_BUTTON),
                Click.on(CONTINUE_WITHOUT_PROTECTION),
                Enter.keyValues("histori01").into(USERNAME_INPUT),
                Click.on(CONTINUE_BUTTON),
                Enter.keyValues("1234").into(USERNAME_INPUT),
                Click.on(LOGIN_SUBMIT),
                WaitUntil.the(BALANCE_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BALANCE_BUTTON),
                WaitUntil.the(ACCOUNT_DETAILS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ACCOUNT_DETAILS),
                WaitUntil.the(DETAILS_TAB, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DETAILS_TAB),
                Click.on(MOVEMENTS_TAB),
                Click.on(PLAN_TAB),
                Click.on(BACK_BUTTON),
                Click.on(BACK_BUTTON),
                Click.on(LOGOUT_BUTTON),
                Click.on(LOGOUT_CONFIRM)
        );*/
    }

    public static Login withCredentials() {
        return Tasks.instrumented(Login.class);
    }
}
