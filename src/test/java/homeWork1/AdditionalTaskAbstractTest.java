package homeWork1;

import com.codeborne.selenide.WebDriverRunner;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;

public abstract class AdditionalTaskAbstractTest {

    @BeforeAll
    static void init() {
        open("https://www.globalsqa.com/demo-site/draganddrop/");
    }

    @AfterAll
    static void finish() {
        WebDriverRunner.closeWebDriver();
    }
}
