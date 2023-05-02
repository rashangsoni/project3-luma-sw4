package com.lumaproject.browserfactory;

import com.lumaproject.propertyreader.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class ManageBrowser {
    public static WebDriver driver;
    static String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");

    public void selectBrowser(String browser)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox"))
        {
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Wrong Browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(baseUrl);
    }

    public void closeBrowser()
    {
        if(driver!=null) {
            driver.quit();
        }
    }

}
