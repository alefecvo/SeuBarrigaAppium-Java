package appium.core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    @Rule
    public TestName testName = new TestName();

    @AfterClass
    public static void finalizarClasse(){
        DriverFactory.killDriver();
    }

    @After
    public void tearDown(){
        gerarScreenShot();
        DriverFactory.getDriver().resetApp();
    }

//    @BeforeEach
//    public void setUp(){
//        LoginPage loginPage = new LoginPage();
//        loginPage.autenticar("alefe@cardozo","123456");
//    }

    public void gerarScreenShot(){
        try {
            File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(imagem,new File("target/screenshots/"+testName.getMethodName()+".png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
