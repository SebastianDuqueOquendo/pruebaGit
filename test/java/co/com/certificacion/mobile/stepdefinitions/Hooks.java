package co.com.certificacion.mobile.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class Hooks {

    @Before
    public void doBefore(){
        OnStage.setTheStage(new Cast());
    }

    @After
    public void doAfter(){
        OnStage.drawTheCurtain();
    }
}
