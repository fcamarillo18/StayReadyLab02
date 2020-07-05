package com.codedifferently;
import org.junit.Assert;
import org.junit.Test;

public class DisplayTest {
    @Test
    public void resultTest(){
        //Given
        double result = 0.0;

        //When

        Display testDisplay = new Display();
        double actualResult = testDisplay.getResult();

        //Then

        Assert.assertEquals(result, actualResult,0.00001);
    }
    @Test
    public void updateResultTest(){
        //Given
        double result = 2.0;
        //When
        Display testDisplay = new Display();
        testDisplay.updateResult(2.0);
        double  actualResult = testDisplay.getResult();
        //Then
        Assert.assertEquals(result, actualResult,0.00001);
    }
} 