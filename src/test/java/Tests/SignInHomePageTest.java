package Tests;
import Pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.ChromeDrvPathHelper;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SignInHomePageTest {
    private WebDriver driver;
    private SignInPage signInPage;
    @BeforeClass
    public static void ustawSciezkeDoDrivera() {
        ChromeDrvPathHelper.setChromeDrvPath();
    }
    @Before
    public void setup() {
        this.driver = new ChromeDriver();
        signInPage = new SignInPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void CloseBrowser() {
        //this.driver.quit();
    }
    @Test
    public void givenThatSignInisNotActive() {
        driver.get("https://www.arstechnica.com/");
        driver.manage().window().maximize();
        signInPage.getAcceptButton().click();
        signInPage.getSignIN().click();
        signInPage.getUserName().sendKeys("Michal37");
        signInPage.getPassWd().sendKeys("Arstechnica12#");
        signInPage.getSubmitButton().click();
        signInPage.getSignIN().click();
        //Assertion if mine user is logged in.
        boolean me = driver.getPageSource().contains("Michal37");
        assertTrue(me);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        signInPage.getSignOutButton().click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.quit();
    }

}
