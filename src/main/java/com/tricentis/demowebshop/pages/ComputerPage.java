package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {


    @CacheLookup
    @FindBy(css = "h1")
    WebElement computersText;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

    @CacheLookup
    @FindBy(linkText = "Notebooks")
    WebElement notebooksLink;

    @CacheLookup
    @FindBy(linkText = "Software")
    WebElement softwareLink;


    public void clickDesktopsLink() {
        desktopsLink.click();
        Reporter.log("Clicking on desktop link");
        CustomListeners.test.log(Status.PASS, "Clicking on desktop link");
    }

    public String getComputersText() {
        Reporter.log("Getting computer text"+computersText.toString());
        CustomListeners.test.log(Status.PASS, "Getting computer text"+computersText.toString());
        return getTextFromElement(computersText);
    }
}







