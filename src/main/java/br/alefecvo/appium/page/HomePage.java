package br.alefecvo.appium.page;

import br.alefecvo.appium.core.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public String obterSaldoConta(String conta){
        return obterTexto(By.xpath("//*[@text='"+conta+"']/following-sibling::android.widget.TextView"));
    }

    public void realizarScroll(){
        scroll(0.2,0.9);
    }

    public void aguardar(){
        esperar(1000);
    }
}
