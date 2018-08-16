package Tests;
import Pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.ChromeDrvPathHelper;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


import static org.junit.Assert.assertTrue;

public class ForumLoginTest {
    private WebDriver driver;
    private ForumPage forumPage;
    private HomePage homePage;

    @BeforeClass
    public static void ustawSciezkeDoDrivera() {
        ChromeDrvPathHelper.setChromeDrvPath();
    }
    private final static Logger LOGGER = Logger.getLogger(ForumLoginTest.class.getName());

    @Before
    public void setup() {
        this.driver = new ChromeDriver();
        forumPage = new ForumPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void CloseBrowser() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.quit();
    }

    @Test
    public void givenThatArsTechnicaComOpens() {
        driver.get("https://arstechnica.com/civis/");
        driver.manage().window().maximize();
        forumPage.getRodoAccept().click();
        forumPage.getLoginButtonForum().click();
        forumPage.getUserNameLogin().sendKeys("Michal37");
        forumPage.passwordUsers().sendKeys("Arstechnica12#");
        forumPage.getSubmitLogin().click();
        boolean me = driver.getPageSource().contains("Michal37");
        assertTrue(me);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

    }
    @Test
    public void givenThatICanScrollArs() {
        driver.get("https://arstechnica.com/");
        LOGGER.info("Starting application");
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,950)");

        driver.manage().timeouts().implicitlyWait(22,TimeUnit.SECONDS);
        try {
            Thread.sleep(2750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
// SCROLLING TO THE BOTTOM OF BROWSER
        jse.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight, document.body.scrollHeight, document.documentElement.clientHeight));");
        try {
            Thread.sleep(2050);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
