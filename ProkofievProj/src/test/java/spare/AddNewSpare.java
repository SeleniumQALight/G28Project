package spare;

import parentTest.ParentTest;
import org.junit.Test;

public class AddNewSpare extends ParentTest {
    final private String TEST_SPARE = "Spare1";

    public AddNewSpare(String browser) {
        super(browser);
    }

    @Test
    public void addNewSpare() {
        loginPage.loginUser("Student", "909090");
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok("Главная");
        homePage.clickOnMenuDictionary();
        homePage.clickOnSubMenuSpare();
        sparePage.checkZagolovok("Запчасти Список");
        sparePage.clickOnPlusButton();
        editSparePage.checkZagolovok("Словарь");
        editSparePage.enterTextInToInputSpareName(TEST_SPARE);
        editSparePage.selectTextInDropDownTypeOfSpare("Датчики");
        editSparePage.clickOnAddButton();
        sparePage.checkZagolovok("Запчасти Список");
        checkAcceptanceCriteria(TEST_SPARE + "Can not find spare in List", sparePage.isSparInList(TEST_SPARE), true);
        }
}

