package selenium_core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends selenium_core.DriverManager {
    @Override
    public void createWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }
}
