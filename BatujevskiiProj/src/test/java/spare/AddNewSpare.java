package spare;


import org.junit.Test;
import parentTest.ParentTest;

public class AddNewSpare extends ParentTest {
    final private String TEST_SPARE = "Spare1_A1";
    final private String TEST_SPARE2 = "Spare1_A2";

    public AddNewSpare(String browser) {
        super(browser);
    }

    @Test
    public void addNewSpare() {
        loginPage.loginUser("student", "909090");
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok("Главная");
        homePage.clickOnMenuDictionary();
        homePage.clickOnSubMenuSpare();
        sparePage.checkZagolovok("Запчасти Список");
        sparePage.clickOnPlusButton();
        editSparePage.checkZagolovok("Словарь");
        editSparePage.enterTextInToInputSpareName(TEST_SPARE);
        editSparePage.selectTextInDropDownTypeOfSpare("Механика");
        editSparePage.clickOnAddButton();
        sparePage.checkZagolovok("Запчасти Список");
        checkAcceptanceCriteria(TEST_SPARE + " Can not find spare in list", sparePage.isSpareInList(TEST_SPARE), true);
        // utils.screenShot(pathToScreenShot, parentTest.driver);
 //       sparePage.deleteSpareInList(TEST_SPARE);
    sparePage.deleteSpareInListList(TEST_SPARE);
        checkAcceptanceCriteria(TEST_SPARE + " Can not delete spare in list", sparePage.isSpareInList(TEST_SPARE), false);
     //   utils.screenShot(pathToScreenShot);

    }




}
