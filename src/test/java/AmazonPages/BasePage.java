package AmazonPages;

import org.openqa.selenium.WebDriver;

public class BasePage {


    protected WebDriver driver;

    protected String baseUrl= "https://www.amazon.com/";

    public BasePage(WebDriver driver){
        this.driver=driver;
    }

    public void navigateAmazonMainPage(){
        driver.get(baseUrl);
    }

    public String getAmazonTitle(){
        return driver.getTitle();
    }

    public String getAmazonPAgeSources(){
        return driver.getPageSource();
    }




}


