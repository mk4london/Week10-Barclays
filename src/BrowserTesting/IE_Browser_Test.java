package BrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IE_Browser_Test {

    public static void main(String[] args) {
        String baseurl = "https://www.barclays.co.uk/"; // create a variable for URL

        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe"); //  // create a System.setproperty method
        WebDriver driver = new InternetExplorerDriver(); // create Object
        // use driver.manage().window().maximize(); for maximize the window
        driver.manage().window().maximize();
        // for timeout use   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); methode.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);  // use get methode for url
        String tittle = driver.getTitle(); //get the tittle name by creating tittle variable and driver.getTitle() method.
        System.out.println(tittle);
        // verify the tittle name by creating variable and assign to tittle.equals("nop commerce") method;
        boolean verify = tittle.equals("Personal banking | Barclays");
        System.out.println(verify);
        boolean verifyContains = tittle.contains("Login");  // verify the  any specific contains
        System.out.println(verifyContains);
        int length = tittle.length();  // get the tittle length
        driver.close(); // close the browser


    }
}

