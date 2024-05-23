package automation.hooks;

import automation.utils.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {

    private TestBase testBase;

    public MyHooks(TestBase testBase) {
        this.testBase = testBase;

    }

    @Before
    public void initializeTest() {
        System.out.println("Tests Started");
        testBase.initializeDriver();
    }

//    @After
//    public void finalizeTests() {
//        System.out.println("Tests finished");
//        testBase.closeDriver();
//    }
}
