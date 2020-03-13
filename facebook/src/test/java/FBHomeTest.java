import Common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FBHomeTest extends CommonAPI {

    //Negative Test Cases
    //@Test
    //public void FBInvokeTest(){ // Do I need this?

    //}

    //@Test //Negative Test case. Users cant pass if invalid info
    //public void LoginBtnnTest(){
        //.....
        ///....

    //} // Would I need to invoke the driver.get() again? // How would I back out?

    //Negative Test Cases
    @Test
    public void TestUserCannotLogIn(){
       FacebookHome homepage = PageFactory.initElements(Driver, FacebookHome.class);
       homepage.LogInFB("robblablla", "password1234");
       boolean errorMessage = homepage.LogInError.isDisplayed(); // isDiplayed returns true if these is a message beign displayed
        //This is the actual

        Assert.assertEquals(errorMessage,true);
        // Isnt it EA. NOPE it AE
    }
}
