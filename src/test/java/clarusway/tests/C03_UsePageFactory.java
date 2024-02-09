package clarusway.tests;

import clarusway.pages.ContactListContactPage;
import clarusway.pages.ContactListHomePage;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class C03_UsePageFactory {

    @Test
    public void pageFactoryTest(){

        //1. Adım: Driver class ile browser'ı aç ve properties dosyasından ilgili url'i al.
        Driver.getDriver().get(ConfigReader.getProperty("contact_list_url"));

        //2. Adım: Gerekli web elementlerin bulunduğu sayfadan(Java Class'ı) obje oluştur.
        ContactListHomePage contactListHomePage = new ContactListHomePage();

        //3. Adım: Oluşan obje ile web elementleri çağır ve kullan.
        contactListHomePage.username.sendKeys(ConfigReader.getProperty("contact_list_username"));
        contactListHomePage.password.sendKeys(ConfigReader.getProperty("contact_list_password"));
        contactListHomePage.submit.click();

        //Giriş yapıldığını doğrula(assert)
        ContactListContactPage contactListContactPage = new ContactListContactPage();

        assertTrue(contactListContactPage.logout.isDisplayed());

        //Driver'ı kapa
        Driver.closeDriver();

    }

}