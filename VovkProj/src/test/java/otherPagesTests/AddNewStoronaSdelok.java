package otherPagesTests;


import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class AddNewStoronaSdelok extends ParentTest{
    final private String CUST_NAME = "Customer Name";
    final private String CUST_ADDRESS = "Customer Address";
    final private String CUST_PHONE = "Customer Phone";


    @Test
    public void addNewStoronaSdelok() {
        loginPage.loginUser("Student", "909090");
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok("Главная");
        homePage.clickOnMenuDictionary();
        homePage.clickOnSubMenuStoronySdelok();
        storonySdelokPage.checkZagolovok("Стороны сделок Список");
        storonySdelokPage.clickOnPlusButton();
        editStoronySdelokPage.checkZagolovok("Словарь");
        editStoronySdelokPage.enterTextIntoProCustName(CUST_NAME);
        editStoronySdelokPage.enterTextIntoProCustAddress(CUST_ADDRESS);
        editStoronySdelokPage.enterTextIntoProCustPhone(CUST_PHONE);
        editStoronySdelokPage.checkCheckBoxPrivatePerson("Checked");
        editStoronySdelokPage.clickOnAddButton();
        storonySdelokPage.checkZagolovok("Стороны сделок Список");
        checkAcceptanceCriteria(CUST_NAME + " Can not find spare in list", storonySdelokPage.isStoronaSdelokInList(CUST_NAME), true );
    }
}
