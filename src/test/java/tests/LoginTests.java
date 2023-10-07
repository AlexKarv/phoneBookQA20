package tests;

import dto.UserDTO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void positiveLoginUserDTO() {
        UserDTO userDTO = new UserDTO("n4j5ymkg@domain.com", "Qwerty-888@");
        app.getUserHelper().login(userDTO);
        Assert.assertTrue(app.getUserHelper().ValidatePopUpMassageSucsessAfterLogin());

    }
}
