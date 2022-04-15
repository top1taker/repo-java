package date_18_3;

import java.util.Scanner;
public class Bai3
{
    public static void main(String[] args)
    {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of characters: ");
        int n = input.nextInt();
        
        char[] arrChar = new char[n];
        
        for (int i = 0; i < arrChar.length; i++) {
        	arrChar[i] = input.next().charAt(0);
        }
   
        // Character input
        String str = arrChar.toString();
        System.out.println("Array of characters after convert to string " + str);
        
        input.close();
   
      
    }
}