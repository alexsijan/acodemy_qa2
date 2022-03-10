
/**
 * Adding and removing a valid discount coupon (QA2RUSWI21-21)
 */

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page_object.CartPage;
import page_object.HomePage;
import page_object.ProductPage;
import utils.LocalDriverManager;
import utils.PropertiesReader;

import static constants.GlobalConstants.Products.BELT;
import static constants.Messages.coupon_is_applied;
import static constants.Messages.coupon_removed;

@Slf4j

public class AddAndRemoveCouponTest {

    WebDriver driver = LocalDriverManager.getInstance();

    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @BeforeEach

    public void init() {

        log.info("(Pre-Conditions) The user open webpage: 'Online shop - acodemy'");
        driver.get(PropertiesReader.getProperties().getProperty("home.page"));
    }

    @Test

    public void applyCouponTest() {

        log.info("Step 1: The user selects product: 'Belt'");
        homePage.clickOnProduct(BELT);

        log.info("Step 2: The user clicks to 'Add to cart' button and adds product to cart");
        productPage.addProductToCart1();

        log.info("Step 3: The user clicks to 'View cart' and go to the cart page");
        productPage.goToCartPage();

        log.info("Step 4: The user enters a valid discount coupon: 'easy_discount'");
        cartPage.addCoupon("easy_discount");

        log.info("Step 5: The user clicks to 'Apply coupon' button and checking the message about the successful addition of the coupon ");
        cartPage.applyCoupon();
        cartPage.checkCouponSuccessfullyMessage(coupon_is_applied);

        log.info("Step 6: The user enters a valid discount coupon: 'additional_discount'");
        cartPage.addCoupon("additional_discount");

        log.info("Step 7: The user clicks to 'Apply coupon' button and checking the message about the successful addition of the coupon");
        cartPage.applyCoupon();
        cartPage.checkCouponSuccessfullyMessage(coupon_is_applied);

        log.info("Step 8: The user deletes the coupon 'easy_discount' and checking the coupon deletion message");
        cartPage.clickRemoveCouponEasyDiscount();
        cartPage.checkCouponDeletionMessage(coupon_removed);

        log.info("Step 9: The user deletes the coupon 'additional_discount' and checking the coupon deletion message");
        cartPage.clickRemoveCouponAdditionalDiscount();
        cartPage.checkCouponDeletionMessage(coupon_removed);
    }

    @AfterEach

    public void quitDriver() {
        LocalDriverManager.closeDriver();
    }

}
