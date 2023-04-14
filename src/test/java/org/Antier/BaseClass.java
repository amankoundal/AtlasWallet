package org.Antier;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClass {
    AndroidDriver driver;
    @Test
    public void AppiumConfigure() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Antech's S10+");
        //Redmi Note 11
        options.setApp("C:\\Users\\user\\Desktop\\Atlas.apk");
        URL url= new URL("http://localhost:4723/wd/hub");
        driver= new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();

    }
}
