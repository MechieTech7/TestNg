package basicPractise;

import org.testng.annotations.*;

public class AnnotationExecutionHierarchy {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I'm appears First");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("I'm appears Second");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("I'm appears Third");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I'm appears Fourth");
    }

    @Test
    public void Test(){
        System.out.println("I'm a Hero here");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I'm appears Fifth");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I'm appears sixth");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("I'm appears Seventh");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("I'm appears Last");
    }
}
