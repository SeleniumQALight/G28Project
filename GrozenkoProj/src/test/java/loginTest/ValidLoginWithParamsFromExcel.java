package loginTest;


import libs.ConfigData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;


public class ValidLoginWithParamsFromExcel extends ParentTest{



    public ValidLoginWithParamsFromExcel(String browser) {
        super(browser);

    }

    @Test // Тест кейс
    public void validLogIn() throws IOException {
        Map dataFromExcelForValidLogIn = excelDriver.getData(ConfigData.getCfgValue("DATA_FILE"),"validLogOn");
        loginPage.openPageLogin();
//        loginPage.enterLogInIntoInputLogin("Student");
//        loginPage.enterPassInToInputPass("909090");

        loginPage.enterLogInIntoInputLogin(dataFromExcelForValidLogIn.get("login").toString());
        loginPage.enterPassInToInputPass(dataFromExcelForValidLogIn.get("pass").toString());

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
