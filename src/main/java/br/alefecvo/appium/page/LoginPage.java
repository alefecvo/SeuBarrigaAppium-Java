package br.alefecvo.appium.page;

import br.alefecvo.appium.core.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public void acessarTelaInicial(String valor){
        clicarPorTexto(valor);
    }

    public void setEmail(String email){
        escreverTexto(By.xpath("//android.widget.EditText[1]"),email);
    }

    public void setSenha(String senha){
        escreverTexto(By.xpath("//android.widget.EditText[2]"),senha);
    }

    public void entrar(){
        clicarPorTexto("ENTRAR");
    }

    public boolean verificaUsuarioLogado(String texto){
        return existeElementoPorTexto(texto);
    }

    public void resetar(){
        clicarPorTexto("RESET");
    }

    public void autenticar(String email, String senha){
        acessarTelaInicial("SeuBarriga Nativo");
        setEmail(email);
        setSenha(senha);
        entrar();
    }
}
