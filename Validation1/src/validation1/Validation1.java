
 
package validation1;

import java.util.*;
 
 
public class Validation1 {

   
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        double agetotal = 0;
        for(int i = 0 ; i<(10); i++){
            
            
            double age;
            System.out.println("Input age as int :");
            
            agetotal = agetotal + input.nextDouble();
            
        }
        
        System.out.println((agetotal) / (10));

    }
    }
    

