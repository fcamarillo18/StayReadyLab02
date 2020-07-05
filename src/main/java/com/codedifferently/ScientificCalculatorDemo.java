package com.codedifferently;

import java.util.Scanner;

public class ScientificCalculatorDemo {

    // Operations for users to choose
    static String menuOptions[] = {"1) add", "2) subract", "3) multiply", "4) divide"
        , "5) square root", "6) square", "7) exponent", "8) inverse", "9) invert"
        , "10) generate a random number", "11) sine", "12) cosine", "13) tangent"
        , "14) sine inverse", "15) cosine inverse", "16) tangent inverse", "17) factorial"
        , "18) absolute value", "19) switch trig units", "20) switch display mode"
        , "21) add to memory","22) pull memory", "23) clear memory", "24) clear screen", "25) Quit"};

    // Printing the operations menu
    static void printMenu(){
        System.out.println("------- Menu -------");
        for(int i = 0; i < menuOptions.length; i++){
			if(i % 5 != 0) {
                System.out.print(menuOptions[i] + "  ");
			}
			else {
				System.out.print(menuOptions[i] + "\n");
			}
        }
        System.out.println();
        System.out.print("Please select an operation: ");

    }

    // Checks if input was empty or not, return boolean
    static boolean inputCheck(String input){
        if(!(input.isBlank()))
            return true;
        else
            return false;
    }

    // ONLY OUTPUT/RESULT WILL BE CHANGED, accuracy will VARY
    // Returns result in desired mode
    static void modeCheck(double result,String currentMode){
        if(currentMode.equalsIgnoreCase("binary")){
            int convertedDouble=(int)(result);
            String binaryConversion=Integer.toBinaryString(convertedDouble);
            //Long doubleConverted=Double.doubleToRawLongBits(result);
            //String binaryConversion=Long.toBinaryString(doubleConverted);
            System.out.printf("Result in Binary: %s\n",binaryConversion);

        }
        else if(currentMode.equalsIgnoreCase("octal")){
            System.out.println("OCTAL MODE");
            int convertedDouble = (int)(result);
            String output= Integer.toOctalString(convertedDouble);
            System.out.printf("Result in Octal: %s\n",output);
        }
        else if(currentMode.equalsIgnoreCase("hexadecimal")){
            System.out.println("HEX MODE");
            //String output= Double.toHexString(result);
            int output=(int)(result);
            String out=Integer.toHexString(output);
            System.out.printf("Result in Hex: %s\n",out);

        }
    }

