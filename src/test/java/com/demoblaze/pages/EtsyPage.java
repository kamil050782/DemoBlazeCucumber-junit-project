package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyPage {

    public EtsyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "#global-enhancements-search-query")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@value='Search']")
    public WebElement searchBtn;
}
