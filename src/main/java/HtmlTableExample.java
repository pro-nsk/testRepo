public class HtmlTableExample extends BasePage {

    public HtmlTableExample() {
        driver.get("http://w3schools.com/html/html_tables.asp");
    }

    void close() {
        driver.quit();
    }
}
