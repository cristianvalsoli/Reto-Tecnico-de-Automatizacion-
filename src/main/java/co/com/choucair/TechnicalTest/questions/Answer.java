package co.com.choucair.TechnicalTest.questions;

import co.com.choucair.TechnicalTest.userinterface.UtestCreateUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import org.apache.xpath.operations.Bool;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question){

        return new Answer(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
       boolean result;
       //String nameCourse= Text.of()

        return true;
    }
}
