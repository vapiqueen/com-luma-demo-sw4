package com.luma.demo.pages;

import com.luma.demo.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    By productName=By.cssSelector(".product-item-link");
    By size32=By.cssSelector("[data-role=\"swatch-option-880\"][data-rendered=\"true\"] .swatch-option.text");
    By colourBlack=By.cssSelector("#option-label-color-93-item-49");
    By addToCartButton=By.cssSelector(".action.tocart.primary");
    By addedPant=By.cssSelector("[data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]");
    By linkShoppingCart=By.cssSelector(".message-success.success.message div a");
    By textShoppingCart=By.cssSelector("main div h1 span");
    By textCronusYogaPant=By.cssSelector("[data-th=\"Item\"] div strong a");
    By textSize32=By.cssSelector(".item-options>dd:first-of-type");
    By textBlack= By.cssSelector(".item-options>dd:last-of-type");

    public void hoverAndClickProduct(){
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(size32);
    }
    public void hoverAndClickProductColour(){
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(colourBlack);
    }
    public void hoverAndClickOnAddToCartButton(){
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(addToCartButton);
    }
    public String getTextAddedPantToShoppingCart(){
        return getTextFromElement(addedPant);
    }
    public void clickOnShoppingCart(){
        clickOnElement(linkShoppingCart);
    }
    public String getTextShoppingCart(){
        return getTextFromElement(textShoppingCart);
    }
    public String getTextCronusYogaPant(){
        return getTextFromElement(textCronusYogaPant);
    }
    public String getTextSize32(){
        return getTextFromElement(textSize32);
    }
    public String getTextBlack(){
        return getTextFromElement(textBlack);
    }



}
