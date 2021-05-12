package BrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Chrome_Browser_Test {


    public static void main(String[] args) {


        // creating variable for url
        String baseurl = "https://www.barclays.co.uk/";

        // use set.Property method.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        // created hte object of webdriver class.
        WebDriver driver = new ChromeDriver();
        // call the manage ,window,maximize methode to maximize the window.
        driver.manage().window().maximize();
        // put the implicitlywait for timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // use the get method
        driver.get(baseurl);

        // get the tittle name with the get method and assign to variable .
        String title = driver.getTitle();
        System.out.println(title);

        // verify the tittle name with the equals method and assign to variable.
        boolean verifytittle = title.equals("Personal banking | Barclays");
        System.out.println(verifytittle);
        // verify the contains "Register" tab
        boolean verifyTittlecontains = title.contains("GET STARTED");
        System.out.println(verifyTittlecontains);
        // get the length
        int length = title.length();
        System.out.println(length);

        // close the browser
        driver.close();


    }


}


