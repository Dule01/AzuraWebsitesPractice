package selenium_core;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends selenium_core.DriverManager {
    @Override
    public void createWebDriver() {
        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        //driver.manage().window().maximize();
    }
}
