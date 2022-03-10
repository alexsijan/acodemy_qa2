package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LocalDriverManager;
import utils.PropertiesReader;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CartPage {

    private final WebDriver driver = LocalDriverManager.getInstance();

    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(PropertiesReader.getProperties().getProperty("implicit.wait"))));

    private final By couponCodeField = By.id("coupon_code");
    private final By applyCouponButton = By.name("apply_coupon");
    private final By couponAddedSuccessfullyMessage = By.xpath("//div[contains(@class, 'woocommerce-message')]");
    private final By removeCouponEasyDiscount = By.xpath("//a[contains(@href, 'https://shop.acodemy.lv/cart/?remove_coupon=easy_discount')]   ");
    private final By removeCouponAdditionalDiscount = By.xpath("//a[contains(@href, 'https://shop.acodemy.lv/cart/?remove_coupon=additional_discount')]");
    private final By couponDeletionMessage = By.xpath("//div[contains(@class, 'woocommerce-message')]");
    private final By couponInvalidMessage = By.xpath("//ul[contains(@class, 'woocommerce-error')]");


    public void addCoupon(String code) {
        wait.until(ExpectedConditions.presenceOfElementLocated(couponCodeField));
        wait.until(ExpectedConditions.visibilityOfElementLocated(couponCodeField));

        driver.findElement(couponCodeField).sendKeys(code);
    }

    public void applyCoupon() {
        driver.findElement(applyCouponButton).click();
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//form[contains(@class,'processing')]"))));
    }

    public void checkCouponSuccessfullyMessage(String message) {
        wait.until(ExpectedConditions.presenceOfElementLocated(couponAddedSuccessfullyMessage));
        assertThat(driver.findElement(couponAddedSuccessfullyMessage).getText(), equalTo(message));
    }

    public void clickRemoveCouponEasyDiscount() {
        wait.until(ExpectedConditions.presenceOfElementLocated(removeCouponEasyDiscount));
        driver.findElement(removeCouponEasyDiscount).click();
    }

    public void clickRemoveCouponAdditionalDiscount() {
        wait.until(ExpectedConditions.presenceOfElementLocated(removeCouponAdditionalDiscount));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(removeCouponAdditionalDiscount)));
        driver.findElement(removeCouponAdditionalDiscount).click();
    }

    public void checkCouponDeletionMessage(String message) {
        wait.until(ExpectedConditions.presenceOfElementLocated(couponDeletionMessage));
        wait.until(ExpectedConditions.textToBe(couponDeletionMessage, message));
        assertThat(driver.findElement(couponDeletionMessage).getText(), equalTo(message));
    }

    public void checkCouponInvalidMessage(String message) {
        wait.until(ExpectedConditions.presenceOfElementLocated(couponInvalidMessage));
        wait.until(ExpectedConditions.textToBe(couponInvalidMessage, message));
        assertThat(driver.findElement(couponInvalidMessage).getText(), equalTo(message));
    }

}
