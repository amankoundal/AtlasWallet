package org.Antier;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.AndroidActions;

import java.time.Duration;

public class ImportPage extends AndroidActions {

    AndroidDriver driver;

    public ImportPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(xpath= "(//android.widget.TextView)[3]")
    private WebElement importOption;

    @AndroidFindBy(xpath ="(//android.widget.EditText)[1]")
    private WebElement nameField;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup)[16]")
    private WebElement selectContinue;

    @AndroidFindBy(xpath = "//*[@text='Paste']")
    private WebElement pasteMnemonics;

    @AndroidFindBy(xpath ="//*[@text='Submit']")
    private WebElement submit;



    public void selectImportWallet(String RestoreUsingPassphrase) {
        boolean a = true;
        while (a) {
            try {
                importOption.click();
                a = false;
            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            }
        }
    }

    public void enterName(String name){
        nameField.sendKeys(name);
        driver.hideKeyboard();
    }

    public void setSelectContinue(){

        selectContinue.click();
    }

    public void setPasteMnemonics() throws InterruptedException {
        driver.setClipboardText("cruel taste virtual tower dose promote daughter bonus december blind raise tide");
        pasteMnemonics.click();
        Thread.sleep(2000);
    }

    public void setSubmit(){

        submit.click();
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
    private WebElement importbutton;

    public void importContinue() throws InterruptedException {
        boolean a = true;
        while (a) {
            try {
                importbutton.click();
                a = false;
            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            }
        }

    }


    @AndroidFindBy(xpath = "//*[@text='Settings']")
    private WebElement setting;

    public void clickSetting(){
        setting.click();
    }

}