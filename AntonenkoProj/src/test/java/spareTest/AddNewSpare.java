package spareTest;

import org.junit.Test;
import parentTest.ParentTest;

public class AddNewSpare extends ParentTest {
    final private String TEST_SPARE = "SpareAntonenko";

    @Test
    public void addNewSpare(){

        loginPage.loginUser("Student","909090");
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok("Главная");
        homePage.clickOnMenuDictionary();
        homePage.clickOnSubMenuSpare();
        sparePage.checkZagolovok("Запчасти Список");
        sparePage.clickOnPlysButton();
        editNewSparePage.checkZagolovok("Словарь");
        editNewSparePage.enterTextInToInputSpareName(TEST_SPARE);
        editNewSparePage.selectTextInDropDownTypeOfSpare("Датчики");
        editNewSparePage.clickOnAddButton();
        sparePage.checkZagolovok("Запчасти Список");
        checkAcceptanceCriteria(TEST_SPARE + "Can not fined spare in list", sparePage.isSpareInList(TEST_SPARE),true);
    }

    @Test
    public void deleteNewSpare(){
        loginPage.loginUser("Student","909090");
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok("Главная");
        homePage.clickOnMenuDictionary();
        homePage.clickOnSubMenuSpare();
        sparePage.checkZagolovok("Запчасти Список");
        sparePage.clickOnPlysButton();
        editNewSparePage.checkZagolovok("Словарь");
        editNewSparePage.enterTextInToInputSpareName(TEST_SPARE);
        editNewSparePage.selectTextInDropDownTypeOfSpare("Датчики");
        editNewSparePage.clickOnAddButton();
        sparePage.checkZagolovok("Запчасти Список");
        checkAcceptanceCriteria(TEST_SPARE + "Can not fined spare in list", sparePage.isSpareInList(TEST_SPARE),true);
        sparePage.clickOnSpareInList(TEST_SPARE);
        editNewSparePage.checkZagolovok("Словарь");
        editNewSparePage.clickOnDeleteButton();
        sparePage.checkZagolovok("Запчасти Список");
        checkAcceptanceCriteria(TEST_SPARE + "Fined spare in list", sparePage.isSpareInList(TEST_SPARE),false);
    }
}
