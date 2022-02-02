package lesson3;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

class DragDrop {

    @Test
    void dragDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));

        $("#column-b").shouldHave(Condition.text("A"));
        $("#column-a").shouldHave(Condition.text("B"));
    }
}