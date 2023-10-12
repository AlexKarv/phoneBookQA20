package tests;

import dto.UserDTO;
import dto.UserDTOWith;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void positiveLoginUserDTO() throws InterruptedException {
        UserDTO userDTO = new UserDTO("n4j5ymkg@domain.com", "Qwerty-888@");
        Thread.sleep(5000);
        app.getUserHelper().login(userDTO);
        Thread.sleep(5000);
        Assert.assertTrue(app.getUserHelper().ValidatePopUpMassageSucsessAfterLogin());

    }
    @Test
    public void positiveLoginUserDTOWith() throws InterruptedException {
        UserDTOWith userDTOWith = new UserDTOWith()
                .withEmail("n4j5ymkg@domain.com").withPassword("Qwerty-888@");
        Thread.sleep(5000);
        app.getUserHelper().login(userDTOWith);
        Thread.sleep(5000);
        Assert.assertTrue(app.getUserHelper().ValidatePopUpMassageSucsessAfterLogin());
    }
}
