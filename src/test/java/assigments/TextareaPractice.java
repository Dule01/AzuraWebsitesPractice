package assigments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextareaPractice extends CommonMethods{

    WebDriver driver;

    public TextareaPractice(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#name")
    WebElement nameArea;

    public void enterName(String name){
        typeText(nameArea, name);
    }

    @FindBy(css = "#phone")
    WebElement phoneArea;

    public void enterPhone(String phone){
        typeText(phoneArea, phone);
    }

    @FindBy(css = "#email")
    WebElement emailArea;

    public void enterEmail(String email){
        typeText(emailArea, email);
    }

    @FindBy(css = "#password")
    WebElement passwordArea;

    public void enterPassword(String password){
        typeText(passwordArea, password);
    }

    @FindBy(css = "#address")
    WebElement addressArea;

    public void enterAddress(String address){
        typeText(addressArea, address);
    }

    @FindBy(css = "[name=\"submit\"]")
    WebElement submitButton;

    public void clickSubmit(){
        clickElement(submitButton);
    }

}
