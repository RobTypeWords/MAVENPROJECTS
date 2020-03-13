import Common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticePage extends CommonAPI {
    /*Do I Need to create a Separate Tet Case Page in order to test this section??*/


    //Webelements Here
    @FindBy(id = "input[id=\"bmwradio\"]")
    WebElement BMWRadioBtn;
    @FindBy(id = "input[id=\"benzradio\"]")
    WebElement BenzRadioBtn;
    @FindBy(id = "hondaradio")
    WebElement HondaRadioBtn;

    @FindBy(id = "input[id=\"bmwcheck\"]")
    WebElement BmwCheckBx;
    @FindBy(id = "input[id=\"benzcheck\"]")
    WebElement BenzCheckBx;
    @FindBy(id = "input[id=\"hondacheck\"]")
    WebElement HondaCheckBx;

    @FindBy(xpath = "//button[text()=\"Open Window\"]")
    WebElement OpenWindowBtn;
    @FindBy(xpath = "//a[text()=\"Open Tab\"]")
    WebElement OpenNewTabBtn;

    @FindBy(name = "input[name=\"enter-name\"]")
    WebElement EnterNameBx;
    @FindBy(id = "input[id=\\\"alertbtn\\\"]\"]")
    WebElement AlertBtn;
    @FindBy(id = "input[id=\"confirmbtn\"]")
    WebElement ConfirmBtn;



    // Methods here
    public void InvokePracticePage() {
        Driver.get("https://learn.letskodeit.com/p/practice"); //Another URL destination
        // Optional to implement This. keyword here
    }
}
