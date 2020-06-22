package pages;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {

    public static void openUrl(String url) {
        open(url);
    }
}
