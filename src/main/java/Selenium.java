import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by motors on 01.09.2017.
 */
public class Selenium {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        driver.manage().timeouts().implicitlyWait(60, SECONDS);
        driver.manage().window().maximize();

        driver.get("https://passport.yandex.ru");

        login("alexanderk@adjuggler.ru", "pass");

        driver.findElement(By.xpath("//a[text()=\"Почта\"]")).click();

        driver.findElement(By
                .xpath("//span[@class=\"mail-ComposeButton-Text\"]"))
                .click();

        driver.findElement(By
                .xpath("//*[@id=\"nb-1\"]/body/div[2]/div[4]/div/div[2]/div[3]/div[2]/div[5]/div/div[1]/div[2]/div[1]/div/div[1]/label/div[3]/div"))
                .sendKeys("alexanderk@adjuggler.ru");

        driver.findElement(By
                .xpath("//*[@id=\"nb-1\"]/body/div[2]/div[4]/div/div[2]/div[3]/div[2]/div[5]/div/div[1]/div[2]/div[1]/div/label/div[3]/input"))
                .sendKeys("test automation mail");

        driver.findElement(By
                .xpath("//*[@id=\"cke_1_contents\"]/textarea"))
                .sendKeys("test message");

        driver.findElement(By.xpath("//span[text()=\"Отправить\"]")).click();

        String text = driver.findElement(By.xpath("//div[text()=\"Письмо отправлено.\"]")).getText();

        driver.findElement(By.xpath("//a[@data-click-action=\"mailbox.check\"]")).click();

        driver.findElement(By.xpath("//div[@class=\"ns-view-container-desc mail-MessagesList js-messages-list mail-MessagesList_height_small\"]/div[1]//span[@class=\"_nb-checkbox-flag _nb-checkbox-normal-flag\"]")).click();

        driver.findElement(By.xpath("//span[text()=\"Удалить\"]")).click();

//        driver.findElement(By.xpath("//span[text()=\"Удалить\" and @class=\"_nb-button-text\"]")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("nb-6")).click();

        driver.findElement(By.xpath("//span[text()=\"Папки и метки\"]")).click();

        driver.findElement(By.xpath("//span[text()=\"По алфавиту\"]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()=\"По количеству писем\"]")).click();

        Thread.sleep(2000);

        driver.quit();
    }


    private static void login(String login, String password) {

        driver.findElement(By.xpath("//input[@name=\"login\"]"))
                .sendKeys(login);

        driver.findElement(By.xpath("//input[@name=\"passwd\"]"))
                .sendKeys(password);

        driver.findElement(By.xpath("//span[text()=\"Войти\"]")).click();
    }
}
