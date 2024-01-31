package org.homeWork2;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$$x;

public class StudentPage {

    private ElementsCollection rowsInDummies = $$x("//table[@aria-label='Dummies list']/tbody/tr");

    private RowDummiesList getRowByID(String id) {

        rowsInDummies.shouldHave(sizeGreaterThan(0));
        List<SelenideElement> rowsInDummiesList = new ArrayList<>();
        for(SelenideElement element : rowsInDummies) {
            rowsInDummiesList.add(element);
        }
        return rowsInDummiesList.stream().map(RowDummiesList::new)
                .filter(row -> row.getIdDummy().equals(id)).findFirst().orElseThrow();
    }

    public void openEditingDummyById(String id) {
        getRowByID(id).clickEditButton();

    }

    public String getNameDummyById(String id) {
        return getRowByID(id).getNameDummy();
    }

    public void openCredentialsModalById(String id) {
        getRowByID(id).clickCredentialButton();
    }
}
