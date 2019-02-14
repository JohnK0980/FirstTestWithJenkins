import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    public WebDriver driver = new ChromeDriver();

    @Test
    public void goToGoogle() {
        driver.get("http://google.com");

        //Intentionally fail to see if Jenkins shows this test fails
        WebElement firstElement = driver.findElement(By.id("hahaha Testing"));
        firstElement.click();
    }
}
