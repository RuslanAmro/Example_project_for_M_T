package com.Example_Project_for_M_T.step_definitions;

import com.Example_Project_for_M_T.pages.US01_successStoryPage;
import com.Example_Project_for_M_T.utilities.BrowserUtils;
import com.Example_Project_for_M_T.utilities.ConfigurationReader;
import com.Example_Project_for_M_T.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US01_successStoryStepDef {

    US01_successStoryPage us01 = new US01_successStoryPage();

    @Given("user is on the platform's main page")
    public void user_is_on_the_platform_s_main_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user locates and selects the Commercial tab from the menu")
    public void user_locates_and_selects_the_commercial_tab_from_the_menu() {

        us01.commercialLink.click();
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        BrowserUtils.verifyTitleContains("Commercial Banking Products & Services | M&T Bank");
    }

    @When("navigates to the Success Stories section")
    public void navigates_to_the_success_stories_section() {

        us01.readTheirStory.click();
    }

    @Then("they choose to read the story associated with Stew Leonard")
    public void they_choose_to_read_the_story_associated_with_stew_leonard() {

        us01.continueBtn.click();
        String expectedTitle = "Solving the Working Capital Challenge: Stew Leonard’s Success Story";
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @Then("expected that the entire reading process should take no longer than four min to read")
    public void expected_that_the_entire_reading_process_should_take_no_longer_than_min_to_read() {

        String expectedText = "4 min read";
        String actualText = us01.durationToRead.getText();
        System.out.println("actualText = " + actualText);
        System.out.println("expectedText = " + expectedText);
        Assert.assertEquals(expectedText, actualText);

        Driver.getDriver().quit();
    }
}
