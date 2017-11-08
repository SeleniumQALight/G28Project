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
    public void addNewSpare(){
        loginPage.loginUser("Student","909090");
        // промежуточная проверка
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok("Главная");

        homePage.clickOnMenuDictionary();
        homePage.clickOnSubMenuSpare();
        sparePage.checkZagolovok("Запчасти Список");

    }
}

