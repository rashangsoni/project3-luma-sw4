package com.lumaproject.pages;

import com.lumaproject.utilities.Utilities;
import org.openqa.selenium.By;

public class WomenPage extends Utilities { // Click on Jackets
    By clickOnJacket = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    public void clickOnJackets()
    {
        clickOnElement(clickOnJacket);
        // waitUntilVisibilityOfElementClickable(clickOnJacket,10);
    }
}