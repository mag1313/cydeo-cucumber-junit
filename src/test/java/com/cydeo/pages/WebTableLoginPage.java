package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {

    public WebTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    /*
    no parameters.
    will directly log in
     */
    public void login() {
        this.inputUsername.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * This meyhod will accept two arguments ang login.
     *
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    /**
     * this method will login using credentials from configuration.properties
     */
    public void loginWithConfig() {
        inputUsername.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        loginButton.click();
    }


}
