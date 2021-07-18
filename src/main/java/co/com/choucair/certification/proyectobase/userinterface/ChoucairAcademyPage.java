package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://operacion.choucairtesting.com/academy/login/")
public class ChoucairAcademyPage extends PageObject {
    public static final Target BIENVENIDA_USUARIO = Target.the("titulo de bienvenida para el usuario nuevo").located(By.xpath("//h1[contains(text(),'Welcome to the world's largest community of freelance software testers!')]"));
}
