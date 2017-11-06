package dictionaryTest.apparatDictionary;

import org.junit.Test;
import parentTest.ParentTest;


public class RemoveDictionaryAppart extends ParentTest {
    @Test
    public void removeDictApparat() {
        loginPage.loginUser("Student","909090");
        apparatPage.clickOnMenuDictionary();
        apparatPage.selectOnDictionaryMenuItemApparat();
        apparatPage.clickOnAddBtn();
        apparatPage.enterInIntoInputApparatNumber("51120173");
        apparatPage.enterInIntoInputApparatComment("BilousTestComment");
        apparatPage.clickCreateButton();

        /**Remove Dictionary*/
        apparatPage.clickOnApparatDictionary();
        apparatPage.clickOnRemoveButton();
        checkAcceptanceCriteria("Removed Dictionary is not present",
                apparatPage.isRemoveddDictionaryNotPresent(), true);





    }
}
