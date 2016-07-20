/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Abstractclas;

import java.util.Scanner;

/**
 *
 * @author Bini
 */
public class Calculation extends Calculator {
 int firstNumber, secondNumber;
    
    
    public void initializeNumber() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number");
        firstNumber= input.nextInt();
                
        System.out.println("Enter Second number");
        secondNumber= input.nextInt();
    }
    @Override
    public void add(){
           
       initializeNumber();
        System.out.println(firstNumber + secondNumber);
    }

    

    @Override
    public void Substract() {
   
       initializeNumber();
        System.out.println(firstNumber - secondNumber);
    }

    

    @Override
    public void divide() {
        initializeNumber();
        System.out.println(firstNumber / secondNumber);
    }
    @Override
    public void multiplication() {
        initializeNumber();
        System.out.println(firstNumber * secondNumber);
    }
    
}
