package com.codedifferently;

public class Display {
    private double result;

    // Display is displayed as a String
    public Display(){
        this.result = 0.0;
    }

    // Operations below
    public double getResult(){
        return this.result;
    }

    public void updateResult(double newResult){
        this.result=newResult;
    }

} 