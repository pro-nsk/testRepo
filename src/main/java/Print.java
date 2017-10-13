import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by motors on 01.09.2017.
 */
public class Print {

    @Test
    public void test () {
        System.out.println(8);
        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.navigate().to("http://ya.ru");
    }
}
