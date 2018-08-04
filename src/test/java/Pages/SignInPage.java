package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    private  WebDriver driver;
    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getCurrentUrl() { return driver.getCurrentUrl();}

    @FindBy(className = "evidon-banner-acceptbutton")
    WebElement acceptButton;

    public WebElement getAcceptButton() {
        return acceptButton;
    }

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[3]/a")
    WebElement signIN;

    public WebElement getSignIN() {
        return signIN;
    }

    //TODO - xpath to enabled sign-in //*[@id="header-account"]

    @FindBy(id = "username")
    WebElement userName;

    public WebElement getUserName() {
        return userName;
    }

    @FindBy(id = "password")
    WebElement passWd;

    public WebElement getPassWd() {
        return passWd;
    }
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[3]/div/section[2]/form/input[3]")
    WebElement submitButton;

    public WebElement getSubmitButton() {
        return submitButton;
    }
    @FindBy(xpath = "//*[@id=\"header-account\"]/div/section[2]/div/a")
    WebElement signOutButton;

    public WebElement getSignOutButton() {
        return signOutButton;
    }
}
