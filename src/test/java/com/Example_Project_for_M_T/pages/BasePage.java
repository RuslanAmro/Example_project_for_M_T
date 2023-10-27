package com.Example_Project_for_M_T.pages;

import com.Example_Project_for_M_T.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
