package com.codedifferently;
import org.junit.Assert;
import org.junit.Test;

public class TrigUnitsTest {
    @Test
    public void trigTest(){
        //Given
        String setMode = "degrees";
        //When
        TrigUnits units = new TrigUnits(); 
        String actualMode = units.getSetMode();
        //Then
        Assert.assertEquals(setMode, actualMode);
    }
    @Test
    public void switchUnitsTest(){
        //Given
        String setMode = "radians";
        //When
        TrigUnits units = new TrigUnits(); 
        units.switchUnitsMode();
        String actualMode = units.getSetMode();
        //Then
        Assert.assertEquals(setMode,actualMode);
    }
    @Test
    public void switchUnitsStringTest(){
        //Given
        String setMode = "radians";
        //When
        TrigUnits units = new TrigUnits(); 
        units.switchUnitsMode("Radians");
        String actualMode = units.getSetMode();
        //Then
        Assert.assertEquals(setMode,actualMode);
    }
} 