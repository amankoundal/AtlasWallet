package org.Antier;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Createcase {

    AppiumDriver driver;
@Test
    public void testAppium() throws MalformedURLException {  UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Antech's S10+");
        //Redmi Note 11
        options.setApp("C:\\Users\\user\\Downloads\\app-release.apk");
        URL url= new URL("http://localhost:4723/wd/hub");
        driver= new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();

        boolean a = true;
        while (a) {
            try {
                driver.findElement(By.xpath("xpath = //*[@text='Create New Wallet']").click();
                a = false;
            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            }
        }
    }
}
