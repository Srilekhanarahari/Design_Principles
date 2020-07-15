package com.epam.Design_Principles;
import java.util.*;

/**
 * Hello world!
 *
 */
public class Calculator 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();int a = sc.nextInt(); int b = sc.nextInt();
        switch (x){
            case 1:
                Addition add = new Addition();
                add.addition(a,b);
                break;
            case 2:
                Subtract sub = new Subtract();
                sub.subtraction(a,b);
                break;
            case 3:
                Multiply mul = new Multiply();
                mul.multi(a,b);
                break;
            case 4:
                Div div = new Div();
                div.division(a,b);
                break;
        }
    }
}
