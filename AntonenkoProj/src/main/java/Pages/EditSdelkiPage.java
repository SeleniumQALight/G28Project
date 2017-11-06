package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditSdelkiPage extends ParentPage {

    @FindBy(xpath = ".//select[@id='deal_dealDate_date_year']")
    WebElement yeardropdown;
    @FindBy(xpath = ".//select[@id='deal_dealDate_date_day']")
    WebElement daydropdown;
    @FindBy(xpath = ".//select[@id='deal_dealDate_date_month']")
    WebElement monthdropdown;
    @FindBy(xpath = ".//select[@id='deal_dealDate_time_hour']")
    WebElement hourdropdown;
    @FindBy(xpath = ".//select[@id='deal_dealDate_time_minute']")
    WebElement minutedropdown;
    @FindBy(xpath = ".//select[@id='deal_dealType']")
    WebElement dealdropdown;
    @FindBy(xpath = ".//select[@id='deal_customer']")
    WebElement customerdropdown;
    @FindBy(xpath = ".//select[@id='deal_provider']")
    WebElement providerdropdown;
    @FindBy(xpath = ".//button[@name='add']")
    WebElement buttonCreate;



    public EditSdelkiPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isYearDropDownPresent(){
        return actionsWithOurWebElements.isElementPresent(yeardropdown);
    }

    public void selectDayValueInDropDown(String dropdownDayValue) {

        actionsWithOurWebElements.selectItemInDropDownByValue(daydropdown,dropdownDayValue );
    }

   public void selectMonthValueinDropDown(String dropdownMonthValue){

        actionsWithOurWebElements.selectItemInDropDownByValue(monthdropdown,dropdownMonthValue);
    }

    public void selectYearValueinDropDown(String dropdownYearValue){

        actionsWithOurWebElements.selectItemInDropDownByValue(yeardropdown,dropdownYearValue);
    }

    public void selectHourValueinDropDown(String dropdownHourValue){

        actionsWithOurWebElements.selectItemInDropDownByValue(hourdropdown,dropdownHourValue);
    }

    public void selectMinuteValueinDropDown(String dropdownMinuteValue){

        actionsWithOurWebElements.selectItemInDropDownByValue(minutedropdown,dropdownMinuteValue);
    }

    public void selectDealValueinDropDown(String dropdownDealValue){

        actionsWithOurWebElements.selectItemInDropDownByValue(dealdropdown,dropdownDealValue);
    }
    public void selectCustomerValueinDropDown(String dropdownCustomerValue){

        actionsWithOurWebElements.selectItemInDropDownByValue(customerdropdown,dropdownCustomerValue);
    }
    public void selectProviderValueinDropDown(String dropdownProviderValue){

        actionsWithOurWebElements.selectItemInDropDownByValue(providerdropdown,dropdownProviderValue);
    }

    public void clickOnButtonCreate(){

        actionsWithOurWebElements.clickOnWebElement(buttonCreate);
    }


}
