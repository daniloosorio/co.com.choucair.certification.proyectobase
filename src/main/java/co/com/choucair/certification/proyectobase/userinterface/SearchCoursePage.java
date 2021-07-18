package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target BUTON_UC = Target.the("BOTON para entrar a UC").located(By.xpath("//*[@id=\"universidad\"]/a/img"));

}
