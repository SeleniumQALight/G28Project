package loginTest;

import org.junit.Test;
import parentTest.ParentTest;

public class ValidLogin extends ParentTest{

    public ValidLogin(String browser) {
        super(browser);
    }

    @Test // Тест кейс
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

        checkAcceptanceCriteries("Title is not excepted",
                homePage.getTitle(), "Учет запчастей");

        //Calendar - спрашиваем дату и время
        // SimpleFormat -  выбираем формат отображения времени и даты
    }

}
