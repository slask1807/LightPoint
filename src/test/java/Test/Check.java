package Test;

import PageObject.BasePage;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class Check extends BasePage {
    public Check(WebDriver driver) {
        super(driver);
    }

    public void checkPageIsCorrect() {
        String price = getFindCheckElemend().getText();
        System.out.println(price);
        String priceCut = price.split(",")[0];
        int numInt = Integer.parseInt(priceCut);
        assertTrue("The price is higher 100 BYN", numInt > 100);
    }
}
