import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public abstract class BasePage {
    static WebDriver driver = new ChromeDriver();

    BasePage() {
        driver.manage().timeouts().implicitlyWait(60, SECONDS);
        driver.manage().window().maximize();
    }
}
