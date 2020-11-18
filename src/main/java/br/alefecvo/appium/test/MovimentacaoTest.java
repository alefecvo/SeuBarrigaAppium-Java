package br.alefecvo.appium.test;

import br.alefecvo.appium.core.BaseTest;
import br.alefecvo.appium.page.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MovimentacaoTest extends BaseTest {
    private MenuPage menuPage = new MenuPage();
    private LoginPage loginPage = new LoginPage();
    private MovimentacaoPage movimentacaoPage = new MovimentacaoPage();
    private HomePage homePage = new HomePage();
    private ResumoPage resumoPage = new ResumoPage();

    @Before
    public void setUp(){
        loginPage.autenticar("alefe@cardozo","123456");
        loginPage.resetar();
    }

    @Test
    public void deveCriarMovimentacao(){
        menuPage.acessarAbaMovimentacao();

        movimentacaoPage.criarMovimentacao(
                "Conta usada para movimentação",
                "Pessoa física",
                "1500",
                "Conta para movimentacoes");

        Assertions.assertTrue(movimentacaoPage.verificarMensagem("Movimentação cadastrada com sucesso"));
    }

    @Test
    public void deveAtualizarSaldoAoExcluirMovimentacao(){
        Assertions.assertEquals("534.00",homePage.obterSaldoConta("Conta para saldo"));

        menuPage.acessarAbaResumo();

        menuPage.acessarAbaResumo();

        resumoPage.atualizar();

        resumoPage.excluirMovimentacao("Movimentacao 3, calculo saldo");

        Assertions.assertTrue(resumoPage.verificarMensagem("Movimentação removida com sucesso!"));

        menuPage.acessarAbaHome();

        homePage.aguardar();

        homePage.realizarScroll();

        Assertions.assertEquals("-1000.00",homePage.obterSaldoConta("Conta para saldo"));
    }

}
