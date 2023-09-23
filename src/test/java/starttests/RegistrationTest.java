package starttests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.RandomUtils;

import java.util.concurrent.TimeUnit;

public class RegistrationTest extends PhoneBook {
    //WebDriver driver;

    RandomUtils randomUtils = new RandomUtils();
    Faker faker = new Faker();
    static String email;


    @Test
    public void regisrationPositiveTest() {

        email = faker.internet().emailAddress();
        System.out.println(email);
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys(email);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='password']"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Qwerty-888@");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//button[(@type='submit') and (@name = 'registration')]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}



