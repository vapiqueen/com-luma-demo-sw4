package com.luma.demo.pages;

import com.luma.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By womenMenu = By.xpath("//span[contains(text(),'Women')]");
    By womenTops =By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");

    By womenJackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    By menMenu =By.xpath("//span[normalize-space()='Men']");

    By menBottoms =By.xpath("//a[@id='ui-id-18']");

    By menPants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    By gearMenu = By.xpath("//span[contains(text(),'Gear')]");

    By bags = By.xpath("//span[normalize-space()='Bags']");

    public void hoverOnGearMenu() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(bags);
    }

    public void mouseHoverToWomenMenu() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverToWomenTops() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(womenTops);
;
    }

    public void clickOnJackets() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(womenJackets);
    }

    public void mouseHoverToMenMenu() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverToMenBottom() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(menBottoms);
    }

    public void clickOnPants() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(menPants);
    }
}
