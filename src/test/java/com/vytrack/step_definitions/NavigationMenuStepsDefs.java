package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepsDefs {


    @Given("the user logged in")
    public void the_user_logged_in() {
        System.out.println("The user logged in as a sales manager");
    }

    @When("the user navigates from Fleet to Vehicles")
    public void the_user_is_on_the_top_menu_navigate_from_Fleet_to_Vehicles() {
        System.out.println("The user navigates from Fleet to Vehicles");
    }

    @Then("check the title Vehicles")
    public void check_the_title_Vehicles() {
        System.out.println("Check the title Vehicles");
    }

    @When("the user navigates from Marketing to Campaigns")
    public void the_user_is_on_the_top_menu_navigate_from_Marketing_to_Campaigns() {
        System.out.println("The user navigates from Marketing to Campaigns");

    }

    @Then("check the title Campaigns")
    public void check_the_title_Campaigns() {
        System.out.println("Check the title Campaigns");
    }

    @When("the user navigates from Activities to Calendar Events")
    public void the_user_is_on_the_top_menu_navigate_from_Activities_to_Calendar_Events() {
        System.out.println("The user navigates from Activities to Calendar Events");
    }

    @Then("check the title Calendars")
    public void check_the_title_Calendars() {
        System.out.println("Check the title Calendars");
    }

}
