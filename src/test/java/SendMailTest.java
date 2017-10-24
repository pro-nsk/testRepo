import org.junit.Test;

public class SendMailTest {

    @Test
    public void sendMail() {

        YandexMailPage yandexMailPage = new YandexMailPage();
        YandexLoginPage yandexLoginPage = yandexMailPage.login();
        yandexLoginPage.login("alexanderk@adjuggler.ru", System.getProperty("yandexPass"));


        System.out.println(6);


    }
}
