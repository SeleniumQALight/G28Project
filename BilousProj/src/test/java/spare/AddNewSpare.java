package spare;


import org.junit.Test;
import parentTest.ParentTest;

public class AddNewSpare extends ParentTest {
    final private String testSpare = "Spare2";

    @Test
    public void addNewSPare() {
        loginPage.loginUser("Student", "909090");
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok("Главная");
        homePage.clickOnMenuDictionary();
        homePage.clickonSubmenuSpare();
        sparePage.checkZagolovok("Запчасти Список");
        sparePage.clickNewButton();
        editSparePage.checkZagolovok("Словарь");
        editSparePage.enterTextInToInputSpareName(testSpare);
        editSparePage.selectTextDropDownSpareType("Датчики");
        editSparePage.clickOnAddButton();
        sparePage.checkZagolovok("Запчасти Список");
        checkAcceptanceCriteria(testSpare + " Can not find spare in List ",
                sparePage.isSpareinList(testSpare),true);

        }


}
