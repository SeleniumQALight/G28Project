package dictionaryTest.dealTypeDictionary;

import org.junit.Test;
import parentTest.ParentTest;


public class AddDictionaryDealType_CheckBoxMethod extends ParentTest {

    public AddDictionaryDealType_CheckBoxMethod(String browser) {
        super(browser);
    }

    @Test
    public void addNewDictDealType() {
        loginPage.loginUser("Student","909090");
        dealTypePage.clickOnMenuDictionary();
        dealTypePage.selectOnDictionaryMenuItemDealType();
        apparatPage.clickOnAddBtn();
        //homePage.clickOnCheckBox();



    }
}
