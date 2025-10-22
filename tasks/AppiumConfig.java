package co.com.certificacion.mobile.tasks;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.net.URL;
import java.time.Duration;

public class AppiumConfig implements Task {
    String appPackage ="com.google.android.apps.nexuslauncher";
    //"co.com.bancolombia.personas.superapp";
    String appActivity = "com.google.android.apps.nexuslauncher.AllAppsActivity";
    //"co.com.bancolombia.personas.superapp.MainActivity";

    @Override
    public <T extends Actor> void performAs(T actor) {


            try {
                UiAutomator2Options options = new UiAutomator2Options()
                        .setAutomationName("UiAutomator2")
                        .setDeviceName("Pixel_3a_API_34_extension_level_7_x86_64")
                        .setUdid("emulator-5554")
                        .setPlatformName("Android")
                        .setPlatformVersion("14")
                        .setAppPackage(appPackage)
                        .setAppActivity(appActivity)
                        .setAutoGrantPermissions(true)
                        .setNoReset(true)
                        .setNewCommandTimeout(Duration.ofSeconds(90));

                options.setCapability("autoGrantPermissions", true);
                options.setCapability("skipUnlock", true);

                URL appiumServerUrl = new URL("http://127.0.0.1:4723");
                AndroidDriver driver = new AndroidDriver(appiumServerUrl, options);
                actor.can(BrowseTheWeb.with(driver));

                /*driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Mi Bancolombia\"]")).click();
                driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Iniciar sesi\u00f3n\"]")).click();
                driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continuar sin protecci\u00f3n\"]")).click();
                driver.findElement(By.xpath("//android.view.View//android.widget.EditText")).sendKeys("histori01");
                driver.findElement(By.xpath("//android.view.View[@content-desc=\"Continuar, Bot\u00f3n habilitado\"]"));
                */


            } catch (Exception e) {
                throw new RuntimeException("Fallo al instalar la aplicación: " + e.getMessage(), e);
            }


    }

    public static AppiumConfig initializeDriver() {
        return Tasks.instrumented(AppiumConfig.class);
    }


}