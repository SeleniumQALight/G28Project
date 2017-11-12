package dictionaryTest.apparatDictionary;

import org.junit.Test;
import parentTest.ParentTest;


public class RemoveDictionaryAppart extends ParentTest {
    final private String apparatNumber = "12112017";
    final private String apparatComment = "BilousTestComment";

    @Test
    public void removeDictApparat() {
        loginPage.loginUser("Student","909090");
        homePage.clickOnMenuDictionary();
        homePage.selectOnDictionaryMenuItemApparat();
        apparatPage.addNewApparatDictionary();

        /**Remove Dictionary*/
        apparatPage.clickOnApparatDictionary(apparatNumber,apparatComment);
        apparatPage.clickOnRemoveButton();
        homePage.checkZagolovok("Аппарат Список");
        checkAcceptanceCriteria("Removed Dictionary is not present",
                apparatPage.isRemoveddDictionaryNotPresent(apparatNumber,apparatComment), true);

    }
}
