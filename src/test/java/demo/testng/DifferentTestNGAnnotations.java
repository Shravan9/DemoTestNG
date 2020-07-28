package demo.testng;

import org.testng.annotations.*;

public class DifferentTestNGAnnotations {
    /** Annotations in TestNG:
     * @BeforeSuite
     * @BeforeTest
     * @BeforeClass
     * @BeforeMethod
     *
     * @Test
     *
     * @AfterMethod
     * @AfterClass
     * @AfterTest
     * @AfterSuite
     *
     * @BeforeGroups
     * @AfterGroups
     *
     *
     *
     * @DataProvider
     * @Factory
     * @Listeners
     * @Parameters
     * */

    @Test(groups={"Smoke"})
    public void sampleTest1(){
        System.out.println("Sample Test One....");
    }

    @Test(groups={"Regression"})
    public void sampleTest2(){
        System.out.println("Sample Test Two....");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite....");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite....");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class ....");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class ....");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method....");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method....");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test....");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test....");
    }

    @BeforeGroups(groups={"Smoke"})
    public void beforeSmokeGroups(){
        System.out.println("Before Smokes Group....");
    }

    @AfterGroups(groups={"Smoke"})
    public void afterSmokeGroups(){
        System.out.println("After Smokes Group....");
    }

    @BeforeGroups(groups={"Regression"})
    public void beforeRegressionGroups(){
        System.out.println("Before Regression Group....");
    }

    @AfterGroups(groups={"Regression"})
    public void afterRegressionGroups(){
        System.out.println("After Regression Group....");
    }
}
