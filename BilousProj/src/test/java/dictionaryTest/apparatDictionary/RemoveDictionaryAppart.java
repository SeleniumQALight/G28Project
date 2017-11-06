package dictionaryTest.apparatDictionary;

import org.junit.Test;
import parentTest.ParentTest;


public class RemoveDictionaryAppart extends ParentTest {
    @Test
    public void removeDictApparat() {
        loginPage.loginUser("Student","909090");
        homePage.clickOnMenuDictionary();
        homePage.selectOnDictionaryMenuItemApparat();
        homePage.clickOnAddBtn();
        homePage.enterInIntoInputApparatNumber("51120173");
        homePage.enterInIntoInputApparatComment("BilousTestComment");
        homePage.clickCreateButton();

        /**Remove Dictionary*/
        homePage.clickOnApparatDictionary();
        homePage.clickOnRemoveButton();
        checkAcceptanceCriteria("Removed Dictionary is not present",
                homePage.isRemoveddDictionaryNotPresent(), true);





    }
}
