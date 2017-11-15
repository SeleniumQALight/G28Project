package spare;

import org.junit.Test;
import parentTest.ParentTest;

public class AddNewSpare extends ParentTest {
    final private String TEST_SPARE = "Spare456";

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
        editSparePage.enterTextIntoSpareName(TEST_SPARE);
        editSparePage.selectTextInDropDownTypeOfSpare("Датчики");
        editSparePage.clickOnAddButton();
        sparePage.checkZagolovok("Запчасти Список");
        checkAcceptanceCriteria(TEST_SPARE + " Can not find spare in list", sparePage.isSpareInList(TEST_SPARE), true );


    }

}
