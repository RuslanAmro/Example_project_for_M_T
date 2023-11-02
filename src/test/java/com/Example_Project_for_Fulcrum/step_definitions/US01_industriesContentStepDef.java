package com.Example_Project_for_Fulcrum.step_definitions;

import com.Example_Project_for_Fulcrum.pages.US01_industriesContentPage;
import com.Example_Project_for_Fulcrum.utilities.BrowserUtils;
import com.Example_Project_for_Fulcrum.utilities.ConfigurationReader;
import com.Example_Project_for_Fulcrum.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US01_industriesContentStepDef {

    US01_industriesContentPage us01_industriesContentPage = new US01_industriesContentPage();

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
    }

    @When("the user clicks on the industries dropdown")
    public void the_user_clicks_on_the_industries_dropdown() {

        us01_industriesContentPage.industriesDropdown.click();
    }

    @Then("the user should observe the dropdown content")
    public void the_user_should_observe_the_dropdown_content(List<String> expectedIndustriesOptions) {

        List<String> actualIndustriesOptions = BrowserUtils.getElementsText(us01_industriesContentPage.industriesContent);
        for (String eachMenuOption : actualIndustriesOptions) {
            System.out.println("eachMenuOption = " + eachMenuOption);
        }
        Assert.assertEquals(expectedIndustriesOptions, actualIndustriesOptions);
    }

    @Then("clicks the logistics link")
    public void clicks_the_logistics_link() {

        WebElement logisticLink = us01_industriesContentPage.logisticsLink;
        logisticLink.click();
    }

    @Then("user should be able to see the link content")
    public void user_should_be_able_to_see_the_link_content() {

        BrowserUtils.waitFor(2);
        String expectedTitle = "Manufacturing, Retail & Logistics Solutions | Fulcrum Digital";
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());

        Driver.getDriver().quit();

    }
}
