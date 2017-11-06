package dictionaryTest.apparatDictionary;

import org.junit.Test;
import parentTest.ParentTest;

public class AddDictionaryAppart extends ParentTest {
    @Test
    public void addNewDictApparat() {
        loginPage.loginUser("Student","909090");
        homePage.clickOnMenuDictionary();
        homePage.selectOnDictionaryMenuItemApparat();

        homePage.clickOnAddBtn();
        homePage.enterInIntoInputApparatNumber("51120172");
        homePage.enterInIntoInputApparatComment("BilousTestComment");
        homePage.clickCreateButton();
        checkAcceptanceCriteria("Added Dictionary is not present",
                homePage.isAddedDictionaryPresent(), true);
    }

}
