package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {
    @Test
    public void memoryTest(){
        // Given
        double memoryValue = 0.0;

        // When
        Memory testMem = new Memory();
        double actualValue = testMem.getMemVal();

        // Then
        Assert.assertEquals(memoryValue, actualValue, 0.00001);


    }

    @Test
    public void addToMemTest(){
        // Given
        double memoryValue = 10.0;

        // When
        Memory testMem = new Memory();
        testMem.addToMem(10.0);
        double actualValue = testMem.getMemVal();

        // Then
        Assert.assertEquals(memoryValue, actualValue, 0.00001);


    }

    @Test
    public void resetMemTest(){
        // Given
        double memoryValue = 0.0;

        // When
        Memory testMem = new Memory();
        testMem.addToMem(10.0);
        testMem.resetMem();
        double actualValue = testMem.getMemVal();

        // Then
        Assert.assertEquals(memoryValue, actualValue, 0.00001);


    }




} 