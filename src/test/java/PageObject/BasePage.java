package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"navigation-sidebar\"]/div[2]/div[2]/div[2]/ul[1]/li[2]/a[1]/span")
    private WebElement ClickCatalog;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div/div[1]/ul/li[2]/span[2]/span")
    private WebElement clickElectronika;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div/div[1]/div[3]/div/div[1]/div[1]/div/div[1]/div[2]/div/a[1]/span/span[3]")
    private WebElement clickMobilePhone;

    @FindBy(xpath = "//*[@id=\"schema-filter\"]/div[3]/div[6]/div[2]/ul/li[3]/label")
    private WebElement checkBoxApple;

    @FindBy(xpath = "//*[@id=\"schema-products\"]/div[1]/div/div[3]/div[2]/div[1]/a")
    private WebElement clickfirstPhoneApple;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div/div/div[2]/div[1]/main/div/div/div[1]/div[2]/div[5]/div[1]/div/a")
    private WebElement findCheckElement;

    By waitUploadPhoneApple = By.xpath("//*[@id=\"schema-tags\"]/div/span");

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    private By GotPageThisApplePhone = By.linkText("Смартфон Apple iPhone");

    public void gotClickCatalog() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", ClickCatalog);
    }

    public void gotClickElectronika() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", clickElectronika);
    }

    public void gotClickMobilePhone() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", clickMobilePhone);
    }

    public void gotClickfirstPhoneApple() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", clickfirstPhoneApple);
    }

    public void gotCheckBoxApple() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", checkBoxApple);
    }

    public WebElement getFindCheckElemend() {
        return findCheckElement;
    }

    public void gotwaitUploadPhoneApple() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitUploadPhoneApple));
    }
}
