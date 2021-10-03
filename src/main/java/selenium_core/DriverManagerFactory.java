package selenium_core;

public class DriverManagerFactory {

    public static selenium_core.DriverManager getDriverManager(String browser){
        selenium_core.DriverManager driverManager;
        switch (browser){
            case "CHROME":{
                driverManager = new selenium_core.ChromeDriverManager();
            }break;
            case "FIREFOX":{
                driverManager = new selenium_core.FirefoxDriverManager();
            }break;
            case "EDGE":{
                driverManager = new selenium_core.EdgeDriverManager();
            }break;
            default:
                driverManager = new selenium_core.ChromeDriverManager();
        }
        return driverManager;
    }
}
