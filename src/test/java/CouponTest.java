import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CouponTest {

    WebDriver driver;

    @BeforeEach
    public void initDriver() {
        driver = new ChromeDriver();
    }

@Test
    public void applyCouponCode() {
        driver.get("https://shop.acodemy.lv");
 //       driver.getTitle();
 //   System.out.println(driver.getTitle());
    assertEquals("Online shop – acodemy – Just another WordPress site", driver.getTitle());
//   assertThat(driver.getTitle(), containsString("nline shop"));
    }

    @AfterEach
    public void closePage() {
        driver.quit();
    }
}
