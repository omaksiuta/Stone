import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by igor on 01.10.2015.
 */
public class SeleniumTest
{
    @Test
    public void firefox(){
        String test = "test";
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(test);
        element.submit();
        WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
        Assert.assertEquals(test + " - Пошук Google", driver.getTitle());
        driver.quit();
    }
}
