package BrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;


public class Multi_Browser_Test {
    static String browser = "ie";
    static String baseurl = "https://www.barclays.co.uk/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(baseurl);
            String tittle = driver.getTitle();
            System.out.println(tittle);
            boolean verifytittle = tittle.equals("Personal banking | Barclays");
            System.out.println(verifytittle);
            boolean verifytittleContains = tittle.contains("Get Register");
            int length = tittle.length();
            System.out.println(length);
            driver.close();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(baseurl);
            String tittle = driver.getTitle();
            System.out.println(tittle);
            boolean verifytittle = tittle.equals("Personal banking | Barclays");
            System.out.println(verifytittle);
            boolean verifytittleContains = tittle.contains("Get Register");
            System.out.println(verifytittleContains);
            int lenght = tittle.length();
            System.out.println(lenght);
            driver.close();

        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(baseurl);
            String tittle = driver.getTitle();
            System.out.println(tittle);
            boolean verifytittle = tittle.equals("Personal banking | Barclays");
            System.out.println(verifytittle);
            boolean verifytittlesContains = tittle.contains("Get Register");
            System.out.println(verifytittlesContains);
            int length = tittle.length();
            System.out.println(length);
            driver.close();
        } else {
            System.out.println("Wrong browser name");
        }


    }
}

