package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlazePage {
    public DemoBlazePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//a[.='Laptops']" )
    public WebElement laptops;

    @FindBy(linkText = "Dell i7 8gb")
    public WebElement dell;

    @FindBy(linkText = "Add to cart")
    public WebElement addCartBtn;

    @FindBy(xpath = "//a[.=' PRODUCT STORE']")
    public WebElement productStore;

    @FindBy(linkText = "Phones")
    public WebElement phones;

    @FindBy(linkText = "Sony xperia z5")
    public WebElement sonyXperia;

    @FindBy(linkText = "Monitors")
    public WebElement monitors;

    @FindBy(linkText = "ASUS Full HD")
    public WebElement asusMonitor;

    @FindBy(linkText = "Cart")
    public WebElement cartBtn;

    @FindBy (xpath = "//tbody[@id='tbodyid']/tr/td[.='Apple monitor 24']/following-sibling::td/a")
    public WebElement deleteBtn;

    @FindBy(xpath = "//button[.='Place Order']")
    public WebElement placeOrderBtn;

    @FindBy(css = "#name")
    public WebElement name;

    @FindBy(css = "#country")
    public WebElement country;

    @FindBy(css = "#city")
    public WebElement city;

    @FindBy(css = "#card")
    public WebElement card;

    @FindBy(css = "#month")
    public WebElement month;

    @FindBy(css = "#year")
    public WebElement year;

    @FindBy(xpath = "//button[.='Purchase']")
    public WebElement purchaseBtn;

    @FindBy(xpath = "//p[@class='lead text-muted ']")
    public WebElement confirmationText;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement okBtn;

    @FindBy(css = "#tbodyid")
    public WebElement emptyCart;
}
