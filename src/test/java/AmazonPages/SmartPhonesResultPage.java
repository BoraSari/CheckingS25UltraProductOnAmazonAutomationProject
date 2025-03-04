package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartPhonesResultPage extends BasePage{
    JavascriptExecutor js;

    private By samsungS25UltraLocator = By.xpath("//img[@alt='SAMSUNG Galaxy S25 Ultra Cell Phone + $200 Amazon Gift Card, 256GB AI Smartphone, Unlocked Android, 200MP AI Camera, S Pen,…']");

    public SmartPhonesResultPage(WebDriver driver){
        super(driver);
    }


    public void  scrollDownPage(){
        js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,500)");
    }


    public void clickProduct(){
      WebElement s25Ultra = driver.findElement(samsungS25UltraLocator);
      js.executeScript("arguments[0].click();",s25Ultra);
    }
}
