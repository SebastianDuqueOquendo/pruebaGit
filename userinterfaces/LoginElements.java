package co.com.certificacion.mobile.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginElements {

    public static final Target BANCOLOMBIA_ICON = Target.the("Icono de Mi Bancolombia")
            .located(By.xpath("//android.widget.TextView[@content-desc=\"Mi Bancolombia\"]"));

    public static final Target LOGIN_BUTTON = Target.the("Botón de Iniciar sesi\u00f3nn")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Iniciar sesi\u00f3n\"]"));

    public static final Target CONTINUE_WITHOUT_PROTECTION = Target.the("Continuar sin protecci\u00f3nn")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Continuar sin protecci\u00f3n\"]"));

    public static final Target USERNAME_INPUT = Target.the("Campo de usuario")
            .located(By.xpath("//android.view.View//android.widget.EditText"));

    public static final Target CONTINUE_BUTTON = Target.the("Bot\u00f3nn Continuar")
            .located(By.xpath("//android.view.View[@content-desc=\"Continuar, Bot\u00f3n habilitado\"]"));

    public static final Target PIN_INPUT = Target.the("Campo de PIN")
            .located(By.xpath("//android.view.View[@content-desc=\"Ingresa la clave que usas en el cajero\"]/android.widget.EditText"));

    public static final Target LOGIN_SUBMIT = Target.the("Bot\u00f3n Ingresar")
            .located(By.xpath("//android.view.View[@content-desc=\"Ingresar, Bot\u00f3n habilitado\"]"));

    public static final Target BALANCE_BUTTON = Target.the("Bot\u00f3n Conocer saldos")
            .located(By.xpath("(//android.widget.HorizontalScrollView//android.widget.Button)[3]"));

    public static final Target ACCOUNT_DETAILS = Target.the("Detalles de cuenta")
            .located(By.xpath("(//android.widget.Button[@content-desc=\"Consultar Detalles y movimientos de esta cuenta\"])[2]"));

    public static final Target DETAILS_TAB = Target.the("Pestaña Detalles")
            .located(By.xpath("//android.view.View[@content-desc=\"Detalles\"]"));

    public static final Target MOVEMENTS_TAB = Target.the("Pestaña Movimientos")
            .located(By.xpath("//android.view.View[@content-desc=\"Movimientos\"]"));

    public static final Target PLAN_TAB = Target.the("Pestaña Plan")
            .located(By.xpath("//android.view.View[@content-desc=\"Plan\"]"));

    public static final Target BACK_BUTTON = Target.the("Botón Volver")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Volver\"]"));

    public static final Target LOGOUT_BUTTON = Target.the("Bot\u00f3n Cerrar sesi\u00f3n")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Cerrar sesi\u00f3n\"]"));

    public static final Target LOGOUT_CONFIRM = Target.the("Botón Confirmar cierre de sesión")
            .located(By.xpath("//android.widget.Button[@content-desc=\"S\u00ed\"]"));
}
