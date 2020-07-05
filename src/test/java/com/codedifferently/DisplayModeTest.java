package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class DisplayModeTest {
    
    @Test
    public void modeTest(){
        // Given
        int index=0;
        String mode="decimal";
        // When
        DisplayMode testM = new DisplayMode();
        int actualIndex=testM.getIndex();
        String actualMode=testM.getMode();
        // Then
        Assert.assertEquals(index, actualIndex);
        Assert.assertEquals(mode, actualMode);
    }

    @Test
    public void randModeTest(){
        // Given
        int index=2;
        String mode="octal";
        // When
        DisplayMode testM = new DisplayMode();
        testM.switchMode();
        testM.switchMode();
        int actualIndex=testM.getIndex();
        String actualMode=testM.getMode();
        // Then
        Assert.assertEquals(index, actualIndex);
        Assert.assertEquals(mode, actualMode);
    }

    @Test
    public void assignedModeTest(){
        // Given
        int index=2;
        String mode="octal";
        // When
        DisplayMode testM = new DisplayMode();
        testM.switchMode("octal");
        int actualIndex=testM.getIndex();
        String actualMode=testM.getMode();
        // Then
        Assert.assertEquals(index, actualIndex);
        Assert.assertEquals(mode, actualMode);
    }


} 