    // Scientific Calculator Demo
    public static void main(String[] args) {
        // Creating Scanner to keep track of user choice
        int userChoice = 0;
        Scanner scan = new Scanner(System.in);

        //Calculator created and starting interactions
        SciCalculator calculator = new SciCalculator();

        System.out.print("Enter value for calculator: ");
        double input = scan.nextDouble();
        calculator.updateDisplay(input);
        System.out.printf("Calculator Display: %s\n",calculator.getDisplayResult());
        printMenu();
        userChoice = scan.nextInt();

        //Check for valid option and perform operation
        while((userChoice >=1 && userChoice <= 24) || userChoice!=25){
            double currentValue=calculator.getDisplayResult();

            if(userChoice==1){
                System.out.print("Enter value to add: ");
                double num = scan.nextDouble();
                calculator.add(currentValue, num);

            }
            else if(userChoice==2){
                System.out.print("Enter value to subtract: ");
                double num = scan.nextDouble();
                calculator.subtract(currentValue, num);
            }
            else if(userChoice==3){
                System.out.print("Enter value to multiply: ");
                double num = scan.nextDouble();
                calculator.multiply(currentValue, num);

            }
            else if(userChoice==4){
                System.out.print("Enter value to divide: ");
                double num = scan.nextDouble();
                calculator.divide(currentValue, num);

            }
            else if(userChoice==5){
                System.out.print("Press enter to square root current value or enter new number: ");
                Scanner stringScan= new Scanner(System.in);
                String option=stringScan.nextLine();
                if(inputCheck(option)){
                    double num=Double.parseDouble(option);
                    calculator.squareRoot(num);
                }
                else
                    calculator.squareRoot(currentValue);

            }
            else if(userChoice==6){
                System.out.print("Press enter to square current value or enter new number: ");
                Scanner stringScan= new Scanner(System.in);
                String option=stringScan.nextLine();
                if(inputCheck(option)){
                    double num=Double.parseDouble(option);
                    calculator.square(num);
                }
                else
                    calculator.square(currentValue);

            }
            else if(userChoice==7){
                System.out.print("Enter exponent to apply: ");
                double num = scan.nextDouble();
                calculator.exponent(currentValue, num);

            }
            else if(userChoice==8){
                System.out.print("Press enter to inverse current value or enter new number: ");
                Scanner stringScan= new Scanner(System.in);
                String option=stringScan.nextLine();
                if(inputCheck(option)){
                    double num=Double.parseDouble(option);
                    calculator.inverse(num);
                }
                else
                    calculator.inverse(currentValue);

            }
            else if(userChoice==9){
                System.out.print("Press enter to invert current value or enter new number: ");
                Scanner stringScan= new Scanner(System.in);
                String option=stringScan.nextLine();
                if(inputCheck(option)){
                    double num=Double.parseDouble(option);
                    calculator.invert(num);
                }
                else
                    calculator.invert(currentValue);

            }
            else if(userChoice==10){
                System.out.print("Press min for random number: ");
                double min=scan.nextDouble();
                System.out.println();
                System.out.print("Press max for random number: ");
                double max=scan.nextDouble();
                calculator.generateRandNum(min, max);
                System.out.println("Random number generated to display");

            }
            else if(userChoice==11){
                System.out.print("Press enter to sine current value or enter new number: ");
                Scanner stringScan= new Scanner(System.in);
                String option=stringScan.nextLine();
                if(inputCheck(option)){
                    double num=Double.parseDouble(option);
                    calculator.sine(num);
                }
                else
                    calculator.sine(currentValue);

            }
            else if(userChoice==12){
                System.out.print("Press enter to cosine current value or enter new number: ");
                Scanner stringScan= new Scanner(System.in);
                String option=stringScan.nextLine();
                if(inputCheck(option)){
                    double num=Double.parseDouble(option);
                    calculator.cos(num);
                }
                else
                    calculator.cos(currentValue);

            }
            else if(userChoice==13){
                System.out.print("Press enter to tan current value or enter new number: ");
                Scanner stringScan= new Scanner(System.in);
                String option=stringScan.nextLine();
                if(inputCheck(option)){
                    double num=Double.parseDouble(option);
                    calculator.tan(num);
                }
                else
                    calculator.tan(currentValue);

            }
            else if(userChoice==14){
                System.out.print("Press enter to inverse sine current value or enter new number: ");
                Scanner stringScan= new Scanner(System.in);
                String option=stringScan.nextLine();
                if(inputCheck(option)){
                    double num=Double.parseDouble(option);
                    calculator.inverseSin(num);
                }
                else
                    calculator.inverseSin(currentValue);

            }
            else if(userChoice==15){
                System.out.print("Press enter to inverse cosine current value or enter new number: ");
                Scanner stringScan= new Scanner(System.in);
                String option=stringScan.nextLine();
                if(inputCheck(option)){
                    double num=Double.parseDouble(option);
                    calculator.inverseCos(num);
                }
                else
                    calculator.inverseCos(currentValue);

            }
            else if(userChoice==16){
                System.out.print("Press enter to inverse tan current value or enter new number: ");
                Scanner stringScan= new Scanner(System.in);
                String option=stringScan.nextLine();
                if(inputCheck(option)){
                    double num=Double.parseDouble(option);
                    calculator.inverseTan(num);
                }
                else
                    calculator.inverseTan(currentValue);

            }
            else if(userChoice==17){
                System.out.print("Press enter to factorial current value or enter new number: ");
                Scanner stringScan= new Scanner(System.in);
                String option=stringScan.nextLine();
                if(inputCheck(option)){
                    double num=Double.parseDouble(option);
                    calculator.factorial(num);
                }
                else
                    calculator.factorial(currentValue);

            }
            else if(userChoice==18){
                System.out.print("Press enter to absolute current value or enter new number: ");
                Scanner stringScan= new Scanner(System.in);
                String option=stringScan.nextLine();
                if(inputCheck(option)){
                    double num=Double.parseDouble(option);
                    calculator.abs(num);
                }
                else
                    calculator.abs(currentValue);

            }
            else if(userChoice==19){
                System.out.printf("Current Trig Units: %s\n",calculator.getTrigUnitsMode());
                System.out.println("Press enter to toggle another mode, or type desired mode");
                System.out.println("\"Radians\", \"Degrees\"");
                Scanner stringScan= new Scanner(System.in);
                String option=stringScan.nextLine();
                if(option.isBlank())
                    calculator.switchTrigUnits();
                else
                    calculator.switchTrigUnits(option);
                if(calculator.getTrigUnitsMode()=="radians"){
                    double convert=Math.toDegrees(calculator.getDisplayResult());
                    calculator.updateDisplay(convert);
                }
                else{
                    double convert=Math.toRadians(calculator.getDisplayResult());
                    calculator.updateDisplay(convert);
                }

            }
            else if(userChoice==20){
                System.out.printf("Current Display Mode: %s\n",calculator.getDisplayMode());
                System.out.println("ACCURACY WILL VARY, ROUNDED");
                System.out.println("Press enter to toggle another mode, or type desired mode");
                System.out.println("\"binary\", \"octal\", \"hexadecimal\", \"decimal\"");
                Scanner stringScan = new Scanner(System.in);
                String option=stringScan.nextLine();
                if(option.isBlank())
                    calculator.switchDisplayMode();
                else
                    calculator.switchDisplayMode(option);
            }
            else if(userChoice==21){
                calculator.addMem(currentValue);

            }
            else if(userChoice==22){
                System.out.println("Current value in memory: "+ calculator.getMem());

            }
            else if(userChoice==23){
                calculator.resetMemory();

            }
            else if(userChoice==24){
                calculator.clear();
            }
            // Continue asking user untill they quit
            System.out.println();
            modeCheck(calculator.getDisplayResult(),calculator.getDisplayMode());
            System.out.printf("Calculator Display: %s\n",calculator.getDisplayResult());
            printMenu();
            userChoice = scan.nextInt();
        }
        System.out.println("Calculator Closed");



    }
} 