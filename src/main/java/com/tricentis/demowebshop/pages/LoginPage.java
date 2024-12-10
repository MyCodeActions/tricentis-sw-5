package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {


    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(css = ".topic-html-content-header")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement welcomeLoginText;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Login was unsuccessful. Please correct the errors ')]")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logoutLink;


    public void enterEmail(String email) {
        emailField.sendKeys(email);
        Reporter.log("enter email "+email+ " to email field" +emailField.toString());
        CustomListeners.test.log(Status.PASS, "enter email "+email+ "to email field" +emailField.toString());
    }

    public void clickOnLoginLink() {
        loginLink.click();
        Reporter.log("Clicking on login link");
        CustomListeners.test.log(Status.PASS,"Clicking on login link");
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
        Reporter.log("enter password "+password+ " to password field" +passwordField.toString());
        CustomListeners.test.log(Status.PASS,"enter password "+password+ "to password field" +passwordField.toString());
    }

    public void clickLoginButton() {
        loginButton.click();
        Reporter.log("Clicking on login button");
        CustomListeners.test.log(Status.PASS,"Clicking on login button");
    }

    public String getWelcomeMessage() {
        Reporter.log("Getting welcome text");
        CustomListeners.test.log(Status.PASS,"Getting welcome text");
        return welcomeText.getText();
    }

    public String getWelcomeLoginMessage() {
        Reporter.log("Getting welcome login message");
        CustomListeners.test.log(Status.PASS,"Getting welcome login message");
        return welcomeLoginText.getText();
    }

    public String getErrorMessage() {
        Reporter.log("Getting error message" +errorMessage);
        CustomListeners.test.log(Status.PASS,"Getting error message" +errorMessage);
        return errorMessage.getText();
    }

    public void clickLogoutLink() {
        logoutLink.click();
        Reporter.log("Clicking on logout ");
        CustomListeners.test.log(Status.PASS,"Clicking on logout ");
    }

    public void clickLoginLink() {
        loginLink.click();
        Reporter.log("Clicking on login link");
        CustomListeners.test.log(Status.PASS,"Clicking on login link");
    }

    public boolean isLogoutLinkDisplayed() {
        return logoutLink.isDisplayed();
    }

    public boolean isLoginLinkDisplayed() {
        return loginLink.isDisplayed();
    }
}
