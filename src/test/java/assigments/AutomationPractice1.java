package assigments;

import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationPractice1 extends BaseTest{

    String url = "https://itera-qa.azurewebsites.net/home/automation";


    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser){
        init(browser, 30);
    }


    @Test(description = "Navigate to URL", priority = 1)
    @Description("Verify that the user can navigate to the website")
    public void navigateToURL(){
       driver.get(url);
    }

    @Test(description = "Enter the data", priority = 2)
    @Description("Make sure that all of the data can be correctly entered")
    public void enterData(){
        TextareaPractice tp = new TextareaPractice(driver);
        navigateToURL();
        tp.enterName("Dusan");
        tp.enterPhone("060123456789");
        tp.enterEmail("test@email.com");
        tp.enterPassword("123456");
    }

    @Test(description = "Submit the data", priority = 3)
    @Description("Make sure that the user is able to submit the data by clicking the 'SUBMIT' button")
    public void submit(){
        TextareaPractice tp = new TextareaPractice(driver);
        navigateToURL();
        enterData();
        tp.clickSubmit();
    }

    @AfterMethod
    public void tearDown(){
        quitBrowser();
    }

}
