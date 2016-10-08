package com.java;

import com.java.classes.MathEquation;

/**
 * Created by Hector Vallejos Sanchez on 01/10/16.
 */
public class Main {

    public void example1(){
        int num1 = 7;
        int num2 = 5;
        //type name = condition ? value-true : value-false;
        String respuesta = num1>num2 ? num1+ " es mayor que "+num2 : num2+ " es mayor que "+num1;
        System.out.println(respuesta);
    }
    public void example2(){
        float students = 30.0f;
        float rooms = 3.0f;
        float resp = rooms == 0.0f ? 0.0f : students/rooms;
        System.out.println(resp);
    }
    public void example3(){
        int var1 = 9;
        int var2 = 9;
        if(var1 > var2)
            System.out.println(var1 + " it's bigger ");
        else if(var1 < var2)
            System.out.println(var2 +" it's bigger ");
        else
            System.out.println("The numbers are equals");
    }
    public void example4(){
        float students = 0.0f;
        float rooms = 4.0f;

        if(students > 0) {
            if (rooms > 0)
                System.out.println(students / rooms);
        }else
            System.out.println("No students");
    }
    public void calcEngine(){
        double var1 = 100;
        double var2 = 10;
        double result;
        char opCode = 'd';
        if(opCode == 'a')
            result = var1 + var2;
        else if(opCode == 's')
            result = var1 - var2;
        else  if(opCode == 'd')
            result = var2 != 0 ? var1/var2 : 0;
        else  if(opCode == 'm')
            result = var1 * var2;
        else {
            System.out.println("Error - invalid opCode");
            result = 0;
        }
        System.out.println(result);
    }
    // Loops
    public void loops(){
        // Loop while with example of factorial
        System.out.println("");
        System.out.println("Loop with while");
        int kval = 5;
        int factorial = 1;
        while(kval > 1){
            factorial *= kval--;
            //kval -= 1;
        }
        System.out.println("Factorial: "+ factorial);

        // Loop do while
        System.out.println("");
        System.out.println("Loop with do while");
        int ival = 10; // Siempre se ejecuta por lo menos 1 vez
        do{
            System.out.print(ival+" * 2 = ");
            ival *= 2;
            System.out.println(ival);

        }while (ival < 100);

        // Loop with for
        System.out.println("");
        System.out.println("Loop with for ");
        for (int val = 1; val < 100; val *= 2){
            System.out.println(val);
        }
    }
    public void arrays(){
        float[] thevals = {12.0f, 34.0f, 23.45f};
        float sum = 0.0f;
        for (int i = 0; i < thevals.length; i++){
            sum += thevals[i];
        }
        System.out.println("Suma con arrays ");
        System.out.println(sum);
    }
    public void forEach(){
        float[] thevals = {12.34f, 10.45f, 23.0f, 25.0f};
        float sum = 0.0f;
        for (float values: thevals){
            sum += values;
        }
        System.out.println("Suma forEach");
        System.out.println(sum);
    }
    public void swith(){
        System.out.println("Switch example");
        int ival = 25;
        switch (ival % 2){
            case 0:
                System.out.println(ival);
                System.out.println("is even");
                break;
            case 1:
                System.out.println(ival);
                System.out.println("is odd");
                break;
            default:
                System.out.println("oops it's broke");
        }
    }
    public void calsEngineUpdate(){
        double[] leftvals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightvals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'a', 's', 'd', 'm'};
        double[] results = new double[opCodes.length];
        for (int i = 0 ; i<opCodes.length; i++){
            switch(opCodes[i]){
                case 'a':
                    results[i] = leftvals[i] + rightvals[i];
                    break;
                case 's':
                    results[i] = leftvals[i] - rightvals[i];
                    break;
                case 'd':
                    results[i] = rightvals[i] != 0 ? leftvals[i]/rightvals[i] : 0.0d;
                    break;
                case 'm':
                    results[i] = leftvals[i] * rightvals[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    results[i] = 0.0d;
            }
        }
        System.out.println("Values for results");
        for (double values: results){
            System.out.println(values);
        }
    }
    /*
    public static MathEquation create(double leftVal, double rightVal, char opCode){
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;
        return equation;
    }
    */

    public static void main(String[] args) {
        Main obj = new Main();
        obj.example1();
        obj.example2();
        obj.example3();
        obj.example4();
        obj.calcEngine();
        obj.loops();
        obj.arrays();
        obj.forEach();
        obj.swith();

        //obj.calsEngineUpdate();
        // CalcEngine with class
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('a', 100.0d, 50.0d);
        equations[1] = new MathEquation('s', 25.0d, 92.0d);
        equations[2] = new MathEquation('d', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);
        for (MathEquation equation: equations){
            equation.execute();
            System.out.println("result = "+equation.result);
        }
    }
}
