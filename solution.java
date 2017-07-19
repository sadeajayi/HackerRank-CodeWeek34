import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    static int sumOfDigits(int x){
     int sum = 0;
      while (x != 0) {
        sum += x %10;
        x   = x /10;
      }
      return sum;
    }

    static String onceInATram(int x) {
        int temp = 0;
        int lastThree = x % 1000;
        int firstThree = x/1000;
        
        StringBuilder sb = new StringBuilder();
        //Attempts to check for when sum on right side less than sum on left
       /* if(sumOfDigits(firstThree) > sumOfDigits(lastThree)){
            int difference = sumOfDigits(firstThree) - sumOfDigits(lastThree);
            lastThree+= difference;
            return"";
        }
       */
        
        //Testcase for : 555555
        while(lastThree < x ) {   
            lastThree++;
            if(sumOfDigits(lastThree) == sumOfDigits(firstThree)){
                break;
            } 
        }
        
        return sb.append(firstThree + "" + lastThree).toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }
}
