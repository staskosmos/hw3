package lesson3;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class HomeWork03 {

    String url = "https://github.com/selenide/selenide";

    @BeforeAll
    static void BrowserSize() {
        Configuration.browserSize = "1920x3072";
    }

    @Test
    void checkCodeForJunit () {
        open(url);
        $(byText("Wiki")).click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(Condition.text("JUnit5"));
    }
}
