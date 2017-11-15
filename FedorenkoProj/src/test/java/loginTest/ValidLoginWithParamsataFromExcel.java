package loginTest;


import libs.ConfigData;
import org.junit.Test;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Aleksandr on 13.11.2017.
 */

public class ValidLoginWithParamsataFromExcel extends ParentTest {
    public ValidLoginWithParamsataFromExcel(String browser) {
        super(browser);
    }

    @Test
    public void validLogIn() throws IOException {
        Map dataFromExcelForValidLogin = excelDriver.getData(ConfigData.getCfgValue("DATA_FILE"),"validLogOn");
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin(dataFromExcelForValidLogin.get("login").toString());
        loginPage.enterPassInToInputPass(dataFromExcelForValidLogin.get("pass").toString());
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present",
                homePage.isAvatarPresent(), true);
        checkAcceptanceCriteria("Title is not excepted",
                homePage.getTitle(), "Учет запчастей");
    }
}
