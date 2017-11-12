package dictionaryTest.apparatDictionary;

import org.junit.Test;
import parentTest.ParentTest;

public class AddDictionaryAppart extends ParentTest {
    final private String apparatNumber = "51120172";
    final private String apparatComment = "BilousTestComment";

    @Test
    public void addNewDictApparat() {
        loginPage.loginUser("Student","909090");
        homePage.clickOnMenuDictionary();
        checkAcceptanceCriteria("List with dictionaries is not displayed",
                homePage.listWithDictionaries(),true);
        homePage.selectOnDictionaryMenuItemApparat();

        apparatPage.clickOnAddBtn();
        apparatPage.enterInIntoInputApparatNumber(apparatNumber);
        apparatPage.enterInIntoInputApparatComment(apparatComment);
        apparatPage.clickCreateButton();
        checkAcceptanceCriteria("Added Dictionary is not present",
                apparatPage.isAddedDictionaryPresent(), true);
    }

}
