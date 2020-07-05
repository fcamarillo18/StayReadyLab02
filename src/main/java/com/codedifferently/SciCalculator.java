package com.codedifferently;

public class SciCalculator extends Calculator
{

    private Memory memory;
    private DisplayMode displayMode;
    private TrigUnits trigUnits;

    // Set-up of the Scientific calculator, contains calculator
    public SciCalculator(){
        this.memory = new Memory();
        this.displayMode = new DisplayMode();
        this.trigUnits = new TrigUnits();
    }

    // Operations below
    public String getDisplayMode(){
        return this.displayMode.getMode();
    }
    public String getTrigUnitsMode(){
        return this.trigUnits.getSetMode();
    }
    public void switchTrigUnits(){
        this.trigUnits.switchUnitsMode();
    }
    public void switchTrigUnits(String mode){
        this.trigUnits.switchUnitsMode(mode);

    }
    public void switchDisplayMode(){
        this.displayMode.switchMode();
    }

    public void switchDisplayMode(String modeChange){
        this.displayMode.switchMode(modeChange);
    }

    public double getMem(){
        return this.memory.getMemVal();
    }

    public void addMem(double num){
        this.memory.addToMem(num);
    }

    public void resetMemory(){
        this.memory.resetMem();
    }

    public void sine(double num){
        double radians = Math.toRadians(num);
        double result = Math.sin(radians);
        super.updateDisplay(result);
    }

    public void tan(double num){
        double radians = Math.toRadians(num);
        double result = Math.tan(radians);
        super.updateDisplay(result);
    }

    public void cos(double num){
        double radians = Math.toRadians(num);
        double result = Math.cos(radians);
        super.updateDisplay(result);
    }

    public void inverseCos(double num){
        double radians = Math.toRadians(num);
        double result = Math.acos(radians);
        super.updateDisplay(result);
    }

    public void inverseSin(double num){
        double radians = Math.toRadians(num);
        double result = Math.asin(radians);
        super.updateDisplay(result);
    }

    public void inverseTan(double num){
        double radians = Math.toRadians(num);
        double result = Math.atan(radians);
        super.updateDisplay(result);
    }

    public void abs(double num){
        double result=Math.abs(num);
        super.updateDisplay(result);
    }

    public int factorialRec(int num){
        if(num==0)
            return 1;
        else
            return factorialRec(num-1) * num;
    }

    public void factorial(double num){
        int num2 = (int)(num); 
        double result=factorialRec(num2);
        super.updateDisplay(result);
    }


}
