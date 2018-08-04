package Tests;

import Pages.HomePage;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import util.ChromeDrvPathHelper;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class firstTestArscomFFDriver {
    private WebDriver driver;
    private HomePage homePage;
    @BeforeClass
    public static void ustawSciezkeDoIEDrivera() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\kpodlaski\\IdeaProjects\\Arscomtest\\src\\test\\java\\resources\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
            }
    @Before
    public void setup() {
        this.driver = new FirefoxDriver();
        homePage = new HomePage(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void CloseBrowser() {
        this.driver.quit();
    }
//Those tests are done on https://arstechnica.com/ and HomePage
//
    @Test
    public void givenThatArsTechnicaComOpens() {
        driver.get("https://www.arstechnica.com/");
    }
    @Test
    public void givenThatCookiesAlertIsDisplayed() {
        driver.get("https://www.arstechnica.com/");
        homePage.getAcceptButton().click();
    }
    @Test
    public void givenThatMainHomepageLogoExist() {
        driver.get("https://www.arstechnica.com/");
        driver.manage().window().maximize();
        homePage.getMainLogo();
        assertThat(homePage.getMainLogo().isDisplayed());
        assertThat(homePage.getBizAndItLink().isDisplayed());
        homePage.getMainLogo().click();
        homePage.getBizAndItLink().click();
        try {
           Thread.sleep(2750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String nameHeader = this.driver.findElement(By.xpath("/html/body/div[2]/div/h2/span[1]")).getText();
        Assert.assertEquals(nameHeader, "BIZ & IT");

    }

    @Test
    public void givenThatIneedToNavigatetoForums () {
        driver.get("https://www.arstechnica.com/");
        driver.manage().window().maximize();
        homePage.getForumLink().click();
        try {
            Thread.sleep(2150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//TODO-skopana asercja
//        String nameForums = this.driver.findElement(By.id("content").toString().compareTo(content''));
//        Assert.assertEquals(nameForums, "Forum");
    }
    @Test
    public void givenThatIneedToNavigatetoTechnology () {
        driver.get("https://www.arstechnica.com/");
        driver.manage().window().maximize();
        homePage.getTechLink().click();
        try {
            Thread.sleep(2750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void givenThatIneedToNavigatetoScience () {
        driver.get("https://www.arstechnica.com/");
        driver.manage().window().maximize();
        homePage.getSienceLink().click();
        try {
            Thread.sleep(2750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void givenThatIneedToNavigatetoPolicy () {
        driver.get("https://www.arstechnica.com/");
        driver.manage().window().maximize();
        homePage.getPolicyLink().click();
        try {
            Thread.sleep(2750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void givenThatIneedToNavigatetoCars () {
        driver.get("https://www.arstechnica.com/");
        driver.manage().window().maximize();
        homePage.getCarsLink().click();
        try {
            Thread.sleep(2750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void givenThatIneedToNavigatetoGamingAndCulture () {
        driver.get("https://www.arstechnica.com/");
        driver.manage().window().maximize();
        homePage.getGamingCultureLink().click();
        try {
            Thread.sleep(2750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void givenThatIneedToNavigatetoHamburgerMenu () {
        driver.get("https://www.arstechnica.com/");
        driver.manage().window().maximize();
        homePage.getHamburgerMenu().click();
        try {
            Thread.sleep(2750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

}

