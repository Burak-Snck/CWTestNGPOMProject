package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactListContactPage {

    public ContactListContactPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "logout")
    public WebElement logout;

    @FindBy(id = "add-contact")
    public WebElement addContact;

    @FindBy(tagName = "h1")
    public WebElement header;


}