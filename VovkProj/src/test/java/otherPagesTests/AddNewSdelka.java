package otherPagesTests;

import org.junit.Test;
import parentTest.ParentTest;

public class AddNewSdelka extends ParentTest{
    @Test
    public void addNewSdelkaWithIncorrectData () {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPassIntoInputPass("909090");
        loginPage.clickOnButtonLogin();

        homePage.openPageSdelky();
        sdelkyPage.createNewSdelka("31", "2");
        checkAcceptanceCriteria("Incorrect data", sdelkyPage.isErrorMessagePresent(), true);

    }
}

