/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.Abstractclas;

/**
 *
 * @author Bini
 */
public class Calculatorfactory {
    Calculation caLculation= new calculation();
     public void calculator(int choice)
    {
        
        if(choice == 1)
        {
            caLculation.add();
        }
        else if (choice==2)
        {
        caLculation.Substract();
        }
        else if (choice==3)
        {
        caLculation.multiplication();
        }
        else
        {
        caLculation.divide();
        }
    }

    private static class calculation extends Calculation {

        public calculation() {
        }
    }
}
