package manager;

import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BaseHelper {
    WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findElementBase (By locator) {
        System.out.println(locator);
        return driver.findElement(locator);

    }
    private List<WebElement>findElementsBase (By locator)
        {
            System.out.println(locator);
        return driver.findElements(locator);
    }
    public void clickBase (By locator) {
        WebElement el = findElementBase(locator);
        el.click();
    }
    public String  getTextBase (By locator) {
        WebElement el = findElementBase(locator);
        return el.getText().trim().toUpperCase();
    }
    public void tipeTextBase (By locator, String text){
        WebElement el = findElementBase(locator);
        el.click();
        el.clear();
        el.sendKeys(text);
    }

    public boolean isTextEqual(By Locator, String expectResult) {
        String actualResult = getTextBase(Locator);
        expectResult = expectResult.toUpperCase();
        if (expectResult.equals(actualResult)){
            return true;}
        else {
            System.out.println("expectesd result: " + expectResult
                    + "Actual resylt: " + actualResult);
            return false;
        }

    }






}
