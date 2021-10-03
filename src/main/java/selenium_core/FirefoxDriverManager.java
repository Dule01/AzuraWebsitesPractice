package selenium_core;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends selenium_core.DriverManager {
    @Override
    public void createWebDriver() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
}
