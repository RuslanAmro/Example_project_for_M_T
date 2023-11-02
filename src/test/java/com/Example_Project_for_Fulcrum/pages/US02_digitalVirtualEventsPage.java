package com.Example_Project_for_Fulcrum.pages;

import com.Example_Project_for_Fulcrum.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US02_digitalVirtualEventsPage {

    public US02_digitalVirtualEventsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "big-menu-icon")
    public WebElement menuIcon;

    @FindBy(xpath = "(//div[@class='news-room-box'])[3]")
    public WebElement eventsBox;

    @FindBy(xpath = "//a[.='Virtual']")
    public WebElement virtualLink;

}
