package appium.page;

import appium.core.BasePage;
import org.openqa.selenium.By;

public class ContaPage extends BasePage {

    public void setNomeConta(String conta){
        escreverTexto(By.xpath("//android.widget.EditText[1]"),conta);
    }

    public void salvar(){
        clicarPorTexto("SALVAR");
    }

    public void excluir(){
        clicarPorTexto("EXCLUIR");
    }

    public boolean verificarMensagem(String mensagem){
        return existeElementoPorTexto(mensagem);
    }

    public boolean verificarItemLista(String texto){
        return existeElementoPorTexto(texto);
    }

    public void selecionarConta(String conta){
        cliqueLongo(conta);
    }

    public void criarConta(String conta){
        setNomeConta(conta);
        salvar();
    }

    public void excluirConta(String conta){
        selecionarConta(conta);
        excluir();
    }
}
