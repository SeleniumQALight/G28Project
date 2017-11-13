package dictionaryTest.apparatDictionary;

import org.junit.Test;
import parentTest.ParentTest;

public class AddDictionaryAppart extends ParentTest {
    final private String apparatNumber = "12112017";
    final private String apparatComment = "BilousTestComment";

    public AddDictionaryAppart(String browser) {
        super(browser);
    }

    @Test
    public void addNewDictApparat() {
        loginPage.loginUser("Student","909090");
        homePage.clickOnMenuDictionary();
        checkAcceptanceCriteria("List with dictionaries is not displayed",
                homePage.listWithDictionaries(),true);
        homePage.selectOnDictionaryMenuItemApparat();
        /*Check all dictionaries*/
        /*two columns are displayed*/
        apparatPage.clickOnAddBtn();
        apparatPage.enterInIntoInputApparatNumber(apparatNumber);
        apparatPage.enterInIntoInputApparatComment(apparatComment);
        apparatPage.clickCreateButton();
        checkAcceptanceCriteria("Added Dictionary is not present",
                apparatPage.isAddedApparatDictionaryPresent(apparatNumber, apparatComment), true);
    }

}
