package com.luma.demo.pages;

import com.luma.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {
    By sortingFilterByProductName = By.id("sorter");

    By sortingFilterPrice = By.xpath("//strong[@class='product name product-item-name']//a");

    By productDescendingOrder = By.xpath("//div[@class='column main']//div[2]//div[3]//a[1]");

    By ProductSize = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");

    By updatedPrice = By.cssSelector("span[data-price-type='finalPrice']");

    public void selectSortByFilterProductName() throws InterruptedException {
        Thread.sleep(1000);
        selectByValueFromDropDown(sortingFilterByProductName, "name");
    }

    public void selectSortingFilterByPrice() throws InterruptedException {
        Thread.sleep(1000);
        selectByValueFromDropDown(sortingFilterPrice, "price");
    }

    public List<String> productInDescendingOrder() throws InterruptedException {
        List<WebElement> beforeSortingValue = driver.findElements(productDescendingOrder);
        List<String> beforeSortDesktopValue = new ArrayList<>();
        for (WebElement value : beforeSortingValue) {
            beforeSortDesktopValue.add(value.getText());
        }
        selectByVisibleTextFromDropDown(By.xpath("//div[@class='column main']//div[2]//div[3]//a[1]"), "price: low to high");
        Thread.sleep(2000);
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"), 5);
        // After sorting value
        List<WebElement> afterSortValue = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> afterSortDesktopValue = new ArrayList<>();
        for (WebElement value1 : afterSortValue) {
            afterSortDesktopValue.add(value1.getText());
        }
        Collections.sort(beforeSortDesktopValue);// Ascending order
        Collections.reverse(beforeSortDesktopValue);// Descending

        return afterSortDesktopValue;

        // public void selectProductSize(){
        //  selectByValueFromDropDown(ProductSize,"size");

        // }
        //public void UpdatePrice()throws InterruptedException{
        // Thread.sleep(1000);
        //clickOnElement(updatedPrice);
        // }


    }
}
