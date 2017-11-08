package spare;

import org.junit.Test;
import parentTest.ParentTest;

// страница запчасти

public class AddNewSpare extends ParentTest {
    // переменная , текст которой будем использовать в тесте
    final private String TEST_SPARE = "Spare1";


    @Test
//логинимся на странице
//
    public void addNewSpare() {
        loginPage.loginUser("Student", "909090");
        homePage.checkTitle("Учет запчастей"); // промежуточная проверка

        homePage.checkZagolovok("Главная");
        homePage.clickOnMenuDictionary();
        homePage.clickOnSubMenuSpare();

        sparePage.checkZagolovok("Запчасти Список");
        sparePage.clickOnPlusButton();
        editSparePage.checkZagolovok("Словарь");

        editSparePage.enterTextInToSpareName(TEST_SPARE);
        editSparePage.selectTextInDropDownTypeOfSpare("Датчики");
        editSparePage.clickOnAddButton();

        sparePage.checkZagolovok("Запчасти Список");
        checkAcceptanceCriteries(TEST_SPARE + "Can not find spare in List ",
                sparePage.isSpareInList(TEST_SPARE), true);


    }
}

