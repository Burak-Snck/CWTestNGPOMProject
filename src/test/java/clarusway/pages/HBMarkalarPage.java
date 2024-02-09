package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HBMarkalarPage {


    public HBMarkalarPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//input[@name='markalar']")
    public List<WebElement> markalar;



}