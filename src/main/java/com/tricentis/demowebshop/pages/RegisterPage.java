package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @FindBy(css = "h1")
    WebElement registerText;

    @FindBy(id = "register-button")
    WebElement registerButton;

    @FindBy(xpath = "//span[@for='FirstName']")
    WebElement firstNameError;

    @FindBy(xpath = "//span[@for='LastName']")
    WebElement lastNameError;

    @FindBy(xpath = "//span[@for='Email']")
    WebElement emailError;

    @FindBy(xpath = "//span[@for='Password']")
    WebElement passwordError;

    @FindBy(xpath = "//span[@for='ConfirmPassword']")
    WebElement confirmPasswordError;

    @FindBy(id = "gender-female")
    WebElement genderFemaleRadio;

    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @FindBy(id = "LastName")
    WebElement lastNameField;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @FindBy(css = "div.result")
    WebElement registrationSuccessMessage;



    public String getRegisterText() {
        Reporter.log("Getting registration text");
        CustomListeners.test.log(Status.PASS,"Getting registration text");
        return registerText.getText();
    }

    public void clickRegisterButton() {
        registerButton.click();
        Reporter.log("Clicking on registration button"+registerButton.toString());
        CustomListeners.test.log(Status.PASS,"Clicking on registration button"+registerButton.toString());
    }

    public String getFirstNameError() {
        Reporter.log("Getting first name error" +firstNameError.toString());
        CustomListeners.test.log(Status.PASS,"Getting first name error" +firstNameError.toString());
        return firstNameError.getText();
    }

    public String getLastNameError() {
        Reporter.log("Getting last name error" +lastNameError.toString());
        CustomListeners.test.log(Status.PASS,"Getting last name error" +lastNameError.toString());
        return lastNameError.getText();
    }

    public String getEmailError() {
        Reporter.log("Getting email id error" +emailError.toString());
        CustomListeners.test.log(Status.PASS,"Getting email id error" +emailError.toString());
        return emailError.getText();
    }

    public String getPasswordError() {
        Reporter.log("Getting password error" +passwordError.toString());
        CustomListeners.test.log(Status.PASS,"Getting password error" +passwordError.toString());
        return passwordError.getText();
    }

    public String getConfirmPasswordError() {
        Reporter.log("Getting confirm password error" +confirmPasswordError.toString());
        CustomListeners.test.log(Status.PASS,"Getting confirm password error" +confirmPasswordError.toString());
        return confirmPasswordError.getText();
    }
    public void selectGenderFemale() {
        genderFemaleRadio.click();
        Reporter.log("Selecting gender");
        CustomListeners.test.log(Status.PASS,"Selecting gender");
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
        Reporter.log("entering first name " +firstNameField.toString());
        CustomListeners.test.log(Status.PASS,"entering first name " +firstNameField.toString());
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
        Reporter.log("entering last name " +lastNameField.toString());
        CustomListeners.test.log(Status.PASS,"entering last name " +lastNameField.toString());
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
        Reporter.log("entering email id " +emailField.toString());
        CustomListeners.test.log(Status.PASS,"entering email id " +emailField.toString());
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
        Reporter.log("entering password " +passwordField.toString());
        CustomListeners.test.log(Status.PASS,"entering password " +passwordField.toString());
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
        Reporter.log("entering confirm password " +confirmPassword.toString());
        CustomListeners.test.log(Status.PASS,"entering confirm password " +confirmPassword.toString());
    }

    public String getRegistrationSuccessMessage() {
        Reporter.log("Getting registration successful message "+registrationSuccessMessage.toString());
        CustomListeners.test.log(Status.PASS,"Getting registration successful message "+registrationSuccessMessage.toString());
        return registrationSuccessMessage.getText();
    }
}