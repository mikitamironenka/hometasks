import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;


public class WebDriverSyncDemoFluent {

    public static void main(String[] args) throws InterruptedException {

        //no remote webdriver run during this demo
        WebDriver driver = new ChromeDriver();

        driver.get("http://seleniumhq.org");
        //risky point here

        new WebDriverWait(driver, 10).until(CustomCondition.jQueryAJAXsCompleted());



//        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("q")));

            //WebElement searchInput = driver.findElement(By.id("q"));
        WebElement searchInput = waitForElementLocatedBy(driver, By.id("q"));
        searchInput.sendKeys("selenium java");

        List<WebElement> serchBtn = driver.findElements(By.xpath("//*[@value='Go']"));
        serchBtn.get(0).click();
        //risky point here
        

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Timeout for waiting search result list was exceeded!");


        List<WebElement> searchResults = wait.until(new Function<WebDriver, List<WebElement>>() {
            @Override
            public List<WebElement> apply(WebDriver webDriver) {
                return driver.findElements(By.xpath("//div[contains(@class,'gsc-webResult' and contains(.,'selenium') and contains(.,'java'])"));
            }
        });


        System.out.println("Search results number for requested term: " + searchResults.size());
        driver.quit();
    }

    private static WebElement waitForElementLocatedBy(WebDriver driver, By by) {
        return new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
