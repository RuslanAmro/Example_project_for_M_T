package com.Example_Project_for_M_T.pages;

import com.Example_Project_for_M_T.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US01_successStoryPage {

    public US01_successStoryPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//a[@class='header-link'])[2]")
    public WebElement commercialLink;

    @FindBy(css = ".buttonLabel")
    public WebElement readTheirStory;

    @FindBy(css = "#speedbump-cta-button > a > span")
    public WebElement continueBtn;

    @FindBy(xpath = "//span[@class='_duration']")
    public WebElement durationToRead;

}