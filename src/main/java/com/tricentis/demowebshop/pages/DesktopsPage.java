package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(css = "h1")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortByDropdown;

    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement displayDropdown;

    @CacheLookup
    @FindBy(id = "products-viewmode")
    WebElement selectProductListDropdown;

    public String getDesktopsText() {
        Reporter.log("Getting desktop text" +desktopsText.toString());
        CustomListeners.test.log(Status.PASS, "Getting desktop text" +desktopsText.toString());
        return desktopsText.getText();
    }
}