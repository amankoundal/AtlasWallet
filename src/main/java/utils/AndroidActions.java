package utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;

public class AndroidActions {
    AndroidDriver driver;


    public AndroidActions(AndroidDriver driver) {

        this.driver=driver;
    }

    public  void scrollDown() {
        boolean canScrollMore;
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", "down",
                    "percent", 3.0
            ));
        }
        while (canScrollMore);
    }

    public void hideKeyboard(){
        driver.hideKeyboard();
    }




}
