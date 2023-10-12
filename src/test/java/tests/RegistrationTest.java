package tests;

import com.github.javafaker.Faker;
import dto.UserDTOLombok;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.BaseTest.app;

public class RegistrationTest extends BaseTest{
    Faker faker = new Faker();


@Test
public void positiveRegistration () throws InterruptedException {
    String email = faker.internet().emailAddress();
    System.out.println(email);

    UserDTOLombok user = UserDTOLombok.builder()
            .email(email)
            .password("12As3454467@")
            .build();
    app.getUserHelper().fillRegistrationForm(user);
    Thread.sleep(5000);
    Assert.assertTrue(app.getUserHelper().ValidatePopUpMassageSucsessAfterRegistration());


}

}
