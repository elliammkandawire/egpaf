/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ITGuest
 */
public class Question1 {

    public static ArrayList<Integer> createThirdArray(int x){
        ArrayList<Integer> thirdArray = new ArrayList<Integer>();
        int jumpNumber=2;
        int start_index=0;
        int end_index=2;
        
        for(int k=0; k<x; k++){
            if(x==start_index){
                thirdArray.add(2);
                start_index+=jumpNumber;
            }else if(x<end_index && k<=end_index){
                thirdArray.add(1);
            }else if(x>end_index){
                System.out.print("End is ");
                start_index=x;
                jumpNumber++;
                end_index=start_index+jumpNumber;
            }
            
            System.out.println("End index is "+end_index);
        }
        System.out.println("Array after adding element: "+thirdArray.toString());  
        return thirdArray;
    }
   
    public static void createSecondArray(int x){
        
    }
    
    public static void XArray(int x){
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X");
        int x = scanner.nextInt();
        createThirdArray(x);
    }
    
    
    
}
