package com.lumaproject.testbase;

import com.lumaproject.propertyreader.PropertyReader;
import com.lumaproject.utilities.Utilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utilities {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setup()
    {
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown()
    {
        //  closeBrowser();
    }
}
