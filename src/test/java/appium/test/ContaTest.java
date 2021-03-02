package appium.test;

import appium.core.BaseTest;
import appium.page.ContaPage;
import appium.page.LoginPage;
import appium.page.MenuPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ContaTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private LoginPage loginPage = new LoginPage();
    private ContaPage contaPage = new ContaPage();

    @Before
    public void setUp(){
        loginPage.autenticar("alefe@cardozo","123456");
        loginPage.resetar();

    }

    @Test
    public void deveCriarConta(){
        menuPage.acessarAbaConta();
        contaPage.criarConta("Conta para criar");

        Assertions.assertTrue(contaPage.verificarMensagem("Conta adicionada com sucesso"));
        Assertions.assertTrue(contaPage.verificarItemLista("Conta para criar"));
    }

    @Test
    public void deveExcluirConta(){
        menuPage.acessarAbaConta();
        contaPage.excluirConta("Conta para alterar");

        Assertions.assertTrue(contaPage.verificarMensagem("Conta para alterar"));
    }
}
