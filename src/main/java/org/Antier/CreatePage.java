package org.Antier;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.clipboard.HasClipboard;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.AndroidActions;

import java.time.Duration;

public class CreatePage extends AndroidActions {

   public AndroidDriver driver;

    public CreatePage(AndroidDriver driver) {
        super(driver);
        this.driver =driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

@AndroidFindBy(xpath = "//*[@text='Create New Wallet']")
    private WebElement createWallet;

    public void clickCreateNewWallet(){
        boolean a = true;
        while (a) {
            try {
                createWallet.click();
                a = false;
            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            }
        }


    }

    @AndroidFindBy(xpath = "//android.widget.ImageView")
    private WebElement back;

    public void clickBackButton(){
        back.click();
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter wallet name']")
    private WebElement enterText;

    public void setEnterText(String name){
        enterText.sendKeys(name);
    }

    @AndroidFindBy(xpath = "//*[@text='Continue']")
    private WebElement button;

    public void clickContinue() throws InterruptedException {
        button.click();
        Thread.sleep(2000);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter wallet name']")
    private WebElement cleartext;


    @AndroidFindBy(xpath = "//*[@text='Copy']")
    private WebElement copy;

    public void copyandpaste() throws InterruptedException {
        boolean a = true;
        while (a) {
            try {
                copy.click();
                a = false;
            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            }
        }

        String text = driver.getClipboardText();
        String[] textArray = text.split(" ");
        driver.findElement(By.xpath("(//android.widget.ImageView) [3]")).click();
        driver.findElement(By.xpath("//*[@text='Proceed']")).click();

// paste mnemonics
        for (int i = 0; i < textArray.length; i++) {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@text='" + textArray[i] + "']")).click();
        }
        driver.findElement(By.xpath("//*[@text='Submit']")).click();
        Thread.sleep(3000);

    }

    @AndroidFindBy(xpath = "//*[@text='1']")
    private WebElement createcode;

    public void setCreateSecretCode() throws InterruptedException {
        for(int i=0; i<=5; i++){
            createcode.click();
        }
        Thread.sleep(1000);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='2']")
    private WebElement confirmIncorectcode;

    public void setConfirmIncorectCode() throws InterruptedException {
        for(int i=0; i<=5; i++){
            confirmIncorectcode.click();
        }
        Thread.sleep(1000);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='1']")
    private WebElement confirmcode;

    public void setConfirmcode() throws InterruptedException {
        for(int i=0; i<=5; i++){
            confirmcode.click();
        }
        Thread.sleep(1000);
    }

    @AndroidFindBy(xpath = "//*[@text='Continue']")
    private WebElement continuebutton;

    public void createContinue() throws InterruptedException {
        boolean a = true;
        while (a) {
            try {
                button.click();
                a = false;
            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            }
        }

    }

}
