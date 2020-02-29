/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Findfibonnaci;


public class fibonnacci {
    static int n1 = 0, n2 = 1, n3 = 0;
    static void printfib(int count)
    {
        if(count > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printfib(count-1);
        }
    }
    public static void main(String[] args)
    {
        int count = 10;
        
        System.out.print(n1 + " " + n2);
        printfib(count-2);
        System.out.println();
    }
}
