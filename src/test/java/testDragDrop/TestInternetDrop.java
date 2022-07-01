package testDragDrop;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selenide.*;


public class TestInternetDrop {

    @BeforeAll

    static void start() {

        baseUrl = "https://the-internet.herokuapp.com";
        browserSize = "1920x1080";
    }
@Test

    void dragAndDrop(){
        open("/drag_and_drop");
    sleep(5000);
    $("#column-a").dragAndDropTo($("#column-b"));
    $("#column-a").shouldHave(Condition.text("B"));
    $("#column-b").shouldHave(Condition.text("A"));
//sleep(10000);
  }
}
