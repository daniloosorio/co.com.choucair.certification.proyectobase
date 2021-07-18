package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairLoginPage extends PageObject {
    public static final Target BUTON_LOGIN = Target.the("BOTON para ingresar").located(By.xpath("//*[@id=\"nav-menu\"]/ul[2]/li/a/strong"));
    public static final Target INPUT_USER = Target.the("ingresar el usuario").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("ingresar la contraseña").located(By.id("password"));
    public static final Target BUTON_ACCEDER = Target.the("BOTON para Acceder").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
