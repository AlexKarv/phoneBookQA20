package manager;

import dto.UserDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    By btnLoginNavigatorMenu = By.xpath("//a[@href='/login']");
    By inputEmailLoginForm = By.xpath("//input[@name='email']");

    By inputPasswordLoginForm = By.xpath("//input[@name='password']");

    By btnLoginButton = By.xpath("//button[(@type='submit') and (@name = 'login')]");

    By textSuccessLogin = By.xpath("//a[@href='/contacts']");


    public void login(UserDTO userDTO) {
        clickBase(btnLoginNavigatorMenu);
        tipeTextBase(inputEmailLoginForm, userDTO.getEmail());
        tipeTextBase(inputPasswordLoginForm, userDTO.getPassword());
        clickBase(btnLoginButton);
    }

    public boolean ValidatePopUpMassageSucsessAfterLogin() {
        return  isTextEqual(textSuccessLogin, "CONTACTS");
    }
}
