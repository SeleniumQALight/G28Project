package spare;

import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by Marina on 11/6/2017.
 */
public class AddNewSpare extends ParentTest {
    final private String TEST_SPARE = "Spare1";

    @Test
    public  void  addNewSpare(){
        loginPage.loginUser("Student", "909090");
        homePage.checkTitle("???? ?????????");
        homePage.checkZagolovok("???????");
        homePage.clickOnMenuDictionary();
        homePage.clickOnSubMenuSpare();
        sparePage.checkZagolovok("???????? ??????");
    }
}
