package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    //Methods for common API's set here
    //Was unable to get annotations
    // All of a sudden webdriver and chromedirver iis not regonized. I wonder if this has to do with <Depenedecy managemnt>
        // A: I added Depenecy management this cause this weird error, but ever since I removed it it statred working again

    public static WebDriver Driver = null;   //Driver placed here as Static(?) and outside of annotation(?) and null(?)
    //Whats the purpose of this being here?! Why not just withing @BeforeMethod
    //Maybe to avoid default set up. How should I view this?



    @BeforeMethod
    // @Paramteres {()}Other annotations placed here for XML file of Data driven framework
                            // The name of the parameters goes into here with a data type of course
    public void invokeBrowser() {
          System.setProperty("\"webdriver.chrome.driver", "C:\\Users\\rober\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\3.141.59\\selenium-chrome-driver.exe");

        Driver = new ChromeDriver();
        Driver.manage().window().fullscreen();
        Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                                                    // Driver.get(URL) <- For data driven framework design
    } // (Optional) To add driver instantiation and management together.Design choice!
                // What about driver.get()?Mostly for Data Driven Framework Desgin


    // missing Helper methods
    // missing Helper methods
    // missing Helper methods
    // missing Helper methods
    // missing Helper methods


    @AfterMethod
    public void close() {
        Driver.close();
    }

}
