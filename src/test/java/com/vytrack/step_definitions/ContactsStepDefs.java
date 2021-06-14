package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {
    @Given("the user logged in as a {string}")
    public void the_user_logged_in_as_a(String userType) {
        //go to login page
        Driver.get().get(ConfigurationReader.get("url"));

        //based on input enter the user info
        String username = null;
        String password = null;

        if(userType.equalsIgnoreCase("driver")){
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        }else if(userType.equalsIgnoreCase("store manager")){
            username = ConfigurationReader.get("storemanager_username");
            password = ConfigurationReader.get("storemanager_password");
        }else if(userType.equalsIgnoreCase("sales manager")){
            username = ConfigurationReader.get("salesmanager_username");
            password = ConfigurationReader.get("salesmanager_password");
        }

        //send username and password and login
        new LoginPage().login(username, password);
    }

    @Then("the user should see the following options")
    public void the_user_should_see_the_following_options(List<String> menuOptions) {
        System.out.println("menuOptions.size() = " + menuOptions.size());

        BrowserUtils.waitFor(10);

        //get the list of web elements and convert them to the list of string and assert
        List<String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals(menuOptions, actualOptions);

        System.out.println("menuOptions = " + menuOptions);
        System.out.println("actualOptions = " + actualOptions);

    }
    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userInfo) {

        System.out.println("userInfo = " + userInfo);

        //use map information to login and also verify firstname and lastname
        LoginPage loginPage = new LoginPage();
        loginPage.login(userInfo.get("username"), userInfo.get("password"));

        String actualName = new DashboardPage().getUserName();
        String expectedName = userInfo.get("firstname")+ " " + userInfo.get("lastname");

        Assert.assertEquals(expectedName, actualName);




    }


}
