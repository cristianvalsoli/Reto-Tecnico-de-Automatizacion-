package co.com.choucair.TechnicalTest.tasks;

import co.com.choucair.TechnicalTest.userinterface.UtestCreateUser;
import co.com.choucair.TechnicalTest.userinterface.UtestSubmitForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnTarget;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.DoubleClick;
 ;
public class Create implements Task {
    private String name,surname,email,month,day,year,city,code,country,osPc,osVersion,osLanguage,mobileBrand,mobileModel,mobileOs,userPassword,confirmPassword;
    private boolean acceptNews,terms, privacyPolicy;
    private String [] languages;

    public Create(String name, String surname, String email, String month, String day, String year, String city, String code, String country, String osPc, String osVersion, String osLanguage, String mobileBrand, String mobileModel, String mobileOs, String userPassword, String confirmPassword, boolean acceptNews, boolean terms, boolean privacyPolicy, String[] languages) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.city = city;
        this.code = code;
        this.country = country;
        this.osPc = osPc;
        this.osVersion = osVersion;
        this.osLanguage = osLanguage;
        this.mobileBrand = mobileBrand;
        this.mobileModel = mobileModel;
        this.mobileOs = mobileOs;
        this.userPassword = userPassword;
        this.confirmPassword = confirmPassword;
        this.acceptNews = acceptNews;
        this.terms = terms;
        this.privacyPolicy = privacyPolicy;
        this.languages = languages;
    }

    public static Create theUser(String name,String surname,String email,String month,String day,String year,String city,String code,String country,String osPc,String osVersion,String osLanguage,String mobileBrand,String mobileModel,String mobileOs,String userPassword,String confirmPassword,Boolean acceptNews,Boolean terms,Boolean privacyPolicy,String[] languages) {
        return Tasks.instrumented(Create.class,name,surname,email,month,day,year,city,code,country,osPc,osVersion,osLanguage,mobileBrand,mobileModel,mobileOs,userPassword,confirmPassword,acceptNews,terms,privacyPolicy,languages);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        Enter.theValue(name).into(UtestCreateUser.INPUT_NAME),
        Enter.theValue(surname).into(UtestCreateUser.INPUT_LAST_NAME),
        Enter.theValue(email).into(UtestCreateUser.INPUT_MAIL),
       Click.on(UtestCreateUser.INPUT_MONTH),
        Click.on(UtestCreateUser.SELECT_MONTH(month)),
        Click.on(UtestCreateUser.INPUT_DAY),
        Click.on(UtestCreateUser.SELECT_OPTIONS_DAY(day)),
        Click.on(UtestCreateUser.INPUT_YEAR),
        Click.on(UtestCreateUser.SELECT_OPTIONS_YEAR(year)),
        Click.on(UtestCreateUser.INPUT_LANGUAGE),
        Click.on(UtestCreateUser.SELECT_LANGUAGE("Spanish")),
        Click.on(UtestCreateUser.SEND_FORM_BUTTON),
        Enter.theValue(city).into(UtestCreateUser.INPUT_CITY),


        Click.on(UtestCreateUser.LIST_COUNTRY),
        Click.on(UtestCreateUser.SELECT_COUNTRY(country)),
        Enter.theValue(code).into(UtestCreateUser.INPUT_CODE_POSTAL),


        Click.on(UtestCreateUser.NEXT_BUTTON),
        Click.on(UtestCreateUser.SELECT_BRAND),
        Click.on(UtestCreateUser.SELECT_ITEM(mobileBrand)),

        Click.on(UtestCreateUser.SELECT_MODEL),
        Enter.theValue(mobileModel).into(UtestCreateUser.INPUT_SELECT_MODEL),
        Click.on(UtestCreateUser.SELECT_ITEM_MODEL),
        Click.on(UtestCreateUser.LIST_SYSTEM_OPERACTIVE_MOBILE ),
        Click.on(UtestCreateUser.SELECT_ITEM(mobileOs)),

        Click.on(UtestCreateUser.LIST_SYSTEM_OPERACTIVE_PC ),
        Click.on(UtestCreateUser.SELECT_ITEM(osPc)),
        Click.on(UtestCreateUser. SELECT_VERSION_OS),
        Click.on(UtestCreateUser.SELECT_ITEM(osVersion)),
        Click.on(UtestCreateUser.LANGUAGE_OS),
        Click.on(UtestCreateUser.SELECT_ITEM(osLanguage)),
        Click.on(UtestCreateUser.NEXT_BUTTON),
        Enter.theValue(userPassword).into(UtestCreateUser.INPUT_PASSWORD),
        Enter.theValue(confirmPassword).into(UtestCreateUser.INPUT_CONFIRM_PASSWORD),
        Click.on(UtestCreateUser.INPUT_PRIVATE_SETTING),

        Click.on(UtestCreateUser.INPUT_TERM_OF_SE),
        Click.on(UtestCreateUser.INPUT_CHECKBOC),
        Click.on(UtestCreateUser.BUTTON_SUBMIT)
);

    }

}



