package org.homeWork2;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage {
    private final SelenideElement fullNameRow = $x("//div[@class='profile-info svelte-vyyzan']/div[1]/div[2]");
    private final SelenideElement fullNameUnderCard = $x("//div[@class='mdc-card']/div[2]/h2");

    public String getTextFullNameRow() {
       return fullNameRow.shouldBe(visible).text();
    }

    public String getTextFullNameUnderCard() {
        return fullNameUnderCard.shouldBe(visible).text();
    }
}
