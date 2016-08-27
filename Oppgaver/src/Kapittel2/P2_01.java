package Kapittel2;

import java.util.Scanner;

/**
 * Created by RakNoel on 26.08.2016.
 */

public class P2_01 {
    public static void main(String[] args){
        //Letter in inches
        double inputHeight, inputWidth;

        //Open system scanner
        Scanner input = new Scanner(System.in);

        //Use user input
        System.out.println("This program wil convert a letter size from inch to mm");
        System.out.println("Please input letter Height: #,##");
        inputHeight = input.nextDouble();

        System.out.println("Now input letter Width: #,##");
        inputWidth = input.nextDouble();

        //Return anwser
        System.out.println("---------------------------------------------------");
        System.out.println("A letter with the size: " + inputHeight + "'' X " + inputWidth + "''");

        double[] placeholder = convert(inputHeight, inputWidth);
        System.out.println("equals " + placeholder[0] + "mm X " + placeholder[1] + "mm");

    }

    public static double[] convert(double height, double width) {
        //This function will return the converted value of the letter as an array
        final double inchToMill = 25.4;
        double[] converted = {(height*inchToMill), width*inchToMill};

        return converted;

    }
}
