package dictionaryTest.apparatDictionary;

import org.junit.Test;
import parentTest.ParentTest;


public class EditDictionaryAppart extends ParentTest {
    final private String apparatNumber = "12112017";
    final private String apparatComment = "BilousTestComment";
    final private String editedApparatNumber = "121120172";
    final private String editedApparatComment = "BilousTestCommentEdited";

    public EditDictionaryAppart(String browser) {
        super(browser);
    }


    @Test
    public void editDictApparat() {
        loginPage.loginUser("Student","909090");
        homePage.clickOnMenuDictionary();
        homePage.selectOnDictionaryMenuItemApparat();
        apparatPage.addNewApparatDictionary();
        apparatPage.clickOnApparatDictionary(apparatNumber,apparatComment );

        /**Editing text in dictionary inputs*/
        apparatPage.enterInIntoInputApparatNumber(editedApparatNumber);
        apparatPage.enterInIntoInputApparatComment(editedApparatComment);
        apparatPage.clickOnSaveButton();
        checkAcceptanceCriteria("Edited Dictionary is not present",
                apparatPage.isAddedApparatDictionaryPresent(editedApparatNumber,editedApparatComment), true);


    }
}
