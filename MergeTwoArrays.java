
import java.util.Arrays; 
  
public class MergeTwoArrays { 
    public static void main(String[] args) 
    { 
        // array - 1
        int[] a = { 2, 5, 8, 9 }; 
  
        // array - 2 
        int[] b = { 15, 3, 7, 12 }; 
  
        
        int a1 = a.length; 
        

        int b1 = b.length; 
        
        // array size 
        int c1 = a1 + b1; 
  
        // create resultant array 
        int[] c = new int[c1]; 
  

        System.arraycopy(a, 0, c, 0, a1); 
        System.arraycopy(b, 0, c, a1, b1); 
  
        // prints the resultant array 
        System.out.println(Arrays.toString(c)); 
    } 
}