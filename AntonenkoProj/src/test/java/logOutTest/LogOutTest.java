package logOutTest;

import org.junit.Test;
import parentTest.ParentTest;

public class LogOutTest extends ParentTest {


    public LogOutTest(String browser) {
        super(browser);
    }

    @Test
    public void logOutFromSite (){

        loginPage.loginUser("Student","909090");
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok("Главная");
        homePage.clickOnStudentAvatar();
        checkAcceptanceCriteria("Button is not present",homePage.isLogoutButtonPresent(),true);
        homePage.clickOnLogoutButton();
        checkAcceptanceCriteria("Email input foeldis not prsent", loginPage.isInputLoginFieldPresent(),true);
    }
}
