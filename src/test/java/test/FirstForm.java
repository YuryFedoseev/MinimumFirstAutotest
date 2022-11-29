package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class FirstForm {
    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen = true;
        open("https://demoqa.com/automation-practice-form");
        // $(byId("firstName")).setValue("Dmitri").pressEnter();
        $("#firstName").setValue("Dmitro").pressEnter();
        $(byId("lastName")).setValue("Ivanov").pressEnter();
        $(byId("userEmail")).setValue("ivanov@mail.com").pressEnter();
        $(byTagAndText("Label", "Male")).click();
        $(byId("userNumber")).setValue("9012223344").pressEnter();

        $x("//div[@class='table-responsive']").shouldHave(Condition.text("Dmitro"));
        $x("//div[@class='table-responsive']").shouldHave(Condition.text("ivanov@mail.com"));
        $x("//div[@class='table-responsive']").shouldHave(Condition.text("Male"));
        $x("//div[@class='table-responsive']").shouldHave(Condition.text("9012223344"));
        //$("tr").find("Student Name").findAll("curlik");
        //$$("tr").shouldHave(text("curlik"));
        //$("#tr").find("Student Name").shouldHave(text("Student Name"));
        //$("#dateOfBirthInput").setValue("29.11.2021");
        //$$("class").findBy(Condition.attribute("react-datepicker-wrapper")).setValue("02.07.2000").pressEnter();
        //$$(byXpath("@class","react-datepicker__input-container")).setValue("02.07.2000").pressEnter();
        //$(byId("subjectsWrapper")).setValue("Art").pressEnter();
    }
}
