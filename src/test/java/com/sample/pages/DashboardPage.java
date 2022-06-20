package com.sample.pages;

import com.sample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//header[@class='header header-ddp movHeader sticky']//li[@class='has-children']")
    public List<WebElement> allModules = new ArrayList<>();

    @FindBy(xpath = "//header[@class='header header-ddp movHeader sticky']//li//a[.='Insurance products']")
    public WebElement insuranceProductsModule;

    @FindBy(xpath = "//header[@class='header header-ddp movHeader sticky']//li//a[.='Member tools']")
    public WebElement memberToolsModule;

    @FindBy(xpath = "//header[@class='header header-ddp movHeader sticky']//li//a[.='For dentists']")
    public WebElement forDentistsModule;

    @FindBy(xpath = "//header[@class='header header-ddp movHeader sticky']//li//a[.='Employers & brokers']")
    public WebElement employersAndBrokersModule;

    @FindBy(xpath = "//header[@class='header header-ddp movHeader sticky']//li//a[.='Oral health resources']")
    public WebElement oralHealthResourcesModule;

    @FindBy(xpath = "//header//span[.='Sign in / Register ']")
    public WebElement signAndRegisterButton;




}
