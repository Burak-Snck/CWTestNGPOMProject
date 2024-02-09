package clarusway.tests;

import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import org.testng.annotations.Test;

public class C02_UseConfigerReader {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("clarusway_url"));

        Driver.getDriver().get(ConfigReader.getProperty("contact_list_app"));

        Driver.closeDriver();


    }


}
