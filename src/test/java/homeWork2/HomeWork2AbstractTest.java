package homeWork2;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;

public class HomeWork2AbstractTest {
      @BeforeEach
    void init() {
          open("https://test-stand.gb.ru/login");
    }

    @AfterEach
    void finish() {
        WebDriverRunner.closeWebDriver();
    }
}
