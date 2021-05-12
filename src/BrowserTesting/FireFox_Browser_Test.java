package BrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFox_Browser_Test {
    public static void main(String[] args) {
        // variable for base url
        String baseurl = "https://www.barclays.co.uk/";
        // create a System.setproperty method
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        // create the object
        WebDriver driver = new FirefoxDriver();
        // use driver.manage().window().maximize(); for maximize the window
        driver.manage().window().maximize();
        // for timeout use   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); methode.
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        // use get methode for url
        driver.get(baseurl);
        //get the tittle name by creating tittle variable and driver.getTitle() method.
        String tittle = driver.getTitle();
        System.out.println(tittle);
        // verify the tittle name by creating variable and assign to tittle.equals("nop commerce") method;
        boolean verify = tittle.equals("Personal banking | Barclays");
        System.out.println(verify);
        // verify the  any specific contains
        boolean verifyContains = tittle.contains("Get Register");
        // get the tittle length
        int length = tittle.length();
        System.out.println(length);
        // close the browser using .close method
        driver.close();




    }

}

