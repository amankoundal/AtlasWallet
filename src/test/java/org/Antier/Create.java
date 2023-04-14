package org.Antier;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Create extends BaseClass {
    @Test
    public void createClass() throws InterruptedException {
        CreatePage createPage = new CreatePage(driver);
        createPage.clickCreateNewWallet();
        createPage.setEnterText("sdfsdagdsagdasgdsagdasgda");
        createPage.clickBackButton();
        createPage.clickCreateNewWallet();
        createPage.setEnterText("@#$$^&%^%&*");
        createPage.setEnterText("poem");
        createPage.clickContinue();
        //String toastmsg =System.out.println(driver.findElement(By.xpath("//android.widget.Toast")).getText());
        // Assert.assertEquals(toastmsg,"Sorry this wallet name already exists")
        // ......................................................................................................a
        createPage.copyandpaste();
        createPage.createContinue();
        //String text= driver.findElement(By.xpath("//android.widget.TextView[@text='Your Wallet Is Ready!']")).getText();
        // Assert.assertEquals(text,"Your Wallet Is Ready!");
        // toast
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        createPage.setCreateSecretCode();
        createPage.clickContinue();
        createPage.setConfirmIncorectCode();
        createPage.clickContinue();
        // toast
        createPage.setConfirmcode();
        createPage.clickContinue();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        walletPage walletPage = new walletPage(driver);
        walletPage.clickWallet();
        walletPage.clickManage();
        walletPage.offEth();
        walletPage.offBtc();
        walletPage.offMatic();
        walletPage.offBnb();
        walletPage.offAvax();
        walletPage.offCro();
        walletPage.offSol();
        walletPage.clickBackButton();
        String allOffToken= walletPage.captureText();
        Assert.assertEquals(allOffToken,"Token Not Found");
        //settingPage.clickSetting();
        // settingPage.clickAddressBook();


    }
}
