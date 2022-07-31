package co.com.choucair.TechnicalTest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;

import java.sql.SQLOutput;

public class UtestCreateUser extends PageObject{
    public static final Target INPUT_NAME =Target.the("Input for enter name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME =Target.the("Input for enter last name").
            located(By.id("lastName"));
    public static final Target INPUT_MAIL =Target.the("Input for enter mail").
            located(By.id("email"));
    public static final Target INPUT_MONTH =Target.the("Input for enter month").
            located(By.id("birthMonth"));

    public static final Target SELECT_OPTIONS_MONTH =Target.the("options for select birth month").
            located(By.xpath("//option[@label='January']"));

    public static Target SELECT_MONTH(String MONTH) {

        return Target.the("options for select birth month").
                located(By.xpath("//option[@label='"+MONTH+"']"));
    }
    //      WebElement eventLink = Browser.instance.findElement(By.xpath("//td[2]/a[1][contains(text(), '"+eventName+"')]")); eventLink.click();
    //


    public static final Target INPUT_DAY =Target.the("Input for enter birthDay ").
            located(By.id("birthDay"));

    public static Target SELECT_OPTIONS_DAY(String DAY) {

        return Target.the("options for select birth month").
                located(By.xpath("//option[@value='number:"+DAY+"']"));

    }


    public static final Target INPUT_YEAR =Target.the("Input for enter birth year").
            located(By.id("birthYear"));
    public static Target SELECT_OPTIONS_YEAR(String YEAR) {

        return Target.the("options for select birth month").
                located(By.xpath("//option[@label='"+YEAR+"']"));

    }

    public static final Target INPUT_LANGUAGE =Target.the("Input for enter  languages").
            located(By.id("languages"));

    public static Target SELECT_LANGUAGE(String language) {
        System.out.println(language);

        return  Target.the("item with language name")
                .located(By.xpath("//span[@class='ui-select-choices-row-inner']/div[contains(text(),'"+language+"')]"));

    }

    public static final Target SEND_FORM_BUTTON= Target.the("button for submit form")
            .located(By.xpath("//a[@class='btn btn-blue']"));


    public static final Target INPUT_CITY =Target.the("Input for enter  city").
            located(By.id("city"));

    public static final Target INPUT_CODE_POSTAL =Target.the("Input for enter zip or code postal").
            located(By.id("zip"));

    public static final Target  LIST_COUNTRY= Target.the("input  list for enter country")
            .located(By.xpath("//span[@class='ui-select-match-text pull-left']"));

    public static Target SELECT_COUNTRY(String country) {
        return  Target.the("item with  the name of the country")
                .located(By.xpath("//span[@class='ui-select-choices-row-inner']/div[contains(text(),'"+country+"')]"));

    }
    public static final Target NEXT_BUTTON= Target.the("button to go to the next form")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));

// dispositivos

    public static final Target  LIST_SYSTEM_OPERACTIVE_PC= Target.the("input  list for enter desktop operating system")
            .located(By.xpath("(//span[@aria-label='Select OS'])[1]"));

    public static final Target  LIST_SYSTEM_OPERACTIVE_MOBILE= Target.the("input  list for enter mobile operating system")
            .located(By.xpath("(//span[@aria-label='Select OS'])[2]"));
    public static final Target  LANGUAGE_OS= Target.the("input  list for enter language of the operating system")
            .located(By.xpath("(//span[@aria-label='Select OS language'])"));

    public static final Target  SELECT_VERSION_OS= Target.the("input  list for enter version of the operating system")
            .located(By.xpath("(//span[@aria-label='Select a Version'])"));

    public static final Target  SELECT_BRAND= Target.the("input  list for enter brands ")
            .located(By.xpath("(//span[@aria-label='Select Brand'])"));
    public static final Target  SELECT_MODEL= Target.the("input  list for enter models ")
            .located(By.xpath("(//span[@aria-label='Select a Model'])"));
    public static final Target  INPUT_SELECT_MODEL= Target.the("input  list for enter models ")
            .located(By.xpath("//input[@placeholder='Select a Model']"));




   /// ui-select-choices-row-56-4

    public static Target SELECT_ITEM(String item) {
        return  Target.the("item with the name of the selected option")
                .located(By.xpath("//span[@class='ui-select-choices-row-inner']/div[contains(text(),'"+item+"')]"));

    }
    public static final Target SELECT_ITEM_MODEL=Target.the("item with the name of the selected option").
            located(By.xpath("(//span[@class='ui-select-choices-row-inner'])[1]"));






    public static final Target INPUT_PASSWORD =Target.the("Input for enter password").
            located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD =Target.the("Input for enter confirm password").
            located(By.id("confirmPassword"));


    public static final Target INPUT_CHECKBOC =Target.the("checkbox for news subscription").
            located(By.className("signup-consent__checkbox"));



    public static final Target INPUT_PRIVATE_SETTING=Target.the("checkbox to confirm acceptance of policies of the privacy").
            located(By.id("privacySetting"));

    public static final Target INPUT_TERM_OF_SE=Target.the("checkbox to confirm acceptance of term of use ").
            located(By.id("termOfUse"));

    public static final Target  BUTTON_SUBMIT= Target.the("send form of the inscription")
            .located(By.id("laddaBtn"));



}
