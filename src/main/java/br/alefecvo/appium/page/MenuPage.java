package br.alefecvo.appium.page;

import br.alefecvo.appium.core.BasePage;

public class MenuPage extends BasePage {

    public void acessarAbaHome(){
        clicarPorTexto("HOME");
    }

    public void acessarAbaConta(){
        clicarPorTexto("CONTAS");
    }

    public void acessarAbaMovimentacao(){
        clicarPorTexto("MOV...");
    }

    public void acessarAbaResumo(){
        clicarPorTexto("RESUMO");
    }


}
