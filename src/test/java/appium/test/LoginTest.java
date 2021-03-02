package appium.test;

import appium.core.BaseTest;
import appium.page.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LoginTest extends BaseTest {

    private LoginPage loginPage = new LoginPage();

    @Before
    public void setUp(){
        loginPage.autenticar("alefe@cardozo","123456");
    }

    @Test
    public void deveRealizarLogin(){
        Assertions.assertTrue(loginPage.verificaUsuarioLogado("HOME"));
    }
}
