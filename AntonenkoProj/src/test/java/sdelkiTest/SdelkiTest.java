package sdelkiTest;


import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class SdelkiTest extends ParentTest {

    @Test
    public void addNewSdelka(){
        String dropdownDayValue = "3";
        String dropdownMonthValue = "5";
        String dropdownYearValue = "2013";
        String dropdownHourValue = "7";
        String dropdownMinuteValue = "8";
        String dropdownDealValue = "1";
        String dropdownCustomerValue = "2";
        String dropdownProviderValue = "1";
        loginPage.openPageLogin();
        loginPage.enterLoginIntoInputLogin("Student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true
        );
        homePage.clickOnSdelkiLink();
        checkAcceptanceCriteria("Breadcrumbs are not displayed", sdelkiListPage.isBreadcrumbsPresent(),true);
        sdelkiListPage.clickOnAddButton();
        checkAcceptanceCriteria("Can not work with button", editSdelkiPage.isYearDropDownPresent(), true);
        editSdelkiPage.selectDayValueInDropDown(dropdownDayValue);
        editSdelkiPage.selectMonthValueinDropDown(dropdownMonthValue);
        editSdelkiPage.selectYearValueinDropDown(dropdownYearValue);
        editSdelkiPage.selectHourValueinDropDown(dropdownHourValue);
        editSdelkiPage.selectMinuteValueinDropDown(dropdownMinuteValue);
        editSdelkiPage.selectDealValueinDropDown(dropdownDealValue);
        editSdelkiPage.selectCustomerValueinDropDown(dropdownCustomerValue);
        editSdelkiPage.selectProviderValueinDropDown(dropdownProviderValue);
        editSdelkiPage.clickOnButtonCreate();
        checkAcceptanceCriteria("Add button is no displayed", sdelkiListPage.isAddButtonPresent(), true);


    }
}
