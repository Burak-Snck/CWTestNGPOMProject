package clarusway.tests;

import clarusway.pages.InputValidationPage;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C5_FindBysFindAll {
/*
    @FindBy, @FindBys ve @FindAll, Java programlama dili ve Selenium test otomasyon aracıyla web sayfalarındaki elemanları bulmak için kullanılan annotasyonlardır.

    @FindBy tek bir locator ile,

    @FindBys birden çok kriteri birleştiren elemanları

    @FindAll birden çok kriter arasında herhangi birini karşılayan elemanları bulmak için kullanılır.

    Bu annotasyonlar, Selenium test senaryolarını daha esnek ve okunabilir hale getirmek için kullanılır.
*/

    @Test
    public void test1(){

        InputValidationPage inputValidationPage = new InputValidationPage();

        Driver.getDriver().get(ConfigReader.getProperty("input_validation_url"));

        inputValidationPage.firstname.sendKeys("John");

        inputValidationPage.lastname.sendKeys("Doe");

        inputValidationPage.notes.sendKeys("Note 01");

        Driver.closeDriver();


    }

}