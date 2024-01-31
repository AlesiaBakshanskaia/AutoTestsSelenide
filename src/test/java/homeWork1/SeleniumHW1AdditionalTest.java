package homeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.*;


public class SeleniumHW1AdditionalTest extends AdditionalTaskAbstractTest {


    @Test
    void dragAndDrop() throws InterruptedException {
        screenshot("AdditionalTaskBeforeTest");
        switchTo().frame($x("//iframe[@class='demo-frame lazyloaded']"));
//        $x("//*[@id='gallery']/li[4]/a[2]").shouldBe(visible).click();
        $x("//*[@alt='On top of Kozi kopka']").shouldBe(visible)
                .dragAndDrop(to("#trash > h4"));
        screenshot("AdditionalTaskAfterTest");
        int amountPicturesInGallery = $$x(
                        "//ul[@id='gallery']//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']")
                .shouldHave(size(3))
                .size();
        Assertions.assertEquals(3, amountPicturesInGallery);
    }
}
