package com.cydeo.step_definitions;

import com.cydeo.pages.WebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebTable_StepDefinitions {

    WebTablePage webTablePage = new WebTablePage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("wev.table.url");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {

        webTablePage.inputUsername.sendKeys(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTablePage.inputPassword.sendKeys(string);
        ;
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        webTablePage.loginButton.click();
    }

    @Then("user should see url contains order")
    public void user_should_see_url_contains_order() {

        BrowserUtils.verifyURLContains("orders");

    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String pw) {
        webTablePage.login(username, pw);
    }

}
