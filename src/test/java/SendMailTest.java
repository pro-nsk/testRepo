import org.junit.Test;

public class SendMailTest {

    @Test
    public void sendMail() throws InterruptedException {

        YandexMailPage yandexMailPage = new YandexMailPage();
        YandexLoginPage yandexLoginPage = yandexMailPage.login();
        yandexMailPage = yandexLoginPage.login("alexanderk@adjuggler.ru", System.getProperty("yandexPass"));

        yandexMailPage.writeMail("alexanderk@adjuggler.ru", "theme");
        yandexMailPage.refreshCheck();
        yandexMailPage.deleteLastMail();
//        yandexMailPage.other();
        

        yandexMailPage.close();
    }

    @Test
    public void htmlTable() {
        HtmlTableExample htmlTableExample = new HtmlTableExample();

        Class<? extends HtmlTableExample> aClass = htmlTableExample.getClass();

        htmlTableExample.close();
    }
}
