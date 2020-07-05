package com.codedifferently;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class SciCalculatorTest 
{
 
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    public void sciCalcTest(){
        //Given
        double resultDis = 0.0;
        double resultMem = 0.0;
        String displayMode="decimal";
        String setMode = "Degrees";
        //When
        SciCalculator testC = new SciCalculator();
        double actualDis = testC.getDisplayResult();
        double actualMem = testC.getMem();
        String actualDisplayMode = testC.getDisplayMode();
        String actualSetMode = testC.getTrigUnitsMode();
        //Then
        Assert.assertEquals(resultDis, actualDis,0.00001);
        Assert.assertEquals(resultMem, actualMem, 0.00001);
        Assert.assertEquals(displayMode, actualDisplayMode);
        Assert.assertEquals(setMode, actualSetMode);

    }

    @Test
    public void memAddTest(){
        //Given
        double resultMem = 10.00;
        //When
        SciCalculator testC = new SciCalculator();
        testC.addMem(10.00);
        double actualMem = testC.getMem();
        //Then
        Assert.assertEquals(resultMem, actualMem, 0.00001);
    }

    @Test
    public void memClearTest(){
        //Given
        double resultMem = 0.0;
        //When
        SciCalculator testC = new SciCalculator();
        testC.addMem(10.00);
        testC.resetMemory();
        double actualMem = testC.getMem();
        //Then
        Assert.assertEquals(resultMem, actualMem, 0.00001);
    }

    @Test
    public void switchDisplayTest(){
        //Given
        String mode = "hexadecimal";
        //When
        SciCalculator testC = new SciCalculator();
        testC.switchDisplayMode();
        String actualMode=testC.getDisplayMode();
        //Then
        Assert.assertEquals(mode,actualMode);
    }

    @Test
    public void assignDisplayTest(){
        //Given
        String mode = "binary";
        //When
        SciCalculator testC = new SciCalculator();
        testC.switchDisplayMode("binary");
        String actualMode=testC.getDisplayMode();
        //Then
        Assert.assertEquals(mode,actualMode);
    }

    @Test
    public void changeTrigUnitsTest(){
        //Given
        String trigMode = "Radians";

        //When
        SciCalculator calc = new SciCalculator();
        calc.switchTrigUnits();
        String actualMode = calc.getTrigUnitsMode();

        //Then
        Assert.assertEquals(trigMode, actualMode);
    }  
    @Test
    public void changeTrigUnitsStringTest(){
        //Given
        String trigMode = "Radians";

        //When
        SciCalculator calc = new SciCalculator();
        calc.switchTrigUnits("Radians");
        String actualMode = calc.getTrigUnitsMode();

        //Then
        Assert.assertEquals(trigMode, actualMode);
    }

    @Test
    public void sinTest(){
        //Given
        double num= Math.sin(10.0);
        double degree=Math.toDegrees(num);
        double radians=Math.toRadians(num);

        //When
        SciCalculator calc = new SciCalculator();
        calc.sine(10.0);
        double actualDegree = calc.getDisplayResult();
        calc.switchTrigUnits();
        calc.sine(10.0);
        double actualRadians= calc.getDisplayResult();

        //Then
        Assert.assertEquals(degree, actualDegree,0.00001);
        Assert.assertEquals(radians, actualRadians,0.00001);
    }

    @Test
    public void cosTest(){
        //Given
        double num= Math.cos(10.0);
        double degree=Math.toDegrees(num);
        double radians=Math.toRadians(num);

        //When
        SciCalculator calc = new SciCalculator();
        calc.cos(10.0);
        double actualDegree = calc.getDisplayResult();
        calc.switchTrigUnits();
        calc.cos(10.0);
        double actualRadians= calc.getDisplayResult();

        //Then
        Assert.assertEquals(degree, actualDegree,0.00001);
        Assert.assertEquals(radians, actualRadians,0.00001);
    }

    @Test
    public void tanTest(){
        //Given
        double num= Math.tan(10.0);
        double degree=Math.toDegrees(num);
        double radians=Math.toRadians(num);

        //When
        SciCalculator calc = new SciCalculator();
        calc.tan(10.0);
        double actualDegree = calc.getDisplayResult();
        calc.switchTrigUnits();
        calc.tan(10.0);
        double actualRadians= calc.getDisplayResult();

        //Then
        Assert.assertEquals(degree, actualDegree,0.00001);
        Assert.assertEquals(radians, actualRadians,0.00001);
    }

    @Test
    public void inverseTanTest(){
        //Given
        double num= Math.atan(10.0);
        double degree=Math.toDegrees(num);
        double radians=Math.toRadians(num);


        //When
        SciCalculator calc = new SciCalculator();
        calc.inverseTan(10.0);
        double actualDegree = calc.getDisplayResult();
        calc.switchTrigUnits();
        calc.inverseTan(10.0);
        double actualRadians= calc.getDisplayResult();

        //Then
        Assert.assertEquals(degree, actualDegree,0.00001);
        Assert.assertEquals(radians, actualRadians,0.00001);
    }

    @Test
    public void inverseCosTest(){
        //Given
        double num= Math.acos(10.0);
        double degree=Math.toDegrees(num);
        double radians=Math.toRadians(num);

        //When
        SciCalculator calc = new SciCalculator();
        calc.inverseCos(10.0);
        double actualDegree = calc.getDisplayResult();
        calc.switchTrigUnits();
        calc.inverseCos(10.0);
        double actualRadians= calc.getDisplayResult();

        //Then
        Assert.assertEquals(degree, actualDegree,0.00001);
        Assert.assertEquals(radians, actualRadians,0.00001);
    }

    @Test
    public void inverseSinTest(){
        //Given
        double num= Math.asin(10.0);
        double degree=Math.toDegrees(num);
        double radians=Math.toRadians(num);

        //When
        SciCalculator calc = new SciCalculator();
        calc.inverseSin(10.0);
        double actualDegree = calc.getDisplayResult();
        calc.switchTrigUnits();
        calc.inverseSin(10.0);
        double actualRadians= calc.getDisplayResult();

        //Then
        Assert.assertEquals(degree, actualDegree,0.00001);
        Assert.assertEquals(radians, actualRadians,0.00001);
    }

    @Test
    public void absTest(){
        //Given
        double result=-24.23;
        result=Math.abs(result);
        //When
        SciCalculator testC = new SciCalculator();
        testC.abs(-24.23);
        double actual = testC.getDisplayResult();
        //Then
        Assert.assertEquals(result, actual,0.00001);
    }

    @Test
    public void factorialTest(){
        //Given
        double result=720.0;
        //When
        SciCalculator testC = new SciCalculator();
        testC.factorial(6);
        double actual = testC.getDisplayResult();
        //Then
        Assert.assertEquals(result, actual,0.00001);
    }


}