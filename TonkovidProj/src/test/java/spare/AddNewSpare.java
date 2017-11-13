package spare;

import org.junit.Test;
import parentTest.ParentTest;

public class AddNewSpare extends ParentTest {
    final private String TEST_SPARE = "Spare1";

    @Test
    public void addNewSpare (){
        loginPage.loginUser("student","909090");
        loginPage.clickOnButtonLogIn();
        homePage.checkZagolovok("Главная");
        homePage.clickOnMenuDictionary();
        sparePage.checkZagolovok("Запчасти Список");
    }
}
