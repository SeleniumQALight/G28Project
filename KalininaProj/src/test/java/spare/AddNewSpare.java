package spare;

import org.junit.Test;
import parrentTest.ParrentTest;

/**
 * Created by Администратор on 06.11.2017.
 */
public class AddNewSpare extends ParrentTest {
    final private String TEST_SPARE = "Spare1";

    @Test
    public void addNewSpare() {
        loginPage.loginUser("Student", "909090");
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok ("Главная");
        homePage.clickOnMenuDictionary();
        homePage.clickOnSubMenuSpare();
        sparePage.checkZagolovok("Запчасти Список");
    }
}
