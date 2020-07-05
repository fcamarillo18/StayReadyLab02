package com.codedifferently;

public class DisplayMode {
    private String mode;
    private String[] modeList = {"decimal", "hexadecimal", "octal", "binary"};
    private int index;

    // Default mode is decimal and contains a counter for the array
    public DisplayMode(){
        this.mode="decimal";
        this.index=0;
    }

    // Operations below
    public String getMode(){
        return this.mode;
    }

    public int getIndex(){
        return this.index;
    }

    public void switchMode(){
        this.index++;
        if(this.index>3)
            this.index=0;
        this.mode=this.modeList[index];
    }

    public void switchMode(String modeChange){
        modeChange=modeChange.toLowerCase();
        switch (modeChange) {
            case "decimal":
                this.mode=modeChange;
                this.index=0;
                break;
            case "hexadecimal":
                this.mode=modeChange;
                this.index=1;
                break;
            case "octal":
                this.mode=modeChange;
                this.index=2;
                break;
            case "binary":
                this.mode=modeChange;
                this.index=3;
                break;
            default:
                break;
        }
    }
} 