package com.Example_Project_for_M_T.pages;

import com.Example_Project_for_M_T.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US02_mainMenuPage {

    public US02_mainMenuPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='hamburger-button']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//div[@class='helpful-links-container component']/ul/li")
    public List<WebElement> menuOptions;

    @FindBy(linkText = "About M&T")
    public WebElement aboutMTLink;

}


