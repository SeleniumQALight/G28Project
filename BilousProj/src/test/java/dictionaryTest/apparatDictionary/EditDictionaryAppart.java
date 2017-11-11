package dictionaryTest.apparatDictionary;

import org.junit.Test;
import parentTest.ParentTest;


public class EditDictionaryAppart extends ParentTest {
    @Test
    public void editDictApparat() {
        loginPage.loginUser("Student","909090");
        homePage.clickOnMenuDictionary();
        homePage.selectOnDictionaryMenuItemApparat();
        apparatPage.clickOnAddBtn();
        apparatPage.enterInIntoInputApparatNumber("51120173");
        apparatPage.enterInIntoInputApparatComment("BilousTestComment");
        apparatPage.clickCreateButton();
        apparatPage.clickOnApparatDictionary();

        /**Editing text in dictionary inputs*/
        apparatPage.enterInIntoInputApparatNumber("511201731");
        apparatPage.enterInIntoInputApparatComment("BilousTestCommentEdited");
        apparatPage.clickOnSaveButton();
        checkAcceptanceCriteria("Edited Dictionary is not present",
                apparatPage.isEditeddDictionaryPresent(), true);


    }
}
