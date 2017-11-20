package homeWorkTests;

import org.junit.Test;
import parentTest.ParentTest;

public class LogOutTest extends ParentTest {
    public LogOutTest(String browser) {
        super(browser);
    }

    @Test
    public void logOutTest () {
        loginPage.loginUser("Student", "909090");
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok("Главная");
        homePage.clickOnAvatar();
        homePage.clickOnButtonLogout();
        checkAcceptanceCriteria("Button Login is not present", loginPage.isButtonLoginPresent(), true);
        checkAcceptanceCriteria("Title is not match", loginPage.getTitle(), "Account of spare:Авторизация");
    }
}
