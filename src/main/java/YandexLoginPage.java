import org.openqa.selenium.By;

public class YandexLoginPage extends BasePage {
    public void login(String login, String password) {

        driver.findElement(By.xpath("//input[@name=\"login\"]"))
                .sendKeys(login);

        driver.findElement(By.xpath("//input[@name=\"passwd\"]"))
                .sendKeys(password);

        driver.findElement(By.xpath("//span[text()=\"Войти\"]")).click();
    }
}
