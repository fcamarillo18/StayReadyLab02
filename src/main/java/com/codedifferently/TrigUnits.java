package com.codedifferently;

public class TrigUnits {
    private String setMode;

    public TrigUnits(){
        this.setMode = "degrees";
    }

    public String getSetMode(){
        return this.setMode;
    }
    public void switchUnitsMode(){
        if(this.setMode == "degrees"){
            this.setMode = "radians";
        }
        else{
            this.setMode = "degrees";
        }
    }
    public void switchUnitsMode(String mode){
        this.setMode = mode.toLowerCase();
    }
} 