package com.Example_Project_for_M_T.step_definitions;

import com.Example_Project_for_M_T.pages.US02_mainMenuPage;
import com.Example_Project_for_M_T.utilities.BrowserUtils;
import com.Example_Project_for_M_T.utilities.ConfigurationReader;
import com.Example_Project_for_M_T.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US02_mainMenuStepDef {

    US02_mainMenuPage us02 = new US02_mainMenuPage();

    @Given("a user is on the homepage")
    public void a_user_is_on_the_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
    }

    @When("the user selects the main menu")
    public void the_user_selects_the_main_menu() {

        BrowserUtils.waitFor(3);
        us02.hamburgerMenu.click();
    }

    @Then("all options should be accurately labeled and relevant")
    public void all_options_should_be_accurately_labeled_and_relevant(List<String> expectedMenuOptions) {

        List<String> actualMenuOptions = BrowserUtils.getElementsText(us02.menuOptions);
        for (String eachMenuOption : actualMenuOptions) {
            System.out.println("eachMenuOption = " + eachMenuOption);
        }
        Assert.assertEquals(expectedMenuOptions, actualMenuOptions);
    }

    @Then("user clicks on About M&T option")
    public void user_clicks_on_about_m_t_option() {

        WebElement aboutMTLink = us02.aboutMTLink;
        aboutMTLink.click();
        String expectedTitle = "About Us";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
        BrowserUtils.waitFor(2);
        BrowserUtils.verifyTitle(expectedTitle);

        Driver.getDriver().quit();
    }
}
