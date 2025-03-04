package AmazonPages;

import AmazonTests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonMainPage extends BasePage {

    private By cellPhonesPageLocator = By.xpath("//a[@href=\"/cell-phones-service-plans-accessories/b/?ie=UTF8&node=2335752011&ref_=nav_cs_wireless\"]");

    public AmazonMainPage(WebDriver driver){
        super(driver);
    }


    public void navigateCellPhonesPage(){
        driver.findElement(cellPhonesPageLocator).click();
    }
}
