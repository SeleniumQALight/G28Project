package loginTest;

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

        Map dataFromExcelForValidLogIn = excelDriver.getData(ConfigData.getCfgValue("DATA_FILE"),"validLogOn");


        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin(dataFromExcelForValidLogIn.get("login").toString());
        loginPage.enterPasswordIntoInputPass(dataFromExcelForValidLogIn.get("pass").toString());
        loginPage.clickOnLoginButton();
        checkAcceptanceCriteria("Avater is not present",
                homePage.isAvatarPresent(), true);
        checkAcceptanceCriteria("Titles is not exepted",
                homePage.getTitle(), "Учет запчастей");
    }
}
