package com.codedifferently;


public class Calculator {
    private Display display;

    // Display to grab/update results
    public Calculator(){
        this.display=new Display();
    }

    // Operations below
    public double getDisplayResult(){
        return this.display.getResult();
    }

    public void clear(){
        this.display.updateResult(0.0);
    }

    public void updateDisplay(double result){
        this.display.updateResult(result);
    }

    public void add(double num1, double num2){
        double result = num1 + num2;
        this.display.updateResult(result);
    }

    public void subtract(double num1, double num2){
        double result = num1 - num2;
        this.display.updateResult(result);
    }

    public void multiply(double num1, double num2){
        double result = num1 * num2;
        this.display.updateResult(result);
    }

    public void divide(double num1, double num2){
        double result = num1 / num2;
        this.display.updateResult(result);
    }

    public void square(double num){
        double result = Math.pow(num, 2);
        this.display.updateResult(result);
    }

    public void exponent(double num, double power){
        double result = Math.pow(num,power);
        this.display.updateResult(result);
    }

    public void squareRoot(double num){
        double result = Math.sqrt(num);
        this.display.updateResult(result);
    }

    public void inverse(double num){
        double result = 1 / num;
        this.display.updateResult(result);
    }

    public void invert(double num){
        double result = - num;
        this.display.updateResult(result);
    }

    public void generateRandNum(double min, double max){
        double result = Math.random() * max + min ;
        this.display.updateResult(result);
    }
}