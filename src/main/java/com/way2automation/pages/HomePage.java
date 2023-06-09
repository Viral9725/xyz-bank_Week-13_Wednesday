package com.way2automation.pages;

import com.way2automation.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By bankManagerLoginTab = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLoginTab = By.xpath("//button[@ng-click='customer()']");

    public void clickOnBankManagerLoginTab() {
        clickOnElement(bankManagerLoginTab);
    }

    public void clickOnCustomerLoginTab() {
        clickOnElement(customerLoginTab);
    }

}
