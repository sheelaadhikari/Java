//Q.N. 3
//prepared by Sheela Adhikari
//Roll no: 27
package firstsession;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class ascendingOrder
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;   
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();    
        Integer arr[]=new Integer[n];    
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)   
        {
            arr[i]=sc.nextInt();
        }
        
        int temp = 0;   
         for (int i = 0; i < arr.length; i++)   
         {     
            for (int j = i+1; j < arr.length; j++)    
            {     
               if(arr[i] > arr[j]) 
               {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
       	  
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) 
        {     
            System.out.print(arr[i] + " ");    
        }    
    }
}
