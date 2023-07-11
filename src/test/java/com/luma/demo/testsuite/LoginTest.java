package com.luma.demo.testsuite;

import com.luma.demo.pages.GearPage;
import com.luma.demo.pages.HomePage;
import com.luma.demo.pages.MenPage;
import com.luma.demo.pages.WomenPage;
import com.luma.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage=new HomePage();
    GearPage gearPage=new GearPage();
    MenPage menPage=new MenPage();
    WomenPage womenPage=new WomenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        //* Mouse Hover on Gear Menu
        homePage.hoverOnGearMenu();
        //* Click on Bags
        homePage.clickOnBags();
        //* Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOvernightDuffle();
        //* Verify the text ‘Overnight Duffle’
        Assert.assertEquals(gearPage.getTextOvernightDuffle(),"Overnight Duffle","Error");
        //* Change Qty 3
        gearPage.changeQuantity();
        //* Click on ‘Add to Cart’ Button.
        gearPage.clickOnAddToCartButton();
        //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(gearPage.gettextaddedDuffle(),"You added Overnight Duffle to your shopping cart.","Error");
        //* Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCartLink();
        //* Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(gearPage.gettextCronusYogaPant(),"Overnight Duffle","Error");
        //* Verify the Qty is ‘3’
        Assert.assertEquals(gearPage.getTextQuantity3(),"3","Error");
        //* Verify the product price ‘$135.00’
        Assert.assertEquals(gearPage.getTextProductPrice(),"$135.00","Error");
        //* Change Qty to ‘5’
        gearPage.changeQuantityTo5();
        //* Click on ‘Update Shopping Cart’ button
        gearPage.clickOnUpdateShoppingCartButton();
        Assert.assertEquals(gearPage.getTextProductPrice225(),"$225.00","Error");
    }

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        //1. userShouldAddProductSuccessFullyToShoppinCart()
        //* Mouse Hover on Men Menu
        homePage.mouseHoverToMenMenu();
        //* Mouse Hover on Bottoms
        homePage.mouseHoverToMenBottom();
        //* Click on Pants
        homePage.clickOnPants();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        menPage.hoverAndClickProduct();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        menPage.hoverAndClickProductColour();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        menPage.hoverAndClickOnAddToCartButton();
        //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(menPage.getTextAddedPantToShoppingCart(),"You added Cronus Yoga Pant to your shopping cart.","Error");
        //* Click on ‘shopping cart’ Link into message
        menPage.clickOnShoppingCart();

        //* Verify the text ‘Shopping Cart.’
        Assert.assertEquals(menPage.getTextShoppingCart(),"Shopping Cart","Error");

        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(menPage.getTextCronusYogaPant(),"Cronus Yoga Pant","Error");
        //* Verify the product size ‘32’
        Assert.assertEquals(menPage.getTextSize32(),"32","Error");
        //* Verify the product colour ‘Black’
        Assert.assertEquals(menPage.getTextBlack(),"Black","Error");
    }

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        // Mouse Hover on Women Menu
        homePage.mouseHoverToWomenMenu();
        //* Mouse Hover on Tops
        homePage.mouseHoverToWomenTops();
        //* Click on Jackets
        homePage.clickOnJackets();
        //* Select Sort By filter “Product Name”
        //womenPage.selectSortByFilterProductName();
        //* Verify the products name display in alphabetical order
        womenPage.selectSortByFilterProductName();
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {

        //* Mouse Hover on Women Menu
        homePage.mouseHoverToWomenMenu();
        //* Mouse Hover on Tops
        homePage.mouseHoverToWomenTops();
        //* Click on Jackets
        homePage.clickOnJackets();
        //* Select Sort By filter “Price”
        womenPage.selectSortingFilterByPrice();
        //* Verify the products price display in Low to High
    womenPage.productInDescendingOrder();
    }
}
