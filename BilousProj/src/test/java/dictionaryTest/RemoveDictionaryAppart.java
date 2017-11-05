package dictionaryTest;

import org.junit.Test;
import parentTest.ParentTest;


public class RemoveDictionaryAppart extends ParentTest {
    @Test
    public void removeDictApparat() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPasswordIntoInputPass("909090");
        loginPage.clickOnLoginButton();
        checkAcceptanceCriteria("Avater is not present",
                homePage.isAvatarPresent(), true);
        homePage.clickOnDictionaryExpandList();
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
