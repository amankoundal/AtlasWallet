package org.Antier;

import org.testng.annotations.Test;

public class Import extends BaseClass{

    @Test

    public void importCase() throws InterruptedException {
        ImportPage formpage= new ImportPage(driver);
        formpage.selectImportWallet("RestoreUsingPassphrase");
        formpage.enterName("Tester111");
        formpage.setSelectContinue();
        formpage.setPasteMnemonics();
        formpage.setSubmit();
        formpage.importContinue();
        formpage.setCreateSecretCode();
        formpage.setConfirmcode();
        formpage.clickSetting();


    }
}
