package typeSdelkiTest;

import org.junit.Test;
import parentTest.ParentTest;

public class TypeSdelkiTest extends ParentTest {

    final private String TEST_SDELKI = "SdelkiAntonenko1";

    public TypeSdelkiTest(String browser) {
        super(browser);
    }

    @Test
    public void addTypeSdelki() {

        loginPage.loginUser("Student", "909090");
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok("Главная");
        homePage.clickOnMenuDictionary();
        homePage.clickonSubMenuTypeSdelki();
        typeSdelkiPage.checkZagolovok("Типы сделок Список");
        typeSdelkiPage.clickOnAddButton();
        editTypeSdelkiPage.checkZagolovok("Словарь");
        editTypeSdelkiPage.enterTextInToInputDealTypeName(TEST_SDELKI);
        editTypeSdelkiPage.cliclOnCreateButton();
        typeSdelkiPage.checkZagolovok("Типы сделок Список");
        checkAcceptanceCriteria(TEST_SDELKI + "Can not fined type sdelki in list", typeSdelkiPage.isTypeSdelkiInList(TEST_SDELKI),true);
        typeSdelkiPage.clickOnTypeSdelkiInList(TEST_SDELKI);
        editTypeSdelkiPage.checkZagolovok("Словарь");
        editTypeSdelkiPage.clickOnDeleteButton();
        typeSdelkiPage.checkZagolovok("Типы сделок Список");
        checkAcceptanceCriteria(TEST_SDELKI + "Can not fined type sdelki in list", typeSdelkiPage.isTypeSdelkiInList(TEST_SDELKI),false);






    }
}
