package AmazonTests;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BaseTest {

   public ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    SoftAssert softAssert;

    public WebDriver getDriver(){
        return driver.get();
    }

  @BeforeClass
  @Parameters({"browser"})
    public void setup(String browser){

        switch(browser.toLowerCase()){
            case "google":
                driver.set(new ChromeDriver());
                break;
                default:
                System.out.println("Test can't started on browsers.");
                break;
        }

      getDriver().manage().window().maximize();
      getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      softAssert=new SoftAssert();
  }


  @AfterClass
    public void tearDown(){
        if(driver!=null){
            getDriver().quit();
            softAssert.assertAll("All tests are asserted.");
        }
  }





}