package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class InputValidationPage {


    public InputValidationPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "firstname")//Tek bir locator kullanılacağı zaman tercih edilir.
    public WebElement firstname;

    @FindBys({// AND operator gibi alttaki tüm locator'ların bulunması gerekiyor. Eğer bir locator bulunamazsa NoSuchElementException atar.
            @FindBy(id = "surname"),
            @FindBy(xpath = "//input[@name='surname']")
    })
    public WebElement lastname;


    @FindAll({//OR operator gibi seçeneklerden birinin locate edilebilmesi web elementin bulunanması yeterlidir. Tüm locatorlar bulunamazsa NoSuchElementException atar.
            @FindBy(id = "notes"),
            @FindBy(xpath = "//textarea[@maxlength='2000']"),
            @FindBy(name = "notes")
    })
    public WebElement notes;







}