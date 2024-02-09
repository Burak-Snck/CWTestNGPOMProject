package clarusway.tests;


import clarusway.pages.DhtmlPage;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import clarusway.utilities.ExtentReportUtils;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class C04_Example {
    /*
    Go to http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    Drag and drop capitals
     */

    @Test
    public void exampleTest(){
        DhtmlPage dhtmlPage = new DhtmlPage();

        ExtentReportUtils.createTestReport("Drag and drop Test", "Capitals");

        Driver.getDriver().get(ConfigReader.getProperty("dhtmlgoodies_url"));

        ExtentReportUtils.passAndCaptureScreenshot("User is on homepage");

        Actions actions = new Actions(Driver.getDriver());

        actions
                .dragAndDrop(dhtmlPage.oslo, dhtmlPage.norway)
                .dragAndDrop(dhtmlPage.copenhagen, dhtmlPage.denmark)
                .dragAndDrop(dhtmlPage.madrid, dhtmlPage.spain)
                .dragAndDrop(dhtmlPage.rome, dhtmlPage.italy)
                .dragAndDrop(dhtmlPage.stockholm, dhtmlPage.sweden)
                .dragAndDrop(dhtmlPage.seoul, dhtmlPage.korea)
                .dragAndDrop(dhtmlPage.washington, dhtmlPage.usa)
                .perform();

        ExtentReportUtils.passAndCaptureScreenshot("Darg and drop is done");

        Driver.closeDriver();

        ExtentReportUtils.flush();

    }


}