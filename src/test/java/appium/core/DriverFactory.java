package appium.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    //Variável global para inicializar driver
    private static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver(){
        if(driver == null){
            createDriver();
            //createDriverSauceLabs();
        }
        return  driver;
    }

    public static void killDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

    private static void createDriver(){
        //Criando as capacidades para acessar o emulador
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/alefe/IdeaProjects/CourseAppium/src/main/resources/CTAppium_1_2.apk");

        //Criando o driver para acessar elementos
        try{
            driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    private static void createDriverSauceLabs(){
        //Criando as capacidades para acessar o emulador pelo SauceLabs
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("app", "storage:filename=CTAppium_1_2.apk");
        desiredCapabilities.setCapability("browserName", "");
        desiredCapabilities.setCapability("appiumVersion", "1.16.0");

        //Criando o driver para acessar elementos
        try{
            driver = new AndroidDriver<MobileElement>(new URL(""),desiredCapabilities);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
