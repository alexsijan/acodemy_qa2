package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LocalDriverManager;
import utils.PropertiesReader;

import java.time.Duration;

public class ProductPage {


    private final WebDriver driver = LocalDriverManager.getInstance();

    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(PropertiesReader.getProperties().getProperty("implicit.wait"))));

    private final By colorSelection = By.id("pa_color");
    private final By logoSelection = By.id("logo");
    private final By addToCartButton = By.xpath("//button[contains(@class, 'single_add_to_cart_button button alt')]");
    private final By clickToViewCartButton = By.xpath("//div[contains(@class, 'woocommerce-message')]//a[text()='View cart']");
    private final By clear = By.className("reset_variations");

    public void selectColor(String color) {
        wait.until(ExpectedConditions.presenceOfElementLocated(colorSelection));
        wait.until(ExpectedConditions.visibilityOfElementLocated((colorSelection)));
        Select colorSelect = new Select(driver.findElement(colorSelection));
        colorSelect.selectByVisibleText(color);
    }

    public void selectLogo(boolean isLogo) {
        Select lSelect = new Select(driver.findElement(logoSelection));
        if (isLogo) {
            lSelect.selectByVisibleText("Yes");
        } else {
            lSelect.selectByVisibleText("No");
        }
    }

    public void addProductToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).submit();
    }

    public void addProductToCart1() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();
    }

    public void goToCartPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickToViewCartButton));
        driver.findElement(clickToViewCartButton).click();
    }

    public void clickOnClearButton() {
        driver.findElement(clear).click();
    }
}
