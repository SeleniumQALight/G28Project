package dials;

import org.junit.Test;
import parentTest.ParentTest;


public class DealsOpenPageTest extends ParentTest {

    @Test
    public void pageDeals(){
        loginPage.loginUser("Student","909090");
        homePage.checkTitle("Учет запчастей");
        homePage.clickOnMenuDeals();
        dealsPage.checkTitle("Сделки");



    }

}
