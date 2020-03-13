import Common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookHome extends CommonAPI {

    // All of a sudden the Findby annoations dont work?? A: Because I removed Dependecy managemnt tag

    //WebElement Variables placed here


    @FindBy(id = "email")     // What is the Synatx?? ->No semicolon here!
            WebElement emailField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(css = "input[value= 'Log In']")
    WebElement LogInbtnn;

    //Used for Negative Test
    @FindBy(xpath = "//div[text()=\"The email you’ve entered doesn’t match any account. \"]")
    WebElement LogInError;


    //Methods HERE!!!
    public void invokeBrowser() {
        Driver.get("https://www.facebook.com/"); // They also used This. Keyword here
    }
    //Do I need this?


    public void LogInFB(String Email, String Password) {
        this.invokeBrowser(); //You need to specify the URL you want to go to!
        emailField.sendKeys(Email);
        passwordField.sendKeys(Password);
        LogInbtnn.click();

    }

    public void InvalidInfo() {
        //What do I place here???
    }

}
