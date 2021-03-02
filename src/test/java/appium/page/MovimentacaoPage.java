package appium.page;

import appium.core.BasePage;
import org.openqa.selenium.By;

public class MovimentacaoPage extends BasePage {

    public void setDescricao(String descricao){
        escreverTexto(By.xpath("//android.widget.EditText[1]"),descricao);
    }

    public void setInteressado(String interessado){
        escreverTexto(By.xpath("//android.widget.EditText[2]"),interessado);
    }

    public void setValor(String valor){
        escreverTexto(By.xpath("//android.widget.EditText[3]"),valor);
    }

    public void selecionarConta(String conta){
        selecionarCombo(By.xpath("//android.widget.Spinner[2]"),conta);
    }

    public void salvar(){
        clicarPorTexto("SALVAR");
    }

    public boolean verificarMensagem(String mensagem){
        return existeElementoPorTexto(mensagem);
    }

    public void criarMovimentacao(String descricao, String interessado, String valor, String conta){
        setDescricao(descricao);
        setInteressado(interessado);
        setValor(valor);
        selecionarConta(conta);
        salvar();
    }
}
