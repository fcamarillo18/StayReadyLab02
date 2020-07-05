package com.codedifferently;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void calcTest(){
        //Given 
        Display testDisplay = new Display();
        double displayResult = testDisplay.getResult();
        //When
        Calculator testCalc = new Calculator();
        double calcDisplay = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(displayResult, calcDisplay,0.00001);
    }
    @Test
    public void updateDisplayTest(){
        //Given
        double result = 5.0;
        //When
        Calculator calc = new Calculator();
        calc.updateDisplay(5.0);
        double actualResult = calc.getDisplayResult();
        //Then
        Assert.assertEquals(result, actualResult, 0.00001);
    }

    @Test
    public void calcAddTest(){
        //Given
        double testResult = 5.0;
        //When
        Calculator testCalc = new Calculator();
        testCalc.add(3.0, 2.0);
       double actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult, 0.00001);
    }
    @Test
    public void calcSubtractTest(){
        //Given
        double testResult = 1.0;
        //When
        Calculator testCalc = new Calculator();
        testCalc.subtract(3.0, 2.0);
        double actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult,0.00001);
    }
    @Test
    public void calcMultiplyTest(){
        //Given
        double testResult = 6.0;
        //When
        Calculator testCalc = new Calculator();
        testCalc.multiply(3.0, 2.0);
        double actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult,0.00001);
    }
    @Test
    public void calcDivideTest(){
        //Given
        double testResult = 0.5;
        //When
        Calculator testCalc = new Calculator();
        testCalc.divide(2.0, 4.0);
        double actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult,0.00001);
    }
    @Test
    public void calcSquareTest(){
        //Given
        double testResult = 4.0;
        //When
        Calculator testCalc = new Calculator();
        testCalc.square(2.0);
        double actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult, 0.00001);
    }
    @Test
    public void calcExponentTest(){
        //Given
        double testResult = 8.0;
        //When
        Calculator testCalc = new Calculator();
        testCalc.exponent(2.0,3.0);
        double actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult,0.00001);
    }
    @Test
    public void calcSquareRootTest(){
        //Given
        double testResult = 12.0;
        //When
        Calculator testCalc = new Calculator();
        testCalc.squareRoot(144.0);
        double actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult,0.00001);
    }
    @Test
    public void calcInverseTest(){
        //Given
        double testResult = 0.5;
        //When
        Calculator testCalc = new Calculator();
        testCalc.inverse(2.0);
        double actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult,0.00001);
    }
    @Test
    public void calcInvertTest(){
        //Given
        double testResult = 2.0;
        //When
        Calculator testCalc = new Calculator();
        testCalc.invert(-2.0);
        double actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult, 0.00001);
    }

    @Test
    public void randomNumTest(){
        //Given
        boolean check = true;
        //When
        Calculator testC = new Calculator();
        testC.generateRandNum(11, 100);
        double actual = testC.getDisplayResult();
        //Then
        if(actual > 11.0 && actual < 100.0)
            Assert.assertEquals(check,true);
        else{
            Assert.assertEquals(check,false);
        }
    }

} 