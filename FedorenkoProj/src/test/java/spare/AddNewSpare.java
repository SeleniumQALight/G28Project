package spare;

import org.junit.Test;
import parentTest.ParentTest;

public class AddNewSpare extends ParentTest {
    final private String TEST_SPARE = "Spare1";

    @Test
    public void addNewSpare(){
        loginPage.loginUser("Student","909090");
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok("Главная");
        homePage.clickOnMenuDictionary();
        homePage.clickOnSubMenuSpare();
        sparePage.checkZagolovok("Запчасти Список");
    }
}
