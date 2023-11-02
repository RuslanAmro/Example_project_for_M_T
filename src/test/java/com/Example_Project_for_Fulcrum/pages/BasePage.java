package com.Example_Project_for_Fulcrum.pages;

import com.Example_Project_for_Fulcrum.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
