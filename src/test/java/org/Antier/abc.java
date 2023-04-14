package org.Antier;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
public class abc extends BaseClass{
@Test
    public void createWallet() throws InterruptedException {

    boolean a = true;
    while (a) {
        try {
            driver.findElement(By.xpath("//*[@text='Create New Wallet']")).click();

            a = false;
        } catch (Exception e) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }
driver.findElement(By.xpath("//android.widget.EditText[@text='Enter wallet name']")).sendKeys("poem");
    driver.hideKeyboard();
    driver.findElement(By.xpath("//*[@text='Continue']")).click();



    String toastMessage = driver.findElement((By.xpath("/hierarchy/android.widget.Toast"))).getText();

    System.out.println(toastMessage);



}
}




