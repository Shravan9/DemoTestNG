package demo.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunFailedTestAtRunTime {

    @Test
    public void sampleOne(){
        System.out.println("Sample one");
        Assert.assertEquals(1,1);
    }

    @Test
    public void sampleTwo(){
        System.out.println("Sample one");
        Assert.assertEquals(1,2);
    }
}