import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    public WebDriver driver = new ChromeDriver();

    @Test
    public void goToGoogle() {
        driver.get("http://google.com");
    }
}
