package dictionaryTest;

import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by o.bilous on 03-Nov-17.
 */
public class AddDictionaryDealType_CheckBoxMethod extends ParentTest {

    @Test
    public void addNewDictDealType() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPasswordIntoInputPass("909090");
        loginPage.clickOnLoginButton();
        checkAcceptanceCriteria("Avater is not present",
                homePage.isAvatarPresent(), true);
        homePage.clickOnDictionaryExpandList();
        homePage.selectOnDictionaryMenuItemDealType();
        homePage.clickOnAddBtn();
        homePage.clickOnCheckBox();



    }
}
