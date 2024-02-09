package clarusway.tests;

import clarusway.utilities.Driver;
import org.testng.annotations.Test;

public class C01_UseDriverClass {
    @Test

    public void test01() {
        Driver.getDriver().get("https://clarusway.com/");
        String title = Driver.getDriver().getTitle();
        System.out.println(title);
        Driver.closeDriver();


    }
}
