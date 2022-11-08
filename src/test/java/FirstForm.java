import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class FirstForm {
    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen = true;
        open("https://demoqa.com/automation-practice-form");
        $(byId("firstName")).setValue("Dmitri").pressEnter();
        $(byId("lastName")).setValue("Ivanov").pressEnter();
        $(byId("userEmail")).setValue("ivanov@mail.com").pressEnter();
        $(byTagAndText("Label","Male")).click();
        $(byId("userNumber")).setValue("9012223344").pressEnter();

        //$("#dateOfBirthInput").setValue("29.11.2021");
        //$$("class").findBy(Condition.attribute("react-datepicker-wrapper")).setValue("02.07.2000").pressEnter();
        //$$(byXpath("@class","react-datepicker__input-container")).setValue("02.07.2000").pressEnter();
        //$(byId("subjectsWrapper")).setValue("Art").pressEnter();
    }
}
