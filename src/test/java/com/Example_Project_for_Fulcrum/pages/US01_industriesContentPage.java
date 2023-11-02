package com.Example_Project_for_Fulcrum.pages;

import com.Example_Project_for_Fulcrum.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US01_industriesContentPage {

    public US01_industriesContentPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//a[@class='__mPS2id _mPS2id-h'])[1]")
    public WebElement industriesDropdown;

    @FindBy(xpath = "(//ul[@class='sub-menu'])[2]/li")
    public List<WebElement> industriesContent;

    @FindBy(xpath = "((//ul[@class='sub-menu'])[2]/li)[6]")
    public WebElement logisticsLink;


}