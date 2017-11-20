package logInTest;

import libs.ConfigData;
import org.junit.Test;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;

public class ValidLoginWithParamsFromExcel extends ParentTest {

    public ValidLoginWithParamsFromExcel(String browser) {
        super(browser);
    }

    @Test
    public void validLogin() throws IOException {
        Map dataFromExcelForValidLogin = excelDriver.getData(ConfigData.getCfgValue("DATA_FILE"), "validLogOn");
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin(dataFromExcelForValidLogin.get("login").toString());
        loginPage.enterPassIntoInputPass(dataFromExcelForValidLogin.get("pass").toString());
        loginPage.clickOnButtonLogin();
        //Assert.assertTrue("Avatar is not present", homePage.isAvatarPresent());
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true);
        checkAcceptanceCriteria("Title is not exepted", homePage.getTitle(), "Учет запчастей");
    }
}
