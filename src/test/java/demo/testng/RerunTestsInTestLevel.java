package demo.testng;

import analyzer.RetryLogic;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunTestsInTestLevel {

    @Test(retryAnalyzer = RetryLogic.class)
    public void sampleOne(){
        System.out.println("Sample one");
        Assert.assertEquals(1,2);
    }

    @Test
    public void sampleTwo(){
        System.out.println("Sample two");
        Assert.assertEquals(1,1);
    }
}
