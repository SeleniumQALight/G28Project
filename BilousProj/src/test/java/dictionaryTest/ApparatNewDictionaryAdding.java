package dictionaryTest;

import org.junit.Test;
import parentTest.ParentTest;

public class ApparatNewDictionaryAdding extends ParentTest {
    @Test
    public void addNewDictApparat() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPasswordIntoInputPass("909090");
        loginPage.clickOnLoginButton();
        checkAcceptanceCriteria("Avater is not present",
                homePage.isAvatarPresent(), true);
        homePage.clickOnDictionaryExpandList();
        homePage.selectOnDictionaryMenuItemApparat();
        homePage.clickOnAddBtn();
        homePage.enterInIntoInputApparatNumber("51120172");
        homePage.enterInIntoInputApparatComment("BilousTestComment");
        homePage.clickCreateButton();
        checkAcceptanceCriteria("Added Dictionary is not present",
                homePage.isAddedDictionaryPresent(), true);
    }

}
