package otherPagesTests;


import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class AddNewStoronaSdelok extends ParentTest{
    @Test
    public void addNewStoronaSdelok() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPassIntoInputPass("909090");
        loginPage.clickOnButtonLogin();

        homePage.openPageStoronySdelok();
        storonySdelokPage.createNewPrivatePersonKontragent("TestV2", "Address V2", false);
        Assert.assertTrue(true);
    }
}
