import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import framework.settings.Settings;
import framework.helpers.WaitHelper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import pages.HomePage;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.page;
import static pages.BasePage.openUrl;

public class BaseTest {
    private static Settings settings = new Settings();
    private static String baseUrl = settings.getBaseUrl();

    @BeforeAll
    public static void beforeSuite() {
        Configuration.browser = settings.getBrowser();
        Configuration.baseUrl = settings.getBaseUrl();
        Configuration.startMaximized = true;
        Configuration.screenshots = true;
        Configuration.timeout = 10000;
    }

    @BeforeEach
    void beforeTest() {
        openUrl(baseUrl);
        WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        WaitHelper.waitForPageLoaded();
    }

    @AfterEach
    void afterTest() {
        WebDriverRunner.getWebDriver().quit();
    }

    protected HomePage getHomePage() {
        return page(HomePage.class);
    }
}
