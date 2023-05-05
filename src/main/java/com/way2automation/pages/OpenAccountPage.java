package com.way2automation.pages;

import com.way2automation.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By customerDropdown = By.id("userSelect");
    By currencyDropdown = By.id("currency");
    By processButton = By.xpath("//button[contains(text(),'Process')]");

    public void searchAndSelectCreatedCustomer() {
        selectByVisibleTextFromDropDown(customerDropdown, "JainaA Patel");
    }

    public void selectPoundInCurrency() {
        selectByVisibleTextFromDropDown(currencyDropdown, "Pound");
    }

    public void clickOnProcessButton() {
        clickOnElement(processButton);
    }

}
