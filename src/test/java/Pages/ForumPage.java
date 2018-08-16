package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForumPage {
    //TODO prepare Viewing and searching through forum
    public ForumPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    private WebDriver driver;
    public String getCurrentUrl() { return driver.getCurrentUrl();}

//RODO Accept
    @FindBy(xpath = "//*[@id=\"_evidon-accept-button\"]")
    WebElement rodoAccept;
    public WebElement getRodoAccept() {
        return rodoAccept;
    }

    //Button to Log-in on FORUM PAGE
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div[2]/ul/li[2]/a")
    WebElement loginButtonForum;
    public WebElement getLoginButtonForum() {
        return loginButtonForum;
    }
//Username on Login-page
    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement userName;
    public WebElement getUserNameLogin(){
        return userName;
    }
//Password on Login-page
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement passwordUsers;
    public WebElement passwordUsers() {
        return passwordUsers;
    }
//Login button
    @FindBy(xpath = "/html/body/div/div/div[2]/form/div/input")
    WebElement submitLogin;
    public WebElement getSubmitLogin() {
        return submitLogin;
    }
}

