package serviceTest;

import org.junit.Test;
import parentTest.ParentTest;

public class ServiceTest extends ParentTest {
    @Test // Тест кейс - тестирование dropDown на строанице service

    // Логинимся используя метод validLogin
    public void validLogIn() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPassInToInputPass("909090");


        loginPage.clickOnButtonLogin();


        // Assert.assertTrue("Avatar is not present", homePage.isAvatarPresent()); // измнение цвета текста
        // если автар не найден будет найден
        // будет выведено сообщение "Avatar is not present"
        checkAcceptanceCriteries("Avatar is not present",
                homePage.isAvatarPresent(), true); // если поменять на false - получим скриншот

        servicePage.openPageService();

    }

//    public void validServicePage() {
//        servicePage.openPageService();
//    }

}
