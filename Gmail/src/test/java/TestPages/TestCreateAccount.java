package TestPages;

import Pages.CreateAccount;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class TestCreateAccount extends CommonApi {
    CreateAccount createAccount;

    @BeforeMethod
    public void setUp() {
        createAccount = PageFactory.initElements(driver, CreateAccount.class);}

    @Test
    public void WithoutInfo() {
        List actual = createAccount.WithoutInfo();
        List expected = createAccount.expectedMessagewithoutInfo();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void invalidPasswordSignUp() {
        String actual = createAccount.invalidPasswordSignUp();
        String expected = "Use 8 characters or more for your password";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void invalidEmailSignUp(){
        String actual = createAccount.invalidEmailSignUp();
        String expected = "Sorry, only letters (a-z), numbers (0-9), and periods (.) are allowed.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void existingEmailSignUp(){
        String actual = createAccount.existingEmailSignUp();
        String expected = "That username is taken. Try another.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void invalidConfirmPasswordInput(){
        String actual = createAccount.invalidConfirmPasswordInput();
        String expected = "Those passwords didn't match. Try again.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void missingLastNameSignUP(){
        String actual = createAccount.missingLastNameSignUP();
        String expected = "Enter last name";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void missingFirstNameSignUP(){
        String actual = createAccount.missingFirstNameSignUP();
        String expected = "Enter first name";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void missingUserNameSignUP(){
        String actual = createAccount.missingUserNameSignUP();
        String expected = "Choose a Gmail address";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void missingPasswordSignUP(){
        String actual = createAccount.missingPasswordSignUP();
        String expected = "Enter a password";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void missingConfirmPasswordSignUP(){
        String actual = createAccount.missingConfirmPasswordSignUP();
        String expected = "Confirm your password";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
}
