package automation.hooks;

import automation.utils.TestBase;
import io.cucumber.java.Before;

public class TestExecutionHooks {
    private TestBase testBase;


    public TestExecutionHooks(TestBase testBase) {
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
