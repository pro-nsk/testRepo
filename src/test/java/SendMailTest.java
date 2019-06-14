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
        // yandexMailPage.other();
        System.out.println(666);
        System.out.println(555);
        System.out.println(333);
        System.out.println(222);

        yandexMailPage.close();
    }

    @Test
    public void htmlTable() {
        HtmlTableExample htmlTableExample = new HtmlTableExample();

        // Class<? extends HtmlTableExample> aClass = htmlTableExample.getClass();

        htmlTableExample.close();
    }

    @Test
    public void testTest () {
        System.out.println("testTest");
    }
}
