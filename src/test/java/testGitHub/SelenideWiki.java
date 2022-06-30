package testGitHub;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Thread.sleep;

public class SelenideWiki {

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";}

    @Test
    @DisplayName("Проверка, что на странице Selenide в Github в разделе Wiki " +
            "есть страница SoftAssertions и на ней есть пример кода для JUnit5")
    void searchJUnit5Test()  {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").val("SoftAssertions").pressEnter();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions")).
                $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
         //Selenide.sleep(10000);
    }
}
