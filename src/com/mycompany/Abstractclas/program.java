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
public class program {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu();
        
        int choice;
        System.out.println("Enter your choice");
         choice=input.nextInt();
         
         Calculatorfactory calculationFactory= new Calculatorfactory();
         calculationFactory.calculator(choice);
    }
public static void menu()
    {
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
    }
    /**
     * @param args the command line arguments
     */
    
    }
    

