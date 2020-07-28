package demo.testng;

import org.testng.annotations.Test;

public class PrioritizeTestCases {

    /** How to give priority for tests in testng
     * Ans : By using priority key word
     * By default the priority of all tests was 0 if not mentioned and tests execute in alphabetical order */

    @Test(priority = 3)
    public void ATest(){
        System.out.println("Method A....");
    }

    @Test(priority = 2)
    public void BTest(){
        System.out.println("Method B....");
    }

    @Test(priority = 1)
    public void CTest(){
        System.out.println("Method C....");
    }

    @Test(priority = 0)
    public void DTest(){
        System.out.println("Method D....");
    }
}
