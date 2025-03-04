package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v131.page.model.Screenshot;

public class S25UltraDetailPage extends BasePage{

     private By productNotFoundPage = By.cssSelector("img[alt=\"Sorry! We couldn't find that page. Try searching or go to Amazon's home page.\"]");

    public S25UltraDetailPage(WebDriver driver) {
        super(driver);
    }


    public String getProductNotFoundErrorMessage(){
        String errorMessage = driver.findElement(productNotFoundPage).getAttribute("alt");
        return errorMessage;
    }

    public WebElement displayProductNotFoundMessage(){
        WebElement errorImg = driver.findElement(productNotFoundPage);
        return errorImg;
    }


}
