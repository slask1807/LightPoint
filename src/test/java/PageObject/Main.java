package PageObject;

import org.openqa.selenium.WebDriver;

public class Main extends BasePage {

    String url = "https://www.onliner.by/";

    public Main(WebDriver driver) throws InterruptedException {
        super(driver);
    }

    public void goTo() {
        driver.get(url);
    }

    public void chooseTask() throws InterruptedException {
        gotClickCatalog();
        Thread.sleep(300);
        gotClickElectronika();
        Thread.sleep(300);
        gotClickMobilePhone();
        Thread.sleep(300);
        gotCheckBoxApple();
        gotwaitUploadPhoneApple();
        gotClickfirstPhoneApple();
    }
}







