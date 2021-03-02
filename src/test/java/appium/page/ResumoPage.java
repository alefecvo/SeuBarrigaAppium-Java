package appium.page;

import appium.core.BasePage;
import appium.core.DriverFactory;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class ResumoPage extends BasePage {
    public void excluirMovimentacao(String descricao){
        MobileElement element = DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+descricao+"']/.."));

        swipeElement(element,0.9,0.1);

        clicarPorTexto("Del");
    }

    public boolean verificarMensagem(String mensagem){
        return existeElementoPorTexto(mensagem);
    }

    public void atualizar(){
        clicarPorTexto("ATUALIZAR");
    }
}
