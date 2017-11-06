package dictionaryTest;

import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by o.bilous on 03-Nov-17.
 */
public class AddDictionaryDealType_CheckBoxMethod extends ParentTest {

    @Test
    public void addNewDictDealType() {
        loginPage.loginUser("Student","909090");
        homePage.clickOnMenuDictionary();
        homePage.selectOnDictionaryMenuItemDealType();
        homePage.clickOnAddBtn();
        //homePage.clickOnCheckBox();



    }
}
