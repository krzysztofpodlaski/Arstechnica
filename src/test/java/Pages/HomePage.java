package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    //TODO - main page object, just opening the main page

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private WebDriver driver;
    public String getCurrentUrl() { return driver.getCurrentUrl();}

    @FindBy(className = "evidon-banner-acceptbutton")
    WebElement acceptButton;
    @FindBy(xpath= "//*[@id=\"header-logo\"]")
    WebElement headerLOGO;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/nav/ul/li[1]/a")
    WebElement bizAndItLink;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/nav/ul/li[7]/a")
    WebElement forumLink;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/nav/ul/li[2]/a")
    WebElement techLink;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/nav/ul/li[3]/a")
    WebElement sienceLink;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/nav/ul/li[4]/a")
    WebElement policyLink;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/nav/ul/li[5]/a")
    WebElement carsLink;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/nav/ul/li[6]/a")
    WebElement gamingCultureLink;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[2]/a")
    WebElement hamburgerMenu;

    public WebElement getAcceptButton() {
        return acceptButton;
    }
    public WebElement getMainLogo() {
        return headerLOGO;
    }
    public WebElement getBizAndItLink() {
        return bizAndItLink;
    }
    public WebElement getForumLink() {
        return forumLink;
    }
    public WebElement getTechLink() {
        return techLink;
    }
    public WebElement getSienceLink() {
        return sienceLink;
    }

    public WebElement getPolicyLink() {
        return policyLink;
    }

    public WebElement getCarsLink() {
        return carsLink;
    }

    public WebElement getGamingCultureLink() {
        return gamingCultureLink;
    }

    public WebElement getHamburgerMenu() {
        return hamburgerMenu;
    }
}
