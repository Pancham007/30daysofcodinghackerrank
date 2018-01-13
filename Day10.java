import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n,sum=0,max=0;
        n=sc.nextInt();
        while(n>0)
        {
        if(n%2==1)
        {
            sum+=1;
            n=n/2;
            if (sum > max) {
                    max = sum;
                }
        }
            else
            {
                n=n/2;
                sum=0;
            }
                
        }
        System.out.println(max);
    }
    
}