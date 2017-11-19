package LoginTest;


import libs.ConfigData;
import org.junit.Test;
import org.junit.runner.RunWith;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;


/**
 * Created by Администратор on 13.11.2017.
 */


public class ValidLoginWithParamsFromExcel extends ParentTest {


    public ValidLoginWithParamsFromExcel(String browser) {
        super(browser);


    }
    @Test
    public void validLogin() throws IOException {
    Map dataFromExcelForValidLogIn =excelDriver.getData(ConfigData.getCfgValue("DATA_FILE"),"valiLogOn");

        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin(dataFromExcelForValidLogIn.get("login").toString());
        loginPage.enterPassInToInputPass(dataFromExcelForValidLogIn.get("pass").toString());
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true);
        checkAcceptanceCriteria("Title is not excepted", homePage.getTitle(), "Учет запчастей");

    }

}