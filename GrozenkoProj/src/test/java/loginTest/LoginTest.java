package loginTest; // для написания команд для удобного чтения обычн людьми

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import parentTest.ParentTest;

public class LoginTest extends ParentTest {

    @Test // Тест кейс
    public void validLogIn() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPassInToInputPass("909090");

        loginPage.clickOnButtonLogin();
        Assert.assertTrue("Avatar is not present", homePage.isAvatarPresent()); // измнение цвета текста

    }
}
