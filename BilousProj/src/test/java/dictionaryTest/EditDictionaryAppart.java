package dictionaryTest;

import org.junit.Test;
import parentTest.ParentTest;


public class EditDictionaryAppart extends ParentTest {
    @Test
    public void editDictApparat() {
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
        homePage.clickOnApparatDictionary();

        /**Editing text in dictionary inputs*/
        homePage.enterInIntoInputApparatNumber("511201731");
        homePage.enterInIntoInputApparatComment("BilousTestCommentEdited");
        homePage.clickOnSaveButton();
        checkAcceptanceCriteria("Edited Dictionary is not present",
                homePage.isEditeddDictionaryPresent(), true);


    }
}
