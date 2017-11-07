package spare;


import org.junit.Test;
import org.openqa.selenium.By;
import parentTest.ParentTest;

public class AddNewSpare extends ParentTest {
    final private String TEST_SPARE = "Spare1";

    @Test
    public void addNewSpare() throws InterruptedException {
        loginPage.loginUser("student", "909090");
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok("Главная");
        homePage.clickOnMenuDictionary();

        Thread.sleep(1000);
     checkAcceptanceCriteria("Menu is not present", homePage.isMenuPresent(),true);



        homePage.clickOnSubMenuSpare();

      sparePage.checkZagolovok("Запчасти Список");


    }

}
