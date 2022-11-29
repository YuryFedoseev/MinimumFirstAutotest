package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;

public class Crach {
    @Test
    void crashSearchTest() {
        Configuration.holdBrowserOpen = true;
        open("https://demoqa.com/automation-practice-form");
        // $(byId("firstName")).setValue("Dmitri").pressEnter();
        $("#firstName").setValue("Dmitro");
        $(byId("lastName")).setValue("Ivanov").pressEnter();
        $(byId("userEmail")).setValue("ivanov@mail.com").pressEnter();
        $(byTagAndText("Label", "Male")).click();
        $(byId("userNumber")).setValue("9012223344").pressEnter();

        $x("//div[@class='table-responsive']").shouldHave(Condition.text("Muha"));
        $x("//div[@class='table-responsive']").shouldHave(Condition.text("ivanov@mail.com"));
        $x("//div[@class='table-responsive']").shouldHave(Condition.text("Male"));
        $x("//div[@class='table-responsive']").shouldHave(Condition.text("9012223344"));

    }

}
