package appium.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;

import static appium.core.DriverFactory.getDriver;

public class BasePage {

//   /*
//        Comandos para preencher campos
//   */
//
    public void escreverTexto(By by, String valor){
        getDriver().findElement(by).sendKeys(valor);
    }
//
//
//    /*
//        Comandos de cliques
//   */
//
//    public void clicar(String valor){
//        getDriver().findElement(MobileBy.AccessibilityId(valor)).click();
//    }
//
    public void clicarPorTexto(String valor){
        getDriver().findElement(By.xpath("//*[@text='"+valor+"']")).click();
    }

    public void cliqueLongo(String valor){
        AndroidTouchAction touch = new AndroidTouchAction(DriverFactory.getDriver());
        touch.longPress(LongPressOptions.longPressOptions().withElement(
                ElementOption.element(DriverFactory.getDriver().findElement(By.xpath("//*[@text='"+valor+"']")))))
                .perform();
    }

    public void selecionarCombo(By by, String valor){
        getDriver().findElement(by).click();
        clicarPorTexto(valor);
    }
//
//    public void clicarCheckBox(By by){
//        getDriver().findElement(by).click();
//    }
//
//    public void clicarSwitch(By by){
//        getDriver().findElement(by).click();
//    }
//
//    public void clicaPosicao(double posicao){
//        MobileElement seek = getDriver().findElement(MobileBy.AccessibilityId("slid"));
//
//        int x = (int) (seek.getLocation().x + (seek.getSize().width * posicao));
//        int y = seek.getLocation().y + (seek.getSize().height / 2);
//
//        tap(x,y);
//    }
//
//    /*
//        Comandos de obter texto
//   */
//
    public String obterTexto(By by){
        return getDriver().findElement(by).getText();
    }

    public boolean existeElementoPorTexto(String valor){
        List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='"+valor+"']"));
        return  elementos.size() > 0;
    }
//
//    /*
//        Comandos para verificar se elementos existem
//   */
//
//
//
//
//    public void tap(int x,int y){
//        AndroidTouchAction touch = new AndroidTouchAction (getDriver());
//        touch.press(PointOption.point(x,y))
//                .perform ();
//    }
//
//    /*
//        Comandos para esperas
//   */
//
//
    public void esperar(long tempo){
        try {
            Thread.sleep(tempo);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
//
//    public void aguardarMenu(){
//        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(),20);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
//    }
//
//
//    /*
//        Comandos para scroll
//   */
//
    public void scroll(double inicio,double fim){
        Dimension size = getDriver().manage().window().getSize();

        int x = (size.width / 2);

        int start_y = (int)(size.height * inicio);
        int end_y = (int)(size.height * fim);

        AndroidTouchAction touch = new AndroidTouchAction (getDriver());
        touch
                .press(PointOption.point(x,start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(x,end_y))
                .release()
                .perform ();
    }
//
//
//    public void scrollDown(){
//        scroll(0.9, 0.1);
//    }
//
//    public void scrollUp(){
//        scroll(0.1,0.9);
//    }
//
//    public void scrollPorTexto(String menuText) {
//        try {
//            getDriver()
//                    .findElement(MobileBy
//                            .AndroidUIAutomator(
//                                    "new UiScrollable(new UiSelector()"
//                                            + ".scrollable(true)"
//                                            + ".instance(0))"
//                                            + ".scrollIntoView(new UiSelector()"
//                                            + ".textMatches(\"" + menuText + "\")"
//                                            + ".instance(0));"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//     /*
//        Comandos para swipe
//   */
//
//    public void swipe(double inicio, double fim){
//        Dimension size = getDriver().manage().window().getSize();
//
//        int y = (size.height / 2);
//
//        int start_x = (int)(size.width * inicio);
//        int end_x = (int)(size.width * fim);
//
//        AndroidTouchAction touch = new AndroidTouchAction (getDriver());
//        touch
//                .press(PointOption.point(start_x,y))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
//                .moveTo(PointOption.point(end_x,y))
//                .release()
//                .perform ();
//    }
//
    public void swipeElement(MobileElement element, double inicio, double fim){

        int y = element.getLocation().y + (element.getSize().height / 2);

        int start_x = (int)(element.getSize().width * inicio);
        int end_x = (int)(element.getSize().width * fim);

        AndroidTouchAction touch = new AndroidTouchAction (getDriver());
        touch
                .press(PointOption.point(start_x,y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(end_x,y))
                .release()
                .perform ();
    }
//
//    public void swipeLeft(){
//        swipe(0.1,0.9);
//    }
//
//    public void swipeRight(){
//        swipe(0.9, 0.1);
//    }

}
