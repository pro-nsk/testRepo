import org.junit.Test;

public class SendMailTest {

    @Test
    public static void sendMail() {

        YandexMailPage yandexMailPage = new YandexMailPage();
        YandexLoginPage yandexLoginPage = yandexMailPage.login();
        yandexLoginPage.login("alexanderk@adjuggler.ru", System.getProperty("yandexPass"));

        System.out.println(6);

        System.out.println(5);
    }
}
