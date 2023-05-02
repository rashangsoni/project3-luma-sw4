package com.lumaproject.testsuite;

import com.lumaproject.pages.HomePage;
import com.lumaproject.pages.MenPage;
import com.lumaproject.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    MenPage menPage = new MenPage();
    HomePage homePage = new HomePage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart()
    {
        homePage.mouseHoverMenMenu();
        homePage.mouseHoverBottom();
        menPage.clickPants();
        menPage.productNameCronusYogaPantCLickOnSize32();
        menPage.productNameCronusYogaPantClickOnColourBlack();
        menPage.CronusYogaPantClickAddToCartButton();
        menPage.verifyTextMessage();
        menPage.shoppingCartLink();
        menPage.verifyShoppingCart();
        menPage.verifyProductNameCronusYogaPant();
        menPage.verifyProductSize32();
        menPage.verifyProductColourBlack();
    }
}

