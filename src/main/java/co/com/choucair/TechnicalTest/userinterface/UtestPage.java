package co.com.choucair.TechnicalTest.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class UtestPage extends  PageObject {
    public static final Target JOIN_BUTTON= Target.the("button that shows us the formt  to create  user")
            .located(By.className("unauthenticated-nav-bar__sign-up"));

}
