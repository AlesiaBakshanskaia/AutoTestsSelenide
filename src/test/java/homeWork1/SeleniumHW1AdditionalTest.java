package homeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.*;


public class SeleniumHW1AdditionalTest extends AdditionalTaskAbstractTest {


    @Test
    void dragAndDrop() {
        screenshot("AdditionalTaskBeforeTest");
        switchTo().frame($x("//iframe[@class='demo-frame lazyloaded']"));
        actions()
                .clickAndHold($x("//*[@id='gallery']/li[4]/img").shouldBe(visible))
                .moveToElement($x("//div[@id='trash']"))
                .release()
                .build()
                .perform();
//        SelenideElement trash = $x("//div[@id='trash']");
//        $x("//*[@id='gallery']/li[4]/img").shouldBe(visible)
//                .dragAndDrop(to(trash));
        int amountPicturesInGallery = $$x(
                        "//ul[@id='gallery']//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']")
                .shouldHave(size(3))
                .size();
        screenshot("AdditionalTaskAfterTest");
        Assertions.assertEquals(3, amountPicturesInGallery);
    }
}
