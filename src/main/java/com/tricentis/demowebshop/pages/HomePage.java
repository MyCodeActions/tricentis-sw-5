package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu']//a")
    List<WebElement> allMenuLinks;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(css = "img[alt='nopCommerce demo store']")
    WebElement logo;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Computers'])[1]")
    WebElement computerTab;


    public void clickOnComputersTab() {
        computerTab.click();
        Reporter.log("Cliking on computer tab" +computerTab.toString());
        CustomListeners.test.log(Status.PASS, "Cliking on computer tab" +computerTab.toString());
    }

    public void clickLoginLink() {
        loginLink.click();
        Reporter.log("Cliking on login link" +loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Cliking on login link" +loginLink.toString());
    }

    public void clickRegisterLink() {
        registerLink.click();
        Reporter.log("Cliking on register link" +registerLink.toString());
        CustomListeners.test.log(Status.PASS, "Cliking on register link" +registerLink.toString());
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();

    }

    public boolean isLogoutLinkDisplayed() {
        return logoutLink.isDisplayed();
    }
}