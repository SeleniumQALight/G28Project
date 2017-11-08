package logInTest;

import org.junit.Test;
import parentTest.ParentTest;

public class logInTest extends ParentTest {
    @Test
    public void validLogIn(){
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogin();
        checkAcceptanceCriteria("Avatar is not present",
                homePage.isAvatarPresent(),true);
        checkAcceptanceCriteria("Title is not exepted", homePage.getTitle(), "Учет запчастей");

        //         Calendar
        //        SimpleFormatter
    }

    @Test
    public void loginItBox() throws InterruptedException {
        loginPage.openPageItBox();
        loginPage.clickAuthButton();
  //      loginPage.enterEmailInItBoxLogin("a1@qa.team");
  //      loginPage.enterPassItBox("123");
        loginPage.clickEnterToLogin();
        Thread.sleep(1000);
    }

    @Test
    public void findProduct() throws InterruptedException {
      loginPage.openPageItBox();
      loginPage.typeProductNameToSearchField("HR1234W");
        Thread.sleep(1000);
        checkAcceptanceCriteria("Title is not exepted", homePage.getTitle(), "Батарея к ИБП 12В 9Ач CSB (HR1234W) - ITbox - интернет-магазин электроники и компьютерной техники");
      homePage.checkZagolovok("Батарея к ИБП 12В 9Ач CSB (HR1234W)");

        // checkAcceptanceCriteria("Title is not exepted", homePage.isPrsentProductImage(), true);
    }

}
