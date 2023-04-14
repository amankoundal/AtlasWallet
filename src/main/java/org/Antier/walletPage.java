package org.Antier;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.AndroidActions;

import java.time.Duration;


public class walletPage extends AndroidActions {
    public AndroidDriver driver;

    public walletPage(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(xpath = "//*[@text='Settings']")
    private WebElement setting;

    public void clickSetting() {
        setting.click();
    }

    @AndroidFindBy(xpath = "//*[@text='Address Book']")
    private WebElement addressbook;

    public void clickAddressBook() {
        addressbook.click();
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView) [2]")
    private WebElement addButton;

    public void clickAddButton() {
        addButton.click();
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView) [5]")
    private WebElement wallet;

    public void clickWallet() throws InterruptedException {
        boolean a = true;
        while (a) {
            try {
                wallet.click();
                a = false;
            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            }
        }

        Thread.sleep(3000);
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView) [10]")
    private WebElement manage;

    public void clickManage() {
        manage.click();
    }

    @AndroidFindBy(xpath = "(//android.widget.Switch) [1]")
    private WebElement eth;

    public void offEth() {
        eth.click();
    }

    @AndroidFindBy(xpath = "(//android.widget.Switch) [2]")
    private WebElement btc;

    public void offBtc() {
        btc.click();
    }

    @AndroidFindBy(xpath = "(//android.widget.Switch) [3]")
    private WebElement matic;

    public void offMatic() {
        matic.click();
    }

    @AndroidFindBy(xpath = "(//android.widget.Switch) [4]")
    private WebElement bnb;

    public void offBnb() {
        bnb.click();
    }

    @AndroidFindBy(xpath = "(//android.widget.Switch) [5]")
    private WebElement avax;

    public void offAvax() {
        avax.click();
    }

    @AndroidFindBy(xpath = "(//android.widget.Switch) [6]")
    private WebElement cro;

    public void offCro() {
        cro.click();
    }

    @AndroidFindBy(xpath = "(//android.widget.Switch) [7]")
    private WebElement sol;

    public void offSol() {
        sol.click();
    }

    @AndroidFindBy(xpath = "(//android.widget.Switch) [8]")
    private WebElement ada;

    public void offAda() {
        ada.click();
    }

    @AndroidFindBy(xpath = "(//android.widget.Switch) [9]")
    private WebElement rbl;

    public void offRbl(){
        rbl.click();
    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView) [1]")
    private WebElement backButton;

    public void clickBackButton() {
        backButton.click();
    }

    @AndroidFindBy(xpath = "//*[@text='Token Not Found']")
    private WebElement text;

    public String captureText(){
        text.getText();
        return captureText();
    }
}
