package Practice;

import Common.CommonAPI;
import drivers.Drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class PracticePage extends CommonAPI  {

    //Webelements will be defined here!!!

    //Methods Here
    public void NavighateToPage(){
        Driver.get("https://learn.letskodeit.com/p/practice"); //Do I need this here?
    }

    // Why isnt driver popping up?
    // A: Because this isnt main -> You need to create a methods first
    // How do I set the Chrome Driver path for Maven? Do I need to do that?


}
