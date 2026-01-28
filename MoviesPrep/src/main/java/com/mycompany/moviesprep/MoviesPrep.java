/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.moviesprep;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class MoviesPrep {

    public static void main(String[] args) {
        // to print when given the values 
        
        int [][] ticketSales = {{2100,1800,2400},
                              {3200,2600,2900}};
      String [] months = {"JAN","FEB","MAR"};
      String [] name = {"Avatar","Titanic"};
      
      //to input the values
      int [][] movieInput = new int[2][3];
      Scanner sc = new Scanner(System.in);
      
      
      //To populate the array 
      
      
        for (int i = 0; i < name.length; i++) {
            
            for (int j = 0; j < months.length; j++) {
                System.out.println("Enter the Ticket sold for "+ name[i] + " for " +months[j]);
            
            int userInput = sc.nextInt();
            
            movieInput[i][j] = userInput;
            
            }
        
        }
                 
               
      //printing tha Array
        System.out.println(" MOVIE TICKET SALES REPORT ");
        System.out.println("******************************************************");
        
        System.out.println("\t" + months[0] +"\t" + months[1] +"\t" + months[2]);   // to print the 1st row ( months)
      
        for (int i = 0; i < name.length ; i++) {  // to print the 1st column (movie name)    
            System.out.print(name[i]); 
            
            for (int j = 0; j < movieInput[i].length; j++) {    // to print the values in the 
                System.out.print("\t" + movieInput[i][j]);
                
            }
            System.out.println(""); //to print the second movie 
            
        }
        // to print 
        for (int i = 0; i < movieInput.length; i++) {
            
           int total = 0;
           
            for (int j = 0; j < movieInput[i].length ; j++) {
                
                total = total + movieInput[i][j];
            }
            System.out.println("THE TOTAL MOVIE TICKET SALES FOR "+ name[i] + " + "+ total);
        }
        
        for (int i = 0; i <months.length; i++) {
            int total2 = 0;
            
            for (int j = 0; j < name.length; j++) {
                total2 = total2 + movieInput[j][i];
                
            }
             System.out.println("THE TOTAL MOVIE TICKET SALES FOR "+ months[i] + " = "+ total2);
        }
 
    }
    
    
}
    

