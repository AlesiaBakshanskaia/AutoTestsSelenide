package homeWork1;


import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class SeleniumHW1Test {

    @BeforeAll
    static void init() {
        open("https://test-stand.gb.ru/login");
    }

    @Test
    void createDummyAfterAuthorization() {
        $x("//input[@type='text']").shouldBe(visible).setValue("LLLLLL56598");
        $("input[type='password']").setValue("61249d71fc");
        $(".mdc-button__label").click();

        $("#create-btn").shouldBe(visible).click();

        $x("//input[@type='text']").shouldBe(visible).setValue("TestSelenide");
        $x("//textarea[@class='mdc-text-field__input' and @maxlength='100']").setValue("Home Work 3");
        $x("//button[@type='submit']").click();

        SelenideElement headingPost = $("h1[class='svelte-tv8alb']");
        screenshot("screenShotTestHW3");
        Assertions.assertEquals("TestSelenide", headingPost.getText());

    }

    @AfterAll
    static void finish() {
        WebDriverRunner.closeWebDriver();
    }
}
