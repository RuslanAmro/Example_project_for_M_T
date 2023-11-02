package com.Example_Project_for_Fulcrum.step_definitions;

import com.Example_Project_for_Fulcrum.pages.US02_digitalVirtualEventsPage;
import com.Example_Project_for_Fulcrum.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US02_digitalVirtualEventsStepDef {

    US02_digitalVirtualEventsPage us02DigitalVirtualEventsPage = new US02_digitalVirtualEventsPage();

    @When("the user clicks on the events section")
    public void the_user_clicks_on_the_events_section() {

        us02DigitalVirtualEventsPage.menuIcon.click();
    }

    @When("selects virtual events")
    public void selects_virtual_events() {

        us02DigitalVirtualEventsPage.eventsBox.click();
    }

    @Then("the user should be presented with all virtual events")
    public void theUserShouldBePresentedWithAllVirtualEvents() {

        us02DigitalVirtualEventsPage.virtualLink.click();
        String expectedTitle = "Events | Fulcrum Digital";
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());

        Driver.getDriver().quit();

    }
}